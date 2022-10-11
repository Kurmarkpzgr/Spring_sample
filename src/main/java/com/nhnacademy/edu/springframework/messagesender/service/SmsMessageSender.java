package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender {
  User user;
  String message;
  @Override
  public void sendMessage(User user) {
    System.out.println("--------------------- SMS Message");
    this.user = user;
    this.message = message;
  }
}
