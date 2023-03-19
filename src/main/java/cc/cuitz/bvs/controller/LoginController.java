package cc.cuitz.bvs.controller;

import cc.cuitz.bvs.vo.LoginParam;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.json.JSONUtil;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {
    @PostMapping("/login")
    public String login(@RequestBody @Validated LoginParam loginParam) {
        if ("admin".equals(loginParam.getUsername()) && "123".equals(loginParam.getPassword())) {
            StpUtil.login("admin");
            return JSONUtil.toJsonStr(StpUtil.getTokenInfo());
        }
        return null;
    }
}
