Feature: Application Login

  @RegressionTest
  Scenario: Admin Page default login
    Given User is on Netbanking landing page
    When User login into application with "admin" and password "1234"
    Then Home Page is displayed
    And Cards are displayed

  @RegressionTest
  Scenario: User Page default login
    Given User is on Netbanking landing page
    When User login into application with "user" and password "5678"
    Then Home Page is displayed
    And Cards are displayed

  @RegressionTest
  Scenario Outline: User Page default login
    Given User is on Netbanking landing page
    When User login into application with "<username>" and password "<password>" combination
    Then Home Page is displayed
    And Cards are displayed
    Examples:
      | username   | password |
      | debituser  | hello2   |
      | credituser | hello3   |

  @SmokeTest @RegressionTest
  Scenario Outline: User Page default login with DatTypes preserved
    Given User is on Netbanking landing page
    When User login into application with <username> and pin <pin> combination
    Then Home Page is displayed
    And Cards are displayed
    Examples:
      | username   | pin  |
      | debituser  | 1234 |
      | credituser | 5678 |

  @SmokeTest
  Scenario: User Page default Sign up
    Given User is on practice landing page
    When User Signup into application
      | amitkumar                   |
      | chauhan                     |
      | amitkumar.chauhan@gmail.com |
      | 12345678                    |
    Then Home Page is displayed
    And Cards are displayed
