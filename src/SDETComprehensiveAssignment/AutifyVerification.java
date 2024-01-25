package SDETComprehensiveAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutifyVerification {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver","C:/Drivers/chromedriver_win32/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver =  (WebDriver) new ChromeDriver();

        // Navigate to the Autify website
        driver.get("https://autify.com/");

        // Verify the presence of links
        verifyLinkPresence(driver, "Why Autify");
        verifyLinkPresence(driver, "Pricing");
        verifyLinkPresence(driver, "Webinars");
        verifyLinkPresence(driver, "Resources");

        // Verify the buttons are enabled
        verifyButtonEnabled(driver, "Start Free Trial");
        verifyButtonEnabled(driver, "Sign In");

        // Close the browser
        driver.quit();
    }

    // Function to verify the presence of a link
    private static void verifyLinkPresence(WebDriver driver, String linkText) {
        WebElement link = driver.findElement(By.xpath("//a[text()='" + linkText + "']"));
        if (link.isDisplayed()) {
            System.out.println("Link '" + linkText + "' is present on the page.");
        } else {
            System.out.println("Link '" + linkText + "' is not present on the page.");
        }
    }

    // Function to verify a button is enabled
    private static void verifyButtonEnabled(WebDriver driver, String buttonText) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonText + "']"));
        if (button.isEnabled()) {
            System.out.println("Button '" + buttonText + "' is enabled on the page.");
        } else {
            System.out.println("Button '" + buttonText + "' is not enabled on the page.");
        }
    }
}

