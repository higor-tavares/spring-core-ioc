package com.higortavares.springcoreioc.controller;

import com.higortavares.springcoreioc.domain.Interceptable;
import com.higortavares.springcoreioc.domain.Product;

public class ProductsController {

  @Interceptable
  public void addProduct() {
    System.out.println("Adding no one product in no one place...");
  }

  public void compra(Product p){
    System.out.printf("Você acabou de comprar o produto %s por R$ %.2f%n", p.description, p.price/100.0);
  }
}
