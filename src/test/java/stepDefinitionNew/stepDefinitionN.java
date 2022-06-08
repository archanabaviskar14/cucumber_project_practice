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
	
	@When("Enter incorrect username {string} and password {string}")
	public void enter_incorrect_username_and_password(String username, String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);   

	   }
	
	@When("Enter registered username {string} and password {string}")
	public void enter_registered_username_and_password(String user, String pwd)
	{
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pwd);   

	}

	@When("Click on Logout")
	public void click_on_logout()
	{
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("After clicking logout,User must successfully come out of the website")
	public void after_clicking_logout_user_must_successfully_come_out_of_the_website() {
	
		System.out.println("successfully logged out");
	}


	@Then("Proper error must be displayed and promt to login again")
	public void proper_error_must_be_displayed_and_promt_to_login_again()
	{
		String captext=driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/ul/li/strong")).getText();
		
		if(captext.contains("Error"))  //test for invalid inputs
		{
			Assert.assertTrue(true, "Invalid username and password");
		}
		else
		{
			Assert.assertTrue(false);
		}}

	
	
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
	//My Account-Dashboard feature
	@When("Click on Dashboard")
	public void click_on_dashboard()
	{
		driver.findElement(By.linkText("Dashboard")).click();
	}

	@Then("User must view Dashboard of the website")
	public void user_must_view_dashboard_of_the_website()
	{
		System.out.println("WELCOME TO DASHBOARD");
	}
	
	//My Account-Orders feature
	@When("Click on Orders")
	public void click_on_orders()
	{
		driver.findElement(By.linkText("Orders")).click();
	}

	@Then("User must view all their orders after clicking orders link")
	public void user_must_view_all_their_orders_after_clicking_orders_link() 
	{
	    System.out.println("All the orders");
	}

	@When("Click on View button")
	public void click_on_view_button()
	{
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/table/tbody/tr/td[5]/a")).click();
	}

	@Then("User must view his orders details,customer details and billing details after clicking orders link")
	public void user_must_view_his_orders_details_customer_details_and_billing_details_after_clicking_orders_link()
	{
	    System.out.println("Order details");
	}

	//My Account-Address feature
	@When("Click on Address")
	public void click_on_address()
	{
		driver.findElement(By.linkText("Addresses")).click();
	}

	@Then("User must view his billing address and shipping address after clicking Address link")
	public void user_must_view_his_billing_address_and_shipping_address_after_clicking_address_link()
	{
	    System.out.println("Billing Address");
	}

	//My Account-Edit Address feature
	@When("Click on edit Billing Address")
	public void click_on_edit_billing_address() 
	{
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/div/div[1]/header/a")).click();
		driver.findElement(By.xpath("//*[@id=\"billing_address_2\"]")).sendKeys("Bridge house-5");
		driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/form/p[12]/input[1]")).click();
	}

	@When("Click on edit Shipping Address")
	public void click_on_edit_shipping_address() 
	{
		driver.findElement(By.linkText("Dashboard")).click();
	}

	@Then("User details must be updated")
	public void user_details_must_be_updated()
	{
		String title=driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div[1]")).getText();
		if(title.contains("changed successfully"))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}



}
