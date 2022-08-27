package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumHqPage {
    WebDriver driver;

    public SeleniumHqPage(WebDriver driver) {
        this.driver = driver;
    }

    By seleniumLogo = By.className("logo");

    //Verify the page is loading by checking the visibility of the logo
    public boolean checkPage() {
        boolean pageDisplayed = driver.findElement(seleniumLogo).isDisplayed();
        return pageDisplayed;
    }
}
