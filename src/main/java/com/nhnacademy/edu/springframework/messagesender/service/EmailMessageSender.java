package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;


public class EmailMessageSender implements MessageSender {

  User user;
  String message;

  public EmailMessageSender() {
    System.out.println("Email Message Sender 생성됨");
  }

  public void destroy() {
    System.out.println("destroy method called in EmailMessageSender");
  }

  @Override
  public void sendMessage(User user, String message) {
    System.out.println("--------------------- E-mail Message");
    System.out.println(message);
    this.user = user;
    this.message = message;
  }
}
