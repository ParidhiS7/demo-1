package com.spring.demos.configs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ConfigInterceptor implements HandlerInterceptor {

Logger logIntercept= LoggerFactory.getLogger(this.getClass());
    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object object, Exception arg3)
            throws Exception {
        logIntercept.info("State: After completion");
    }
    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object object, ModelAndView model)
            throws Exception {
        logIntercept.info("State: Post request is handled");
    }
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object object) throws Exception {
        logIntercept.info("State: Before request reaches controller");
        return true;
    }


}
