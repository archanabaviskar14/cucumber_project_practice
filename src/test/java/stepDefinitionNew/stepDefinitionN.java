package stepDefinitionNew;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitionN {

	public WebDriver driver=null;
	
	@Given("^Open the browser$")
	public void open_the_browser() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver","C://driver//chromedriver_win32//chromedriver.exe" );
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	
	    
	}

	/*@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String arg1) throws Throwable {
	    
		driver.get("http://practice.automationtesting.in/");
	}*/
	//we can also pass url parameter instead of writing whole url
	
	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String url) throws Throwable {
	    
		driver.get(url);
		
	    
	}


	@When("^Click on My Account Menu$")
	public void click_on_My_Account_Menu() throws Throwable {
	   
		driver.findElement(By.linkText("My Account")).click();
	
	}

	/*@When("^Enter registered username and password$")
	public void enter_registered_username_and_password() throws Throwable {
	    
		driver.findElement(By.name("username")).sendKeys("archu.sonawane@gmail.com");
		driver.findElement(By.name("password")).sendKeys("taranayan1420");   
	}*/
/*	
 * login by passing parameter scenario outline and examples

	@When("Enter registered username {string} and password {string}")
	public void enter_registered_username_and_password(String user, String pwd) 
	{
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pwd);   
	}
*/
/*	//login by passing paramaters through data table without header using list
	@When("Enter registered username and password")
	public void enter_registered_username_and_password(io.cucumber.datatable.DataTable credentials)
	{
			List <List <String>>data=credentials.cells();
			driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
			driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));   
		
	    }
*/
	//login by passing paramaters through data table with header using map
		@When("Enter registered username and password")
		public void enter_registered_username_and_password(io.cucumber.datatable.DataTable credentials)
		{
				List <Map <String,String>> data=credentials.asMaps(String.class,String.class);
				driver.findElement(By.name("username")).sendKeys(data.get(0).get("username"));
				driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));   
			
		    }


	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		
		driver.findElement(By.name("login")).click();
		
	  
	}

	@Then("^User must successfully login to the web page$")
	public void user_must_successfully_login_to_the_web_page() throws Throwable {
	    
		String title=driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/strong")).getText();
	    Assert.assertEquals(true, title.contains("archu.sonawane"));
	    System.out.println("Test Passed");  
	}
	
	
	@Then("Verify login")
	public void verify_login()
	{
		String captext=driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li/strong")).getText();
		
		if(captext.contains("Error"))  //test for invalid inputs
		{
			Assert.assertTrue(true, "Invalid input-Error page");
		}
		else
		{
			Assert.assertTrue(false);
		}
	}


}
