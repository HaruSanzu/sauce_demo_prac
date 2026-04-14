package sauce_demo_prac.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html"},
        features ="src/test/resources/features",
        glue = "sauce_demo_prac/step_definitions",
        dryRun = false,
        tags = "@WIP"


)



public class CukesRunner {
}
