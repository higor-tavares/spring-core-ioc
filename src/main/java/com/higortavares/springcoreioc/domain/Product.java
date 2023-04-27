package com.higortavares.springcoreioc.domain;

public class Product {
  public int price;
  public String description;
  public boolean isFromChina;

  public Product(int price, String description, boolean isFromChina){
    this.price = price;
    this.description = description;
    this.isFromChina = isFromChina;
  }
}
