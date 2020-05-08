package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	

	WebDriver driver;
	@Given("^User is on codecademy login page$")
	public void user_is_on_codecademy_login_page(){
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.codecademy.com/login?redirect=%2F");
	}
	
	@When("^title of the page is codecademy login$")
	public void title_of_the_page_is_codecademy_login(){
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals("codecademy", title);
	}
	
	@Then("^User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("login__user_password")).sendKeys(password);
		
	}
	
	@Then("^Clicks on login button$")
	public void clicks_on_login_button() {
		WebElement loginbtn = driver.findElement(By.xpath("//button[text() = 'Log in']"));
		loginbtn.click();
		
	}
	
	@Then("^user is on home page$")
	public void user_on_home_page() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Codecademy", title);
		
	}
	
	@Then("^close the browser$")
	public void close_the_browser(){
		driver.close();
	}
	
	
			
}
