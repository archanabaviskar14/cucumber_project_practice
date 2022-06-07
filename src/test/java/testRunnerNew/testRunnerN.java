package testRunnerNew;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
				//features="Feature",
				//features="C://Users//RavindraBaviskar//eclipse-workspace//TestingCucumber//Feature//Tagging.feature",
				 // features="C:\\Users\\RavindraBaviskar\\eclipse-workspace\\TestingCucumber\\Feature\\Hooks.feature",
				features="\\Users\\RavindraBaviskar\\eclipse-workspace\\TestingCucumber\\Feature\\loginMyAccount.feature",
				glue="stepDefinitionNew",
				plugin={"pretty","html:test-output","json:json_output/cucumber.json"},
				//plugin ={"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" },
				//dryRun=true,
				//tags="@End2End",		//executes only endtoend tests scenario
				//tags="@SanityTest",	//executes only Sanity tests scenario
				//tags="@SanityTest and @RegressionTest",	//executes scenarios which are under both in Sanity and Regression tests scenario
				//tags="not @SanityTest",			//it will avoid end2end scenario and will executes all other rest of the scenario		
				//tags="@RegressionTest",
				monochrome=true
				)

public class testRunnerN {

}
