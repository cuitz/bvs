package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysMenu;
import cc.cuitz.bvs.entity.SysRoleMenu;
import cc.cuitz.bvs.entity.SysUser;
import cc.cuitz.bvs.entity.SysUserRole;
import cc.cuitz.bvs.mapper.SysMenuMapper;
import cc.cuitz.bvs.mapper.SysRoleMenuMapper;
import cc.cuitz.bvs.mapper.SysUserMapper;
import cc.cuitz.bvs.mapper.SysUserRoleMapper;
import cc.cuitz.bvs.service.LoginService;
import cc.cuitz.bvs.vo.LoginInfo;
import cc.cuitz.bvs.vo.LoginParam;
import cn.dev33.satoken.session.SaSession;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.security.auth.login.FailedLoginException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SysUserRoleMapper userRoleMapper;

    @Resource
    private SysRoleMenuMapper roleMenuMapper;

    @Resource
    private SysMenuMapper menuMapper;

    @Override
    public LoginInfo login(LoginParam loginParam) throws FailedLoginException {
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysUser::getUsername, loginParam.getUsername());
        SysUser user = sysUserMapper.selectOne(queryWrapper);
        if (user == null) {
            throw new FailedLoginException("用户名或密码错误");
        }
        boolean loginResult = BCrypt.checkpw(loginParam.getPassword(), user.getPassword());
        if (!loginResult) {
            throw new FailedLoginException("用户名或密码错误");
        }
        StpUtil.login(user.getUsername());
        StpUtil.getSession().set(SaSession.USER, user);
        // 查询用户关联的菜单
        LambdaQueryWrapper<SysUserRole> sysUserRoleLambdaQueryWrapper = new LambdaQueryWrapper<>();
        sysUserRoleLambdaQueryWrapper.eq(SysUserRole::getUserId, user.getId());
        SysUserRole sysUserRole = userRoleMapper.selectOne(sysUserRoleLambdaQueryWrapper);
        LambdaQueryWrapper<SysRoleMenu> sysRoleMenuLambdaQueryWrapper = new LambdaQueryWrapper<>();
        sysUserRoleLambdaQueryWrapper.eq(SysUserRole::getRoleId, sysUserRole.getId());
        List<SysRoleMenu> sysRoleMenus = roleMenuMapper.selectList(sysRoleMenuLambdaQueryWrapper);
        List<Integer> menuId = sysRoleMenus.stream().map(SysRoleMenu::getMenuId).collect(Collectors.toList());
        LambdaQueryWrapper<SysMenu> sysMenuLambdaQueryWrapper = new LambdaQueryWrapper<>();
        sysUserRoleLambdaQueryWrapper.in(SysUserRole::getId, menuId);
        List<SysMenu> sysMenus = menuMapper.selectList(sysMenuLambdaQueryWrapper);
        LoginInfo loginInfo = new LoginInfo();
        loginInfo.setMenus(sysMenus);
        loginInfo.setTokenInfo(StpUtil.getTokenInfo());
        return loginInfo;
    }
}
