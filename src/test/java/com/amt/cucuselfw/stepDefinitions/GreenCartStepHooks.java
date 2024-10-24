package com.amt.cucuselfw.stepDefinitions;

import io.cucumber.java.After;

public class GreenCartStepHooks {
  @After("@SearchProductFinished")
  public void tearDown() {
    System.out.println("SearchProductFinished - tearing down DONE\n\n");
  }
}
