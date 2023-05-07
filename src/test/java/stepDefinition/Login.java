package stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

// This steps will check page login functionalities.
public class Login {
	WebDriver driver;

	@Given("user is on the webpage")
	public void user_is_on_the_webpage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");

	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		driver.findElement(By.xpath("//a[@id='login2']")).click();
	}

	@And("input valid username and password")
	public void input_valid_username_and_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("loginusername")).sendKeys("username");
		driver.findElement(By.id("loginpassword")).sendKeys("password");

		
	}

	@And("user clicks login")
	public void user_clicks_login() {
		   driver.findElement(By.xpath("//button[text()='Log in']")).click();

		}

	@Then("user should login successfully")
	public void user_should_login_successfully(){
		String productStore = driver.findElement(By.id("nava")).getText();
		String ExpectedTitle = "PRODUCT STORE";
		assertEquals(ExpectedTitle, productStore);
		driver.quit();
	
	    
	}



	
	
}
