package com.jagadeesh.Springboot.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER= LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.jagadeesh.Springboot.demo.controller.*(..)")
    public void logMethodCalls(){
        LOGGER.info("logger method called");
    }
}
