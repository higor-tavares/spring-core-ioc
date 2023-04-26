package com.higortavares.springcoreioc.controller;

import com.higortavares.springcoreioc.domain.User;

public class UserController {
  public void addUser(User user) {
    System.out.printf("Will save the user %s!%n", user.getName());
  }
}
