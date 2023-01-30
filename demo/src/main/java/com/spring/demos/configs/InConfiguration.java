package com.spring.demos.configs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InConfiguration {
    @Configuration
    public class InterceptorConfig extends WebMvcConfigurerAdapter {
        @Autowired
        private ConfigInterceptor logInterceptor;

        @Override
        public void addInterceptors(InterceptorRegistry registry) {
            registry.addInterceptor(logInterceptor);
        }
    }
}