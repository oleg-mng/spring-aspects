package com.olegmng.springaspects.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class LoggableAspect {

    @Pointcut("within(@com.olegmng.springaspects.aspect.Loggable *)")
    public void beansAnnotatedWith() {

    }

    @Pointcut("@annotation(com.olegmng.springaspects.aspect.Loggable)")
    public void methodsAnnotatedWith() {

    }

    @Around("beansAnnotatedWith() || methodsAnnotatedWith()")
    public Object loggableAspect(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("target = {}", joinPoint.getTarget().getClass());
        log.info("method = {}", joinPoint.getSignature().getName());
        log.info("args = {}", Arrays.toString(joinPoint.getArgs()));
        try {
            Object returnValue = joinPoint.proceed();
            log.info("result = {}", returnValue);
            return returnValue;
        } catch (Throwable e) {
            log.info("exception = [{}, {}]", e.getClass(), e.getMessage());
            throw e;
        }
    }

}
