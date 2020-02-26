package com.example.aspectjltw.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class SampleAspect {

    @Around("execution(public * com.example.aspectjltw.service.SampleService.*(String))")
    public String interceptPublic(ProceedingJoinPoint joinPoint) throws Throwable {

        return (String) joinPoint.proceed(new Object[] {"[intercepted public]"});
    }

    @Around("execution(private * com.example.aspectjltw.service.SampleService.*(String))")
    public String interceptPrivate(ProceedingJoinPoint joinPoint) throws Throwable {

        return (String) joinPoint.proceed(new Object[] {"[intercepted private]"});
    }
}
