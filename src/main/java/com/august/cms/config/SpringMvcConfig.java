package com.august.cms.config;

import com.august.cms.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;


/**
 * @author August
 * @author August
 * @date 2021/9/17 16:39
 * @lastEditors: August
 * @version:1.0
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Resource
    LoginInterceptor loginInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(
                        "/redis/**",
                        "/api/v1/user/login",
                        "/api/v1/user/logout/**"
                );

    }

}
