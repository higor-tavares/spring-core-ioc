package com.higortavares.springcoreioc.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.higortavares.springcoreioc.application.AddUserUseCase;
import com.higortavares.springcoreioc.domain.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserControllerTest {
  private static ApplicationContext context;

  @BeforeAll
  public static void setUp() {
    context = new ClassPathXmlApplicationContext("spring-config.xml");
  }

  @Test
  public void shouldAddUserAndCallAspect() {
    UserController controller = context.getBean("userController", UserController.class);
    User user = new User("Paulo", "8288028384");
    controller.addUser(user);
    assertNotNull(controller);
  }
}
