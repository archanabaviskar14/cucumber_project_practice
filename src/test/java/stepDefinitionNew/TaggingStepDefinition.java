package stepDefinitionNew;

import io.cucumber.java.en.Given;

public class TaggingStepDefinition {
	

@Given("This is valid login test")
public void this_is_valid_login_test()
{
   System.out.println("This is login test");
}

@Given("This is logout test")
public void this_is_logout_test()
{
	System.out.println("This is logout test");

}

@Given("This is search test")
public void this_is_search_test()
{
	System.out.println("This is search test");
}

@Given("This is advanced search")
public void this_is_advanced_search()
{
	System.out.println("This is advanced serach test");

}

@Given("This is prepaid recharge")
public void this_is_prepaid_recharge()
{
	System.out.println("This is prepaid recharge test");

}

@Given("This is postpaid recharge")
public void this_is_postpaid_recharge()
{
	System.out.println("This is postpaid test");

}



}
