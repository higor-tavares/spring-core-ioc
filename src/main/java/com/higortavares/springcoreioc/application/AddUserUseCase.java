package com.higortavares.springcoreioc.application;

import com.higortavares.springcoreioc.domain.User;
import com.higortavares.springcoreioc.infraestructure.UserDAO;

public class AddUserUseCase {

  private final UserDAO userDB;

  public void init(){
    System.out.println("Calling the init method by Init Method LifeCycle");
  }
  public void destroy(){
    System.out.println("[Life Cycle] Cleaning UP the [AddUserUseCase]");
  }
  public AddUserUseCase(UserDAO userDAO) {
    this.userDB = userDAO;
  }

  public void execute(User user) {
    System.out.println(String.format("The user %s will be added. Wait a minute", user.toString()));
    this.userDB.save(user);
  }
}
