# http://uitestingplayground.com/
# https://testpages.eviltester.com/styled/index.html

# https://practice-automation.com/tables/   --- Product Page
# https://www.worldometers.info/world-population/population-by-country/  -- offers page


Feature: Search and place the order for the products
  @GreenCart @SearchProductFinished
  Scenario: Search experience for the product search in both home and offers page
    Given User is  on the GreenCart Landing Page
    When user search with shortname "Ind" and extracted actual name of product
    Then user search for the same shortname in offers page to check if product exists
