package sauce_demo_prac.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sauce_demo_prac.utilites.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "customer_email")
    public WebElement email_box;

    @FindBy(id = "customer_password")
    public WebElement password_box;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[5]/input")
    public WebElement sign_in_button;

    @FindBy(xpath = "//h1[@class='accounts-title']")
    public WebElement success_login_title;

    @FindBy(xpath = "//li[text()='Incorrect email or password.']")
    public WebElement failed_login_title;
}
