package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


/**
 * Created by Karthik on 31/01/2019.
 */

//@RunWith(Cucumber.class)
@CucumberOptions(features = {"./src/test/java/features"} , plugin = {"json:./target/cucumber.json","html:./target/site/cucumber-pretty"},
        glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests  {


}
