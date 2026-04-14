package sauce_demo_prac.step_definitions;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import sauce_demo_prac.utilites.Driver;

public class Hooks {
    @Before
    public void setupScenario(){
        System.out.println("====Setting up browser using cucumber @Before");
    }

    @After
    public void tearDownScenario(Scenario scenario){

        if(scenario.isFailed()){
            try {
                byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
                System.out.println("Screenshot attached successfully");
            } catch (Exception e) {
                System.out.println("Screenshot failed: " + e.getMessage());
            }
        }


        Driver.closeDriver();
      /*  System.out.println("====Closing browser using cucumber @After");
        System.out.println("Scenario ended");*/
    }

    @BeforeStep
    public void setupStep(){
        System.out.println("applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("applying teardown using @AfterStep");
    }
}
