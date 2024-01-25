package SDETComprehensiveAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutifyVerification2 {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver_win32/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = (WebDriver) new ChromeDriver();

        // Navigate to the Autify website
        driver.get("https://autify.com/");

        // Click on "Why Autify" link and verify the title
        clickLinkAndVerifyTitle(driver, "//a[text()='Why Autify']", "Why Autify");

        // Click on "Pricing" link and verify the title
        clickLinkAndVerifyTitle(driver, "//a[text()='Pricing']", "Pricing");

        // Click on "Webinars" link and verify the title
        clickLinkAndVerifyTitle(driver, "//a[text()='Webinars']", "Webinars");

        // Click on "Resources" link and verify the title
        clickLinkAndVerifyTitle(driver, "//a[text()='Resources']", "Resources");

        // Close the browser
        driver.quit();
    }

    // Function to click a link and verify the title
    private static void clickLinkAndVerifyTitle(WebDriver driver, String xpath, String expectedTitle) {
        WebElement link = driver.findElement(By.xpath(xpath));
        link.click();

        // Wait for the page to load
        try {
            Thread.sleep(2000); // You might need to adjust the sleep duration based on your application
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify the title of the page
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification successful for: " + expectedTitle);
        } else {
            System.out.println("Title verification failed for: " + expectedTitle);
        }

        // Navigate back to the homepage for the next verification
        driver.navigate().back();
    }
}
