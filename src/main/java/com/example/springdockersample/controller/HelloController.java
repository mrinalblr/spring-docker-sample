package com.example.springdockersample.controller;


        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

  //Sample Hello api
  @GetMapping("/hello")
  public String hello(){
    return "Hello from Spring.";
  }

  //Logout functionality
  @GetMapping("/logout")
  public String logout(){
    return "logged out successfully";
  }
  //Login fucntionality
  @GetMapping("/login")
  public String login(){
    return "Logged in successfully";
  }
}
