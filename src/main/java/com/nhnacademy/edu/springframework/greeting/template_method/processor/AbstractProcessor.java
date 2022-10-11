package com.nhnacademy.edu.springframework.greeting.template_method.processor;

public abstract class AbstractProcessor {

  public final void process() {
    preProcess();
    mainProcess();
    postProcess();
  }

  protected abstract void preProcess();
  protected abstract void mainProcess();
  protected abstract void postProcess();
}