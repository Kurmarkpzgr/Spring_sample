package com.nhnacademy.edu.springframework.greeting.service;

public class GreetingService {
  private final Greeter greeter;

  public GreetingService(Greeter greeter) {
    this.greeter = greeter;
  }

  public void doGreet() {
    greeter.sayHello();
  }
}
