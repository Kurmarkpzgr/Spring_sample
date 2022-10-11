package com.nhnacademy.edu.springframework.greeting.service;

public class EnglishGreeter implements Greeter {

  public EnglishGreeter() {
    System.out.println("English Greeter 생성됨");
  }

  public void init() {
    System.out.println("EnglishGreeter initialize");
  }

  public void cleanup(){
    System.out.println("English Greeter cleanup");
  }
  public boolean sayHello() {
    System.out.println("Hello, world!");
    return true;
  }

}
