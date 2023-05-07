$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/cart.feature");
formatter.feature({
  "name": "Adding product to cart feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To verify cart feature functinality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "Webdriver is open and user is on the webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.Cart.webdriver_is_open_and_user_is_on_the_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on cart",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.Cart.user_clicks_on_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to click the place order button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Cart.user_is_able_to_click_the_place_order_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters all information in modal box",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Cart.user_enters_all_information_in_modal_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks purchase button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Cart.user_clicks_purchase_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to purchase successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Cart.user_should_be_able_to_purchase_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test login with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "user is on the webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.Login.user_is_on_the_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.Login.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "input valid username and password",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Login.input_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Login.user_clicks_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Login.user_should_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/signUp.feature");
formatter.feature({
  "name": "Sign Up feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To test sign up with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "google is open and user is on the webpage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.SignUp.google_is_open_and_user_is_on_the_webpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks sign up button",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.SignUp.user_clicks_sign_up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and password",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.SignUp.user_enters_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks sign up button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.SignUp.clicks_sign_up_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to sign up successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.SignUp.user_should_be_able_to_sign_up_successfully()"
});
formatter.result({
  "status": "passed"
});
});