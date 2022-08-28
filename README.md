# YoloWebUI
## Test scenario
- On a browser
- Given I want to go to the 'www.seleniumhq.org' Page
- When I go to 'www.google.com'
	- and I type 'Seleniumhq' in the searchbox
	- and I press 'ENTER' in the searchbox
	- and I click on 'Selenium HQ' link
- Then I´m on Selenium HQ Page

## Tools and Frameworks used
This web automation is developed based on ***"Page object pattern"***. This helps in reducing code redundancy and helps maintainability and isolation from the page and Test layers. Given below are some of the Test tools and frameworks used for this project

- IntelliJ community edition - IDE used
- Java - Programming language used (18.0.2.1)
- Selenium - org.openqa.selenium library to identify elements and perform actions on web
- TestNG for @Test Annotations
- Maven Build tool for dependency management
- Chrome driver to run the automation 
- Lombok plugin to generate @Getters and @Setters


## Steps to execute the test case (Manual)

**TC - Verify user is able to Access Seleniumhq.org web page when navigating through google search.**

| Steps | Expected results  |
| -------  | --- |
| Open Chrome Browser | User is able to open the browser |
| Navigate to "www.google.com" | User is able to navigate to Google search home page |
| In the search box type "seleniumhq" | User is able to type the keyword in the search box |
| Press Enter | User is able to trigger the search |
| Wait for the search results to appear | The results will appear |
| Search for the link which has "seleniumhq.org" Url in it | User is able to identify the URL which has the particular link |
| Click the selected link | User is able to identify and click on the Link |
| Wait for the page to load | The page will be loaded |
| Verify the URL of the page loaded | The page URL should match "www.seleniumhq.org" |
| Verify the content of the page loaded eg- Logo | The page should be loaded as expected and the Logo {"className=logo"} should appear  |

## Steps to execute (Automation run)
- Open project file in IDE IntelliJ
- resolve the dependencies in pom.xml file to download and resolve the dependencies for the versions specified.
- Set the path for chromedriver for "*driverPath*" variable "*initialize()*" method in "*TestPage.java*" class after downloading chromedriver.
- Run the test by executing the "**VerifySeleniumWebPage()**" test method.
- Verify the Animated GIF below for the results

![Automation run](https://user-images.githubusercontent.com/53547532/187036872-e9910202-569e-467e-ad35-ad4c507dfbd8.gif)

