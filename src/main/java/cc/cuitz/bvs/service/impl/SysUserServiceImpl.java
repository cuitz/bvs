package cc.cuitz.bvs.service.impl;

import cc.cuitz.bvs.entity.SysUser;
import cc.cuitz.bvs.mapper.SysUserMapper;
import cc.cuitz.bvs.service.SysUserService;
import cc.cuitz.bvs.vo.common.PageParam;
import cc.cuitz.bvs.vo.common.QueryParam;
import cn.hutool.core.date.DateUtil;
import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 用户表(SysUser)服务实现类
 *
 * @author cuitongzhe
 * @since 2023-03-20 15:23:09
 */
@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    /**
     * 分页查询数据
     *
     * @param queryParam 查询参数
     * @return 分页数据
     */
    @Override
    public PageInfo<SysUser> page(QueryParam<SysUser> queryParam) {
        PageParam pageParam = queryParam.getPageParam();
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), pageParam.getOrderBy());
        List<SysUser> data = list(new QueryWrapper<>(queryParam.getCondition()));
        return new PageInfo<>(data);
    }

    @Override
    public void createUser(SysUser sysUser) {
        // 校验用户名是否存在
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysUser::getUsername, sysUser.getUsername());
        long count = count(queryWrapper);
        if (count > 0) {
            throw new RuntimeException("用户名已被占用");
        }
        // 加密
        String salt = BCrypt.gensalt();
        String hashed = BCrypt.hashpw(sysUser.getPassword(), salt);
        sysUser.setSalt(salt);
        sysUser.setPassword(hashed);
        sysUser.setStatus("0");
        sysUser.setCreateTime(DateUtil.date());
        if (!StringUtils.hasText(sysUser.getNickname())) {
            sysUser.setNickname(sysUser.getUsername());
        }
        save(sysUser);
    }
}
