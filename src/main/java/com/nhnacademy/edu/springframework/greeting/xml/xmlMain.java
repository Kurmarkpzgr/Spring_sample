package com.nhnacademy.edu.springframework.greeting.xml;

import com.nhnacademy.edu.springframework.greeting.service.Greeter;
import com.nhnacademy.edu.springframework.greeting.service.GreetingService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xmlMain {

  public static void main(String[] args) {
    String location = "classpath:/beans.xml";
//    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(location);  //싱글턴이면 여기서 객체가 생성됨
//
//    Greeter englishGreeter = context.getBean("englishGreeter", Greeter.class);
//    Greeter koreanGreeter = context.getBean("koreanGreeter", Greeter.class);    //프로토타입은 여기서 객체가 생성되고, 끝나면 사라짐.
//
//    englishGreeter.sayHello();
//    koreanGreeter.sayHello();

    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {

      System.out.println("---------");
      new GreetingService(context.getBean("koreanGreeter", Greeter.class)).doGreet();
      System.out.println("---------");
      new GreetingService(context.getBean("koreanGreeter", Greeter.class)).doGreet();
      System.out.println("---------");
      new GreetingService(context.getBean("englishGreeter", Greeter.class)).doGreet();
      System.out.println("---------");
      new GreetingService(context.getBean("englishGreeter", Greeter.class)).doGreet();
      System.out.println("---------");

      context.close();
    }
  }

}
