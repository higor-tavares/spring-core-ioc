package com.higortavares.springcoreioc.infraestructure;

public class PostgresConnections {

  private String host;
  private String database;
  private int port;

  public PostgresConnections(String host, String database, int port) {
    this.host = host;
    this.port = port;
    this.database = database;
  }
  public void connect() {
    System.out.println(String.format("Successfully connected on database > jdbc://%s/%s:%d!", this.host, this.database, this.port));
  }
}
