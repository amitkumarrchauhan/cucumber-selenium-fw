package com.amt.cucuselfw.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class GreenCartStepDefinition {
  WebDriver driver;
  String dataTableXPath = "//div[@class='dataTables_filter']";
  String searchFieldXPath = "//div[@class='dataTables_filter']//input[@type='search']";
  String filteredTableRowsXPath = "//div[contains(@class, 'dataTables_wrapper')]//table//tbody//tr";

  @Given("User is  on the GreenCart Landing Page")
  public void user_is_on_the_green_cart_landing_page() {
    driver = new ChromeDriver();

    driver.get("https://practice-automation.com/tables/");
    // Write code here that turns the phrase above into concrete actions
    System.out.println("user is on the green card landing page");
    // throw new io.cucumber.java.PendingException();
  }

  @When("user search with shortname {string} and extracted actual name of product")
  public void user_search_with_shortname_and_extracted_actual_name_of_product(String searchTerm) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("user search with_shortname_and_extracted_actual_name_of_product");
    WebElement searchField = driver.findElement(By.xpath(searchFieldXPath));
    searchField.sendKeys(searchTerm);
    // throw new io.cucumber.java.PendingException();
  }

  @Then("user search for the same shortname in offers page to check if product exists")
  public void user_search_for_the_same_shortname_in_offers_page_to_check_if_product_exists() {
    // Write code here that turns the phrase above into concrete actions

    List<WebElement> filteredRows = driver.findElements(By.xpath(filteredTableRowsXPath));

    Assert.assertEquals(filteredRows.size(), 2);
    System.out.println("user search for_the_same_shortname_in_offers_page_to_check_if_product_exists");
    driver.quit();
    // throw new io.cucumber.java.PendingException();
  }


}
