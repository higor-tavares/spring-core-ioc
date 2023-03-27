package com.higortavares.springcoreioc.application;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.higortavares.springcoreioc.domain.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddUserUseCaseTest {

  private static ApplicationContext context;

  @BeforeAll
  public static void setUp() {
    context = new ClassPathXmlApplicationContext("spring-config.xml");
  }

  @Test
  public void shouldAddUser() {
    AddUserUseCase userCase = context.getBean("addUserUseCase", AddUserUseCase.class);
    User user = new User("Paulo", "8288028384");
    userCase.execute(user);
    assertNotNull(userCase);
  }
}
