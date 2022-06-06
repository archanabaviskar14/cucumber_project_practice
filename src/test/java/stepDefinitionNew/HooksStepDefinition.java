package stepDefinitionNew;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefinition {
	
	@Before								//it will execute before every scenario
	public void setup()
	{
		System.out.println("Launch the chrome browser");
		
	}
	@After								//it will execute after every scenario
	public void tearDown()
	{
		System.out.println("Close the chrome browser");
		
	}

	@Given("User is on add customer page")
	public void user_is_on_add_customer_page()
	{
		System.out.println("User is on add customer page");
	}

	@When("User fills the cutomer details")
	public void user_fills_the_cutomer_details()
	{
		System.out.println("User fills the information");
	}

	@Then("customer is added")
	public void customer_is_added()
	{
		System.out.println("Customer is added");
	}

	@Given("User is on edit customer page")
	public void user_is_on_edit_customer_page()
	{
		System.out.println("User is on edit customer page");
		
	}

	@When("User updates the contact details")
	public void user_updates_the_contact_details() 
	{
		System.out.println("User updates contact details");
		
	}

	@Then("customer is updated")
	public void customer_is_updated()
	{
		System.out.println("customer is updated");
		
	}

	@Given("User is on delete customer page")
	public void user_is_on_delete_customer_page()
	{
		System.out.println("User is on delete customer page");
		
	 }

	@When("User delete the customer")
	public void user_delete_the_customer()
	{
		System.out.println("User delete the customer");
		
	}

	@Then("customer is deleted")
	public void customer_is_deleted()
	{
		System.out.println("customer is deleted");
	}



}
