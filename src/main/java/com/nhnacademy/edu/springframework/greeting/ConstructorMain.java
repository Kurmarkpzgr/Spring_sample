package com.nhnacademy.edu.springframework.greeting;

import com.nhnacademy.edu.springframework.greeting.service.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {
  public static void main(String[] args){
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/beans.xml");

    GreetingService service = context.getBean("greetingService", GreetingService.class);
    service.doGreet();
  }

}
