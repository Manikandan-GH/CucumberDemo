package stepDefinitions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepWithMapDefinition {

	WebDriver driver ;
	@Given("^user is on login page$")
	public void user_is_on_login_page(){
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com");
    }
	
	@When("^title of the page is matched$")
	public void title_of_the_page_is_matched(){
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small",title);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
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
	 
	 @Then("^user enters emailid and password$")
	    public void user_enters_emailid_and_password(DataTable credentials) {
		 for(Map<String,String> data : credentials.asMaps(String.class, String.class)) {
	    	driver.findElement(By.name("email")).sendKeys(data.get("email"));
	    	driver.findElement(By.name("password")).sendKeys(data.get("password"));
		 }
	    	
	 }
	 @Then("^clicks on login button$")
		public void user_clicks_on_login_button() {
			driver.findElement(By.xpath("//div[text()=\"Login\"]")).click();
		}
	 
	 @Then("^user on home page$")
	   	public void user_on_home_page() {
	   		String title = driver.getTitle();
	   		System.out.println("Title of the login page:"+ title);
	   		Assert.assertEquals("Cogmento CRM", title);
	   		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   		
	    }
	 
	 @Then("^user moves to deal page$")
	 public void user_moves_to_deal_page() {
		 driver.findElement(By.xpath("//a[@class='item']//span[text()='Deals']")).click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@class='item']//button[@class='ui linkedin button' and text()='New']")).click();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
	 }
	 
	 @Then("^enters deal details$")
	 public void enters_deal_details(DataTable dealdata) {
		 for(Map<String,String> data : dealdata.asMaps(String.class, String.class)) {
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.name("title")).sendKeys(data.get("title"));
		 driver.findElement(By.name("description")).sendKeys(data.get("description"));
		 driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//div[@class='item']//button[@class='ui linkedin button' and text()='Save']")).click();
		 driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		 
		 //create a new deal page
		 driver.findElement(By.xpath("//div[@id='main-nav']//a[@class='item']//i[@class='money icon']")).click(); 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//div[@class='item']//button[@class='ui linkedin button' and text()='New']")).click();
		 
		 }
		 
	 }
	 
	 @Then("^close the browser$")
	 public void close_the_browser() {
		 driver.quit();
		 
	 }
		
}
