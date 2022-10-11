package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender {

  User user;
  String message;

  public SmsMessageSender() {
    System.out.println("SMS Sender 생성됨");
  }

  public void init(){
    System.out.println("init method called in SmsMessageSender");
  }
  @Override
  public void sendMessage(User user, String message) {
    System.out.println("<------------------------------------->");
    System.out.println("email : " + user.getEmail());
    System.out.println("phone Num : " + user.getPhoneNumber());
    System.out.println("--------------------- SMS Message");
    System.out.println(message);
    this.user = user;
    this.message = message;
  }
}
