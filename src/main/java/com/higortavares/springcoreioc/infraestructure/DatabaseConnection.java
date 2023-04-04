package com.higortavares.springcoreioc.infraestructure;

public class DatabaseConnection {

  public static PostgresConnections pgConnection;

  public static PostgresConnections getPGConnection(String host, String database, int port) {
    if(pgConnection == null) {
      pgConnection =  new PostgresConnections(host, database, port);
    }
    return pgConnection;
  }
}
