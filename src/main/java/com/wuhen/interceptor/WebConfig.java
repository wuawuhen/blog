package com.wuhen.interceptor;



import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * 2020/7/26 15:26
 * by 无痕ぐ
 */

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())

                .addPathPatterns("/admin/**")

                .excludePathPatterns("/admin")

                .excludePathPatterns("/admin/login");
    }
}
