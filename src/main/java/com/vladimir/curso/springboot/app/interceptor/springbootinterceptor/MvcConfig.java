package com.vladimir.curso.springboot.app.interceptor.springbootinterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{             //? Con esto se registra el interceptor

    @Autowired
    @Qualifier("loadingTimeInterceptor")
    private HandlerInterceptor timeInterceptor;                 // Agarramos el mas generico pero puede ser el LoadingTimeInterceptor

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
       registry.addInterceptor(timeInterceptor);                //.addPathPatterns();   .excludePathPatterns()
    }

    
}
