packag stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ConFreeCrmStepDefinition {

    WebDriver driver ;
	@Given("^user is on login page$")
	public void user_is_on_login_page(){
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.freecrm.com");
	}
	
	@When("^the title of the page is matched$")
	public void the_title_of_the_page_is_matched(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small",title);
	}
	
	@Then("^user clicks on login link$")
	public void user_clicks_on_login_link() {
		
		driver.findElement(By.cssSelector("body > div.page > header > div > nav > div.rd-navbar-inner > div > div.rd-navbar-nav-wrap.toggle-original-elements > ul > a")).click();

		}
	
	@Then("^user moves to login page$")
	public void user_moves_to_login_page() {
		String title = driver.getTitle();
		System.out.println("Title of the login page:"+ title);
		Assert.assertEquals("Cogmento CRM", title);
		
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_emailaddress_and_password(String email,String password) {
		driver.findElement(By.name("email")).sendKeys(email);
    	driver.findElement(By.name("password")).sendKeys(password);
	
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[text()=\"Login\"]")).click();
	}
	
	@Then("^user moves to home page$")
	public void user_moves_home_page() {
		String title = driver.getTitle();
		System.out.println("Title of the login page:"+ title);
		Assert.assertEquals("Cogmento CRM", title);
	}
	
	@Then("^close the browser$") 
	public void close_the_browser(){
	    // Write code here that turns the phrase above into concrete actions
	   driver.quit();
	}


