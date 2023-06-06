package testrunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


import org.junit.runner.RunWith;
@CucumberOptions(
		features = {"src/test/resources/features/ExcelReader.feature"},
		glue = {"ExcelReader_stepdefinitions","apphooks" },
		plugin= {"pretty" ,
                "html:target/creport/cucumber",
                "json:target/creport/cucumber.json",
                 "junit:target/creport/cucumber.xml"}

		
		)
				

public class ExcelReader_testrunner extends AbstractTestNGCucumberTests{

	

}
