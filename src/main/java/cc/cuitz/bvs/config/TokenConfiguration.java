package cc.cuitz.bvs.config;

import cn.dev33.satoken.interceptor.SaInterceptor;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class TokenConfiguration implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SaInterceptor(handle -> {
                    // 登录校验
                    SaRouter.match("/**")
                            .notMatch("/api/login")
                            .check(f -> StpUtil.checkLogin());

                    // 根据路由划分模块，不同模块不同鉴权
                    SaRouter.match("/api/user/**", r -> StpUtil.checkPermission("user"));
                    SaRouter.match("/api/admin/**", r -> StpUtil.checkPermission("admin"));
                    SaRouter.match("/api/task/**", r -> StpUtil.checkPermission("task"));
                    SaRouter.match("/api/strategy/**", r -> StpUtil.checkPermission("strategy"));
                    SaRouter.match("/api/report/**", r -> StpUtil.checkPermission("strategy"));
                }))
                .addPathPatterns("/**")
                // 放行swagger
                .excludePathPatterns("/swagger-ui/**", "/v3/api-docs/**");
    }
}
