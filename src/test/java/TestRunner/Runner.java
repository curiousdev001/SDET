package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class Runner {

	@CucumberOptions(
	    features = "src/test/resources/features",
	    glue = "stepDefinitions",
	    plugin = {"pretty", "html:target/cucumber-reports.html"}
	)
	
	public class TestRunner extends AbstractTestNGCucumberTests{
		
	}

}
