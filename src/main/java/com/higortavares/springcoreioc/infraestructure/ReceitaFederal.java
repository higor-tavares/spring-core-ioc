package com.higortavares.springcoreioc.infraestructure;

import static java.lang.System.out;

import com.higortavares.springcoreioc.domain.Product;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ReceitaFederal {

  @Pointcut("execution(* com.higortavares.springcoreioc..*.*(..)) && args(product,..)")
  private void getParams(Product product){}

  @Before("getParams(product)")
  public void taxa(Product product){
    if(product.isFromChina){
      out.printf(
          "Você foi taxado em 60 %%! vai ter que pagar R$ %.2f de impostos no produto %s!%n",
          (product.price*0.6)/100.0,
          product.description);
    }
    else {
      out.printf(
          "Você foi taxado em 40 %%! vai ter que pagar R$ %.2f de impostos no produto %s!%n",
          (product.price*0.4)/100.0,
          product.description);
    }
  }
}
