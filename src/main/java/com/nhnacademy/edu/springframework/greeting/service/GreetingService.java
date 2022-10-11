package com.nhnacademy.edu.springframework.greeting.service;

public class GreetingService {
  private Greeter greeter;

  public GreetingService() {
  }

  public void setKoreanGreeter(Greeter greeter){
    System.out.println("greeter Invoke");
    this.greeter = greeter;
  }
  public void doGreet() {
    greeter.sayHello();
  }
}
