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

public class Cart {
	
	WebDriver driver;
	
	@Given("Webdriver is open and user is on the webpage")
	public void webdriver_is_open_and_user_is_on_the_webpage() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	}

	@When("user clicks on cart")
	public void user_clicks_on_cart() {
	    driver.findElement(By.xpath("//a[@id='cartur']")).click();
	}

	@And("user is able to click the place order button")
	public void user_is_able_to_click_the_place_order_button() {
	    driver.findElement(By.xpath("//button[text()='Place Order']")).click();
	}

	@And("user enters all information in modal box")
	public void user_enters_all_information_in_modal_box() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nafisa");	
	    driver.findElement(By.xpath("//input[@id='country']")).sendKeys("usa"); 
	    driver.findElement(By.xpath("//input[@id='city']")).sendKeys("ny"); 
	    driver.findElement(By.xpath("//input[@id='card']")).sendKeys("1234123412341234"); 
	    driver.findElement(By.xpath("//input[@id='month']")).sendKeys("jan"); 
	    driver.findElement(By.xpath("//input[@id='year']")).sendKeys("jan"); 
	    
	    
	    
	}

	@And("user clicks purchase button")
	public void user_clicks_purchase_button() {
		
		driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click(); 

	}

	@Then("user should be able to purchase successfully")
	public void user_should_be_able_to_purchase_successfully() {

		String purchase = driver.findElement(By.xpath("/html/body/div[10]/h2")).getText();
		String ExpectedTitle = "Thank you for your purchase!";
		assertEquals(ExpectedTitle, purchase);
		driver.quit();
	}
	
	

}
