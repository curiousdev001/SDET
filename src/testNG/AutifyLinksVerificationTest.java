package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AutifyLinksVerificationTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        driver = (WebDriver) new ChromeDriver();

        // Navigate to the Autify website
        driver.get("https://autify.com/");
    }

    @Test(dataProvider = "linksData")
    public void testLinkTitle(String linkText, String expectedTitle) {
        // Click on the link
        WebElement link = driver.findElement(By.xpath("//a[text()='" + linkText + "']"));
        link.click();

        // Verify the title of the page
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title verification failed for link: " + linkText);

        // Navigate back to the homepage for the next verification
        driver.navigate().back();
    }

    @DataProvider(name = "linksData")
    public Object[][] linksData() {
        return new Object[][] {
                {"Why Autify", "Why Autify"},
                {"Pricing", "Pricing"},
                {"Webinars", "Webinars"},
                {"Resources", "Resources"}
        };
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
