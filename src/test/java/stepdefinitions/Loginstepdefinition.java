package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Loginstepdefinition {
	
	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\venkatesh\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
	}
	
	@When("^title of login page is Mercury Tours$")
	
	public void tile_mercurytours()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	
	
	@Then("^user enters username and password$")
	public void username_password() {
	  driver.findElement(By.name("userName")).sendKeys("qaq");
	  driver.findElement(By.name("password")).sendKeys("qaq");
	 
	}
	/* @Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void username_password(String username, String password) {
	  driver.findElement(By.name("userName")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);  
		
	 */
	
	@Then("user clicks on login button")
	public void login_button() {
		 driver.findElement(By.name("login")).click();
		 
	}

	@Then("user is on Home page")
	public void Home_page() {
	    
		WebElement el = driver.findElement(By.linkText("SIGN-OFF"));
		el.isDisplayed();
		String title = driver.getTitle();
		System.out.println("Home page title is:" +title);
	}
	
}
