package com.amt.cucuselfw.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.List;

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
    System.out.printf("User login into application with %s and password %s\n", username, password);
    // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
  }

  @When("User login into application with {string} and password {string} combination")
  public void user_login_into_application_with_and_password_combination(String username, String password) {
    System.out.printf("User login into application with %s and password %s combination\n", username, password);
    // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();
  }

  @When("^User login into application with (.+) and pin (.+) combination$")
  public void user_login_into_application_with_username_and_pin_combination(String username, Integer pin) {
    System.out.printf("User login into application with %s and pin %d combination\n", username, pin);
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


  @Given("User is on practice landing page")
  public void user_is_on_practice_landing_page() {
    System.out.println("User is on practice landing page");
    // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java.PendingException();

    Assert.assertTrue(false);
  }

  /**
   * Getting/setting list of form field values to steps
   */
  @When("User Signup into application")
  public void user_signup_into_application(/*io.cucumber.datatable.DataTable dataTable*/List<String> data) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
    String firstName = data.get(0);
    String lastName = data.get(1);
    String email = data.get(2);
    String contact = data.get(3);

    System.out.println("User signup with following information: ");
    System.out.printf("firstName=%s, lastName=%s,  email =%s, contact=%s, \n", firstName, lastName, email, contact);
    //    throw new io.cucumber.java.PendingException();
  }

  @Given("setup the entries in database")
  public void setup_the_entries_in_database() {
    System.out.println("\n\nsetup the entries in database DONE");
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
  }

  @When("launch the browser based on config variables")
  public void launch_the_browser_based_on_config_variables() {
    System.out.println("launch the browser based on config variables DONE");
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
  }

  @When("hit the home page url of banking site")
  public void hit_the_home_page_url_of_banking_site() {
    System.out.println("hit the home page url of banking site DONE");
    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
  }

}
