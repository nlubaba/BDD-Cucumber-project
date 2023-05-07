Feature: Login feature

  @SmokeTest
  Scenario: To test login with valid credentials
    Given user is on the webpage
    When user clicks login button
    And input valid username and password
    And user clicks login
    Then user should login successfully
