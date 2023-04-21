package com.higortavares.springcoreioc.resources;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class GetResourceTest {

  @Test
  public void shouldGetTextFile() throws IOException {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    var file =  context.getResource("classpath:files/first.txt").getFile();
    Files.newBufferedReader(file.toPath()).lines().forEach(System.out::println);
  }
}
