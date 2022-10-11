package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {

//  private final MessageSender smsMessageSender;
//  private final MessageSender emailMessageSender;

  private MessageSender messageSender;

  public MessageSendService() {
  }

  public void setSmsMessageSender(MessageSender messageSender){
    System.out.println("Message sender Invoked");
    this.messageSender = messageSender;
  }
//  public MessageSendService(MessageSender smsMessageSender, MessageSender emailMessageSender){
//    this.smsMessageSender = smsMessageSender;
//    this.emailMessageSender = emailMessageSender;
//  }

  public void doSendMessage(User user, String message) {
    messageSender.sendMessage(user, message);
  }
}
