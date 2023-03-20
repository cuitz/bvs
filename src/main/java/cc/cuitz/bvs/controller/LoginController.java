package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.entity.SysUser;
import cc.cuitz.bvs.service.SysUserService;
import cc.cuitz.bvs.vo.LoginParam;
import cn.dev33.satoken.session.SaSession;
import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.security.auth.login.FailedLoginException;

@Tag(name = "登录")
@RestController
@RequestMapping("/api")
public class LoginController {

    @Resource
    private SysUserService sysUserService;

    @Operation(summary = "登录")
    @Parameter(name = "loginParam", required = true)
    @PostMapping("/login")
    public SaTokenInfo login(@RequestBody @Validated LoginParam loginParam) throws FailedLoginException {
        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(SysUser::getUsername, loginParam.getUsername());
        SysUser user = this.sysUserService.getOne(queryWrapper);
        if (user == null) {
            throw new FailedLoginException("用户名或密码错误");
        }
        boolean loginResult = BCrypt.checkpw(loginParam.getPassword(), user.getPassword());
        if (!loginResult) {
            throw new FailedLoginException("用户名或密码错误");
        }
        StpUtil.login(user.getUsername());
        StpUtil.getSession().set(SaSession.USER, user);
        return StpUtil.getTokenInfo();
    }
}
