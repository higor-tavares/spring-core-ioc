package com.higortavares.springcoreioc.infraestructure;

import com.higortavares.springcoreioc.domain.User;

public class UserDAO {

  private PostgresConnections pgConnection;

  public UserDAO(PostgresConnections pgConnection) {
    this.pgConnection = pgConnection;
    pgConnection.connect();
  }
  public void destroy(){
    System.out.println("[Life Cycle] Cleaning UP the [UserDAO]");
  }
  public void save(User user) {
    System.out.println(String.format("The user %s was successfully added on database!", user.toString()));
  }
}
