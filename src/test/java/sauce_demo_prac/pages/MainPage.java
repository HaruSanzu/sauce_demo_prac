package sauce_demo_prac.pages;

import org.openqa.selenium.support.PageFactory;
import sauce_demo_prac.utilites.Driver;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
