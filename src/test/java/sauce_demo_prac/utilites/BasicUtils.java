package sauce_demo_prac.utilites;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BasicUtils {
    public static void sleep(int second) {
        second *= 1000;
        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }
    }

    public static void switchWindowAndVerify(String expectedUrl, String expectedTitle){
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println(Driver.getDriver().getCurrentUrl());
            if(Driver.getDriver().getCurrentUrl().contains(expectedUrl)){
                break;
            }
        }
        String currentTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(currentTitle.contains(expectedTitle));
    }

    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),  expectedTitle);
    }


    public static void verifyURlContains(String expectedInUrl){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInUrl));
    }

    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){
        Select select = new Select(dropdownElement);
        List<WebElement> actualOptionAsWebElement = select.getOptions();

        List<String> actualOptionAsString = new ArrayList<>();

        for (WebElement each : actualOptionAsWebElement) {
            actualOptionAsString.add(each.getText());
        }

        return actualOptionAsString;
    }
}
