package com.nhnacademy.edu.springframework.greeting.service;

public class ComplexGreetingService {

  // ComplexGreetingService 내부에서 생성한 객체를 사용한다.
  public boolean greet() {
    return new KoreanGreeter().sayHello();
  }
}
