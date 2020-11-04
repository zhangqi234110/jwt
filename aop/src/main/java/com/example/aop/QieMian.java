package com.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class QieMian {

    @Pointcut("execution(public * com.example.aop.AopTest.aop(..))")
    public void webLog(){}

    @Before("webLog()")
    public void deBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println(joinPoint.getSignature().getName());
        System.out.println(joinPoint.getSignature().getDeclaringTypeName());

        System.out.println("前置通知");
    }

    @After("webLog()")
    public void deAfter(JoinPoint joinPoint) throws Throwable {
        System.out.println("后置通知");
    }
}
