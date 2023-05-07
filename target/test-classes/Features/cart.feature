Feature: Adding product to cart feature
@SmokeTest 
  Scenario:To verify cart feature functinality
    Given Webdriver is open and user is on the webpage
    When user clicks on cart 
    And user is able to click the place order button
    And user enters all information in modal box
    And user clicks purchase button
    Then user should be able to purchase successfully