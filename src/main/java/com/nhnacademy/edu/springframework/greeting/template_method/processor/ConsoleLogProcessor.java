package com.nhnacademy.edu.springframework.greeting.template_method.processor;

public class ConsoleLogProcessor extends AbstractProcessor {

  @Override
  protected void preProcess() {
    System.out.println("preProcess");
  }

  @Override
  protected void mainProcess() {
    System.out.println("mainProcess");
  }

  @Override
  protected void postProcess() {
    System.out.println("postProcess");
  }
}
