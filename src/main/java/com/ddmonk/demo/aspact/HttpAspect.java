package com.ddmonk.demo.aspact;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class HttpAspect {


    private static final Logger LOG = LoggerFactory.getLogger(HttpAspect.class);


    @Pointcut("execution(public * com.ddmonk.demo.controller.ManController.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // url
        LOG.info("url={}", request.getRequestURL());
        //method
        LOG.info("method = {}", request.getMethod());
        //ip
        LOG.info("ip = {}", request.getRemoteAddr());
        // class Method
        LOG.info("class_method = {}", joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        // parameter
        LOG.info("param = {}", joinPoint.getArgs());

    }

    @After("log()")
    public void doAfter(){
        LOG.info("22222");
    }


    @AfterReturning(pointcut = "log()", returning = "object")
    public void doAfterReturning(Object object){
        LOG.info("response = {}", object);
    }

}
