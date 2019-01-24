package com.usoft.b2b.manage.webfilter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @author hejq
 * @date 2018-12-19 15:21
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    /**
     * 自定义拦截顺序
     *
     * @param registry InterceptorRegistry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /*registry.addInterceptor(new MyFirstInterceptor()).addPathPatterns("*//**");
        registry.addInterceptor(new MySecondInterceptor()).addPathPatterns("*//**");*/
        super.addInterceptors(registry);
    }
}