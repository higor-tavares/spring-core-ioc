package com.higortavares.springcoreioc.domain;

public class UserNotFoundException extends RuntimeException{
  public UserNotFoundException(Long id){
    super(String.format("User with id [%d] not fond", id));
  }
}
