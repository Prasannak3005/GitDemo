Feature: ErrorValidation

  @first
  Scenario: Check login is successful with valid creds
    Given User is on login page
    When User enters valid username and password
    And Clicks on Login Button
    Then User is navigated to Home Page
    And Close the browser