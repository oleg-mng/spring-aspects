package com.olegmng.springaspects.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class TimeAspect {

    @Pointcut("@annotation(com.olegmng.springaspects.aspect.Loggable)")
    public void methodsAnnotatedWith() {

    }

    @Before("methodsAnnotatedWith()")
    public void timeAspectBefore(JoinPoint joinPoint) throws Throwable {
        log.info("Time before method() = {}", System.currentTimeMillis());
    }

    @AfterReturning("methodsAnnotatedWith()")
    public void timeAspectAfter(JoinPoint joinPoint) throws Throwable {
        log.info("Time after method() = {}", System.currentTimeMillis());
    }

}
