package com.higortavares.springcoreioc.infraestructure;

public class DatabaseConnection {

  public static PostgresConnections pgConnection;

  public static PostgresConnections getPGConnection() {
    if(pgConnection == null) {
      pgConnection =  new PostgresConnections();
    }
    return pgConnection;
  }
}
