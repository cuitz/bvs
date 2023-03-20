package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.vo.LoginParam;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.json.JSONUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "登录")
@RestController
@RequestMapping("/api")
public class LoginController {

    @Operation(summary = "登录")
    @Parameter(name = "loginParam", required = true)
    @PostMapping("/login")
    public String login(@RequestBody @Validated LoginParam loginParam) {
        if ("admin".equals(loginParam.getUsername()) && "123".equals(loginParam.getPassword())) {
            StpUtil.login("admin");
            return JSONUtil.toJsonStr(StpUtil.getTokenInfo());
        }
        return null;
    }
}
