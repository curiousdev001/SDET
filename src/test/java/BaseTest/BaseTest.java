package BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	    public WebDriver driver;

	    @BeforeMethod
	    public void setUp() {
	        // Initialize WebDriver
	    	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @AfterMethod
	    public void tearDown() {
	        // Close WebDriver
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}



