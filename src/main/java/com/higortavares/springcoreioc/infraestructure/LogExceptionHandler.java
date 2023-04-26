package com.higortavares.springcoreioc.infraestructure;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogExceptionHandler {

  @AfterThrowing(pointcut = "within(com.higortavares.springcoreioc..*)", throwing = "e")
  public void catchException(RuntimeException e){
    System.out.printf("The application throws the flowing exception [%s]%n", e.getMessage());
  }
}
