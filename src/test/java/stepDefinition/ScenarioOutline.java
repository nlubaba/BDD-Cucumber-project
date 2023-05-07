package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline {
	WebDriver driver = new ChromeDriver();

	@Given("Open browser and navigate to Login page")
	public void open_browser_and_navigate_to_Login_page() {
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.xpath("//a[@id='login2']")).click();
	}

	@When("user enters valid {string} and invalid {string}")
	public void user_enters_valid_and_invalid(String string, String string2) {
		driver.findElement(By.id("loginusername")).sendKeys("username");
		driver.findElement(By.id("loginpassword")).sendKeys("pass");

	}
	

	
	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		   driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}

	@Then("user should not be login successfully")
	public void user_should_not_be_login_successfully() throws InterruptedException {
		Thread.sleep(2000);
		String alertMessage= driver.switchTo().alert().getText();
		String ExpectedAlertMessage = "Wrong password.";
	    assertEquals(alertMessage,ExpectedAlertMessage);
	    driver.quit();
	}
	
	

}
