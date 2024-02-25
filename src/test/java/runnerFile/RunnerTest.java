package runnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/resources/features", glue = "stepDefinitions",
        monochrome = true,tags = "@login",plugin = {"html:target/Cucumber.html" })
public class RunnerTest extends AbstractTestNGCucumberTests {
}
