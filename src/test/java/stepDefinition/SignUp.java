package stepDefinition;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//This steps will check page sign up functionalities.

public class SignUp {
	WebDriver driver = new ChromeDriver();
	
	@Given("google is open and user is on the webpage")
	public void google_is_open_and_user_is_on_the_webpage() {
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	}
	@When("user clicks sign up button")
	public void user_clicks_sign_up_button() {
	   driver.findElement(By.xpath("//a[@id='signin2']")).click();
	}

	@And("user enters valid username and password")
	public void user_enters_valid_username_and_password() throws InterruptedException {
		Thread.sleep(500);
		 driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("username");
		 driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("password");
	}

	@And("clicks sign up button")
	public void  clicks_sign_up_button() {
	   driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	  
	}

	@Then("user should be able to sign up successfully")
	public void user_should_be_able_to_sign_up_successfully() throws InterruptedException {
		Thread.sleep(2000);
		String alertMessage= driver.switchTo().alert().getText();
		String ExpectedAlertMessage = "This user already exist.";
	    assertEquals(alertMessage,ExpectedAlertMessage);
	    driver.quit();

	}
	
	
	

}
