package com.higortavares.springcoreioc.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.higortavares.springcoreioc.domain.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductControllerTest {
  private static ApplicationContext context;

  @BeforeAll
  public static void setUp() {
    context = new ClassPathXmlApplicationContext("spring-config.xml");
  }

  @Test
  public void shouldAddProductAndCallAspect() {
    ProductsController controller = context.getBean("productController", ProductsController.class);
    controller.addProduct();
    assertNotNull(controller);
  }

  @Test
  public void shouldAddCompraCallAspect() {
    ProductsController controller = context.getBean("productController", ProductsController.class);
    controller.compra(new Product(100000, "Videogame", false));
    controller.compra(new Product(100000, "Telefone xiaomi", true));

    assertNotNull(controller);
  }
}
