package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",glue={"stepDefination","helper"},tags="@Reg",
plugin="json:target/jsonReports/test.json")
public class TestRunner {
	
	
	//dryRun
	//monochrome
	//test automaton
	//TestPlaywright

    //Test Automation Selenium
	//Test Manual Testing

	//TestCypress
//Test

}
