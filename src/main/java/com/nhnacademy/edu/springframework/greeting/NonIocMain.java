package com.nhnacademy.edu.springframework.greeting;

import com.nhnacademy.edu.springframework.greeting.service.ComplexGreetingService;

public class NonIocMain {

  public static void main(String[] args) {
    new ComplexGreetingService().greet();
  }
}
