package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;





@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Selenium Testing\\MindQ\\Cucumberproject1\\Feature\\" //path of the feature file
		,glue= {"stepdefinitions"} //the path of the step definition file
		,plugin={"pretty","html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		,monochrome = true   // Display output in a proper readable format
		,strict = true
		,dryRun = false
		//,dryRun = true
		)
public class TestRunner {

}
