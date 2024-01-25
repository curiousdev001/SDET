package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AutifyWebsiteTest {

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
    public void testLinkPresence(String linkText) {
        WebElement link = driver.findElement(By.xpath("//a[text()='" + linkText + "']"));
        AssertJUnit.assertTrue(link.isDisplayed());
    }

    @Test(dataProvider = "buttonsData")
    public void testButtonEnabled(String buttonText) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonText + "']"));
        AssertJUnit.assertTrue(button.isEnabled());
    }

    @DataProvider(name = "linksData")
    public Object[][] linksData() {
        return new Object[][] {
                {"Why Autify"},
                {"Pricing"},
                {"Webinars"},
                {"Resources"}
        };
    }

    @DataProvider(name = "buttonsData")
    public Object[][] buttonsData() {
        return new Object[][] {
                {"Start Free Trial"},
                {"Sign In"}
        };
    }

    
	@AfterTest
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
