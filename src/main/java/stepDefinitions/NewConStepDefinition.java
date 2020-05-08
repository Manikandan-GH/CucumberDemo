package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewConStepDefinition {
	WebDriver driver ;
    @Given("^user is on login page$")
	public void user_is_on_login_page(){
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
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
		driver.findElement(By.xpath("//span[@class='icon icon-xs mdi-chart-bar']//parent::a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
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
   		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   		
    }
    
    @Then("^user clicks contact$")
    public void user_clicks_contact() {
    	driver.findElement(By.xpath("//div[@id='main-nav']//span[text()='Contacts']")).click();
    }
    
    @Then("^user creates new contact$")
    public void user_creates_new_contact() {
    	driver.findElement(By.xpath("//button[@class='ui linkedin button' and contains(text(),'New')]")).click();
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    
    @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
    public void user_enters_contact_details(String first_name,String last_name,String position) {
    	driver.findElement(By.name("first_name")).sendKeys(first_name);
    	driver.findElement(By.name("last_name")).sendKeys(last_name);
    	driver.findElement(By.name("position")).sendKeys(position);
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	driver.findElement(By.xpath("//i[@class='save icon']//parent::button[@class='ui linkedin button']")).click();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    
       }
    
   @Then("^close the browser$")
    public void close_the_browser(){
    	driver.quit();
    }
    
    
