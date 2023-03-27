package com.higortavares.springcoreioc.application;

import com.higortavares.springcoreioc.domain.User;
import com.higortavares.springcoreioc.infraestructure.UserDAO;

public class AddUserUseCase {

  private final UserDAO userDB;

  public AddUserUseCase(UserDAO userDAO) {
    this.userDB = userDAO;
  }

  public void execute(User user) {
    System.out.println(String.format("The user %s will be added. Wait a minute", user.toString()));
    this.userDB.save(user);
  }
}
