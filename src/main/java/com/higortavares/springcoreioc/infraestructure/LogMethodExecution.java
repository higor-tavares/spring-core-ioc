package com.higortavares.springcoreioc.infraestructure;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogMethodExecution {

  @Around("@annotation(com.higortavares.springcoreioc.domain.Interceptable)")
  public Object intercept(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("before calling the method...");
    Object executionReturn = joinPoint.proceed();
    System.out.println("...after calling the method");
    return executionReturn;
  }
}
