package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GoogleSearchResultsPage {
    WebDriver driver;

    public GoogleSearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoSeleniumHqLink() {
        //Adding a List with the web elements and looping through a for loop to get the items that matched anchor tag
        List<WebElement> my_list = driver.findElements(By.xpath("//div[@id='rso']//a"));
        for (WebElement item : my_list) {
            // if condition to select the url that matched www.seleniumhq.org
            if (item.getAttribute("innerHTML").contains("www.seleniumhq.org")) {
                item.click();
                break;
                // break the loop and exit once the link is clicked
            }
        }
    }
}
