package com.higortavares.springcoreioc.infraestructure;

import com.higortavares.springcoreioc.domain.User;

public class UserDAO {

  public void save(User user) {
    System.out.println(String.format("The user %s was successfully added on database!", user.toString()));
  }
}
