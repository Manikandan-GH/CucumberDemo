package myrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\v.mani\\eclipse-workspace\\CucumberDemo\\src\\main\\java\\features\\hooks.feature",
glue= {"stepDefinitions"},
format= {"pretty","html:test-outout", "json:json_output/cucumber.json","junit:juni_xml/cucmber.xml"},
monochrome = true,
strict = true,//to display the console output in more readable format
dryRun = false
//tags = {"~@smoketest","~@regressiontest","~@end2end"}



)

public class TestRunner {

	

}
