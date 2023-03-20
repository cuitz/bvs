package cc.cuitz.bvs.controller;

import cn.dev33.satoken.stp.StpUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "登出")
@RestController
@RequestMapping("/api")
public class LogoutController {

    @Operation(summary = "登出")
    @PostMapping("/logout")
    public void logout() {
        StpUtil.logout();
    }
}
