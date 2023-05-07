Feature: login failed feature functionality
Scenario Outline: Test user Login with different invalid credentials
    Given Open browser and navigate to Login page
    When user enters valid "<username>" and invalid "<password>"
    And clicks on the login button
    Then user should not be login successfully
   
Examples:
    | username      | password      |
    |  username     |   pass        |
    |  name         |   password    |
 