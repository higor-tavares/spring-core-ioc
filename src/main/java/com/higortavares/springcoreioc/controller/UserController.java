package com.higortavares.springcoreioc.controller;

import com.higortavares.springcoreioc.domain.User;
import com.higortavares.springcoreioc.domain.UserNotFoundException;

public class UserController {
  public void addUser(User user) {
    System.out.printf("Will save the user %s!%n", user.getName());
  }
  public void findUserById(Long id) {
    throw new UserNotFoundException(id);
  }
}
