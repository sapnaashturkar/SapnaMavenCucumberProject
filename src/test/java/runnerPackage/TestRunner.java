 	package runnerPackage;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(

		features = ".//Feature/AddNewCustomer.feature",
		glue = "stepDefinations",
		dryRun=false,
		monochrome=true,
		publish=true,
		tags = "@Sanity"
		
		)
public class TestRunner {

}

 