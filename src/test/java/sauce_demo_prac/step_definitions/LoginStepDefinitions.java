package sauce_demo_prac.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import sauce_demo_prac.pages.LoginPage;
import sauce_demo_prac.utilites.ConfigurationReader;
import sauce_demo_prac.utilites.Driver;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page of Sauce-Demo app")
    public void user_is_on_the_login_page_of_sauce_demo_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("login_url"));
    }
    @When("user enters email {string}")
    public void user_enters_email(String string) {
        loginPage.email_box.sendKeys(string);
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        loginPage.password_box.sendKeys(string);
    }
    @When("user click login button")
    public void user_click_login_button() {
        loginPage.sign_in_button.click();
    }
    @Then("user should see the {string}")
    public void user_should_see_the(String string) {
        switch (string){
            case "Account Details and Order History":
                Assert.assertTrue(loginPage.success_login_title.isDisplayed());
                break;
            case "Incorrect email or password":
                Assert.assertTrue(loginPage.failed_login_title.isDisplayed());
        }
    }

}
