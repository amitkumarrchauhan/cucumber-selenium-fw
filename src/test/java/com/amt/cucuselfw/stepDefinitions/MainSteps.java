package com.amt.cucuselfw.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

  @Given("User is on Netbanking landing page")
  public void user_is_on_netbanking_landing_page() {
    System.out.println("user is on netbanking landing page");
    //     Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
  }

  /*
  @When("User login into application")
  public void user_login_into_application() {
    System.out.println("user login into application");
//    Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
  }
*/
  @When("User login into application with {string} and password {string}")
  public void user_login_into_application_with_and_password(String username, String password) {
    System.out.printf("User login into application with %s and password %s", username, password);
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
  }

  @Then("Home Page is displayed")
  public void home_page_is_displayed() {
    System.out.println("home page is displayed");
    //     Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
  }

  @Then("Cards are displayed")
  public void cards_are_displayed() {
    System.out.println("cards are displayed");
    //     Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
  }

}
