package TestRunner;


import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions
        (
		features=".//Features",
		glue="StepDefinations",
		monochrome=true,
		plugin= {"pretty","html:target/Cucumber-reports.html","json:target/cucumber.json"}
			)




public class Runner {
	

}






