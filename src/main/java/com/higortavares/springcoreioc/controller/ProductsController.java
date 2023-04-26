package com.higortavares.springcoreioc.controller;

import com.higortavares.springcoreioc.domain.Interceptable;

public class ProductsController {

  @Interceptable
  public void addProduct() {
    System.out.println("Adding no one product in no one place...");
  }
}
