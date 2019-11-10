package com.example.springdockersample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

  @GetMapping("/hello")
  public String hello(){
    return "Hello from Spring.";
  }

  @GetMapping("/logout")
  public String logout(){
    return "logged out successfully";
  }
}
