package com.gitassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("com.gitassignment.*")
@EnableAutoConfiguration
@RestController
public class App
{
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }


  @GetMapping("/hello")
  public String sayHello() {
    return "Hello App";
  }
}

