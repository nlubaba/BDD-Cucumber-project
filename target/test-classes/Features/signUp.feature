Feature: Sign Up feature

  @SmokeTest
  Scenario: To test sign up with valid credentials
    Given google is open and user is on the webpage
    When user clicks sign up button
    And user enters valid username and password
    And clicks sign up button
    Then user should be able to sign up successfully
