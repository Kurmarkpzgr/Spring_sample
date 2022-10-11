package com.nhnacademy.edu.springframework.greeting.service;

public class KoreanGreeter implements Greeter{

  public KoreanGreeter(){
    System.out.println("생성됨");
  }

  public boolean sayHello() {
    System.out.println("안녕 세상!");
    return true;
  }
}
