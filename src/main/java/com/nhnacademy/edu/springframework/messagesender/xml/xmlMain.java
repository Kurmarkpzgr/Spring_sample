package com.nhnacademy.edu.springframework.messagesender.xml;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class xmlMain {

  public static void main(String[] args) {
    String location = "classpath:/message.xml";
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(location);

//    MessageSender emailMessageSender = context.getBean("emailMessageSender", MessageSender.class);
//    MessageSender smsMessageSender = context.getBean("smsMessageSender", MessageSender.class);

    User user = new User("kuitae0725@gmail.com", "01074860725");

    context.getBean("emailMessageSender", MessageSender.class).sendMessage(user, "This is Message");
    context.getBean("emailMessageSender", MessageSender.class).sendMessage(user, "This is Message");
    System.out.println("------------------------------------------------------------------------------------------");
    context.getBean("smsMessageSender", MessageSender.class).sendMessage(user, "This is Message");
    context.getBean("smsMessageSender", MessageSender.class).sendMessage(user, "This is Message");

    context.close();
  }
}
