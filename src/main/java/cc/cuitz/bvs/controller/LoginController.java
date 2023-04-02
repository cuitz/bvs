package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.service.LoginService;
import cc.cuitz.bvs.vo.LoginInfo;
import cc.cuitz.bvs.vo.LoginParam;
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
    private LoginService loginService;

    @Operation(summary = "登录")
    @Parameter(name = "loginParam", required = true)
    @PostMapping("/login")
    public LoginInfo login(@RequestBody @Validated LoginParam loginParam) throws FailedLoginException {
        return loginService.login(loginParam);
    }
}
