package com.nhnacademy.edu.springframework.greeting.template_method;

import com.nhnacademy.edu.springframework.greeting.template_method.processor.AbstractProcessor;
import com.nhnacademy.edu.springframework.greeting.template_method.processor.ConsoleLogProcessor;

public class TemplateMethodMain {
  public static void main(String[] args) {
    AbstractProcessor processor = new ConsoleLogProcessor();
    processor.process();
  }
}
