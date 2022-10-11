package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSendService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionMain {
  public static void main(String[] args){
    User user = new User("naver.com", "010");
    String message = "This is message";

    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:/message.xml");

    MessageSendService service = context.getBean("messageSendService", MessageSendService.class);
    service.doSendMessage(user,message);
  }
}
