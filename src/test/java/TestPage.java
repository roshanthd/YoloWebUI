import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import page.GoogleHomePage;
import page.GoogleSearchResultsPage;
import page.SeleniumHqPage;

public class TestPage {
    WebDriver driver;
    GoogleHomePage googleHomePage;
    GoogleSearchResultsPage googleSearchResultsPage;
    SeleniumHqPage seleniumHqPage;
    SoftAssert softAssert = new SoftAssert();

    @Before
    public void initialize() {
        //Web driver initialization and setting up chromedriver
        String driverPath = "/Users/RoshanthS/Downloads/";
        String url = "http://google.com";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();

        //Page object instantiation
        googleHomePage = new GoogleHomePage(driver);
        googleSearchResultsPage = new GoogleSearchResultsPage(driver);
        seleniumHqPage = new SeleniumHqPage(driver);

        //navigate to the default or initial URL
        driver.navigate().to(url);
    }

    @After
    public void QuitDriver() {
        driver.close();
    }

    @Test
    // [TC-001]-Verify user is able to navigate to www.seleniumhq.org Page from Google search.
    public void VerifySeleniumWebPage() {
        String googleHomeUrl = "https://www.google.com/";
        String webUrl = "https://www.seleniumhq.org/";

        //Verify Url of google Home page
        softAssert.assertTrue(driver.getCurrentUrl().contains(googleHomeUrl), "google homepage Url mismatch");
        googleHomePage.typeSearchText("seleniumhq");
        googleHomePage.enterKey();
        googleSearchResultsPage.gotoSeleniumHqLink();

        //verify current URL matched the expected URL
        softAssert.assertTrue(driver.getCurrentUrl().contains(webUrl), "Selenium page Url mismatch");

        //Verify the page content is loaded and visible to the user
        softAssert.assertTrue(seleniumHqPage.checkPage(), "Selenium web page is not loaded");
        softAssert.assertAll();
    }
}