package com.amt.cucuselfw.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
  @Before("@NetBanking")
  public void netBankingSetup() {
    System.out.println("\n\nsetup the entries in NetBanking Database DONE");
  }

  @Before("@Mortgage")
  public void mortgageSetup() {
    System.out.println("\n\nsetup the entries in Mortgage Database DONE");
  }

  @After
  public void tearDown() {
    System.out.println("tearing down DONE\n\n");
  }
}
