package com.higortavares.springcoreioc.infraestructure;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SayHelloBeforeController {

  @Before("execution (* com.higortavares.springcoreioc.controller.*.*(..))")
  public void sayHell(){
    System.out.println("Hello! Your first Aspect is running sucessfuly");
  }
}
