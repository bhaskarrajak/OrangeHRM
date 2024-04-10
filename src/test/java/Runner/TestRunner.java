package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/Login.Feature", // Path to your feature files
        glue = "StepsDefs", // Package where your step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports"} // Plugins for reporting
)
public class TestRunner {
}
