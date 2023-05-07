package stepDefinition;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//This steps will check browser functionalities.

public class OpeningDemoBlaze {
	WebDriver driver;

	@Given("user is on webBrowser")
	public void user_is_on_webBrowser() {
		driver = new ChromeDriver();

	}

	@When("user open the google browser")
	public void user_open_the_google_browser() {
		driver.manage().window().maximize();
	}

	@And("enters the url")
	public void enters_the_url() {
		driver.get("https://www.demoblaze.com/");
	}

	@Then("user is navigated to demo blaze website")
	public void user_is_navigated_to_demo_blaze_website() {

		String productStore = driver.findElement(By.id("nava")).getText();
		String ExpectedTitle = "PRODUCT STORE";
		assertEquals(ExpectedTitle, productStore);
		driver.close();

	
	}

}
