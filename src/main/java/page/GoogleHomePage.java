package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
    WebDriver driver;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.name("q");

    public void typeSearchText(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
    }

    public void enterKey() {
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }
}
