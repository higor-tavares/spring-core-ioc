package com.higortavares.springcoreioc;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoadContextTest {

  @Test
  public void shouldLoadContext() {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    assertNotNull(context);
  }
}
