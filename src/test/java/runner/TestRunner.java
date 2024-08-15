package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/java/Feature/home.feature",
        glue = "src/test/java/Step/HomeStepsDefinition.java"
)
public class TestRunner {
}
