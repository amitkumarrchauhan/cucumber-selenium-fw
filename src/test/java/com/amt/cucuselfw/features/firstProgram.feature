Feature: Application Login

  Scenario: Admin Page default login
    Given User is on Netbanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

  Scenario: User Page default login
    Given User is on Netbanking landing page
    When User login into application with "user" and password "5678"
    Then Home Page is displayed
    And Cards are displayed
