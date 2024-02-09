package stepDefinitions;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class parameterStep {
	
	WebDriver driver;
	
	@Given("User is on the SauceDemo app login page")
	public void user_is_on_the_sauce_demo_app_login_page() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
	}

	@When("User enters valid username {string} and password {string}")
	public void user_enters_valid_username_and_password(String username, String password) throws InterruptedException {
		  	
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        WebElement submitButton = driver.findElement(By.id("login-button"));
        submitButton.click();
	}

	@Then("The Pages titles should be \"([^\\\"]*)\\\"$")
	public void page_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
      Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("User enters invalid username {string} and password {string}")
	public void user_enters_invalid_username_and_password(String username, String password) throws InterruptedException {

        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        Thread.sleep(2000);
        WebElement submitButton = driver.findElement(By.id("login-button"));
        submitButton.click();
	}

	@Then("The User should see an error message on the login page as {string}")
	public void the_user_should_see_an_error_message_on_the_login_page(String expectedErrorMessage) throws InterruptedException {
		WebElement errorMessage = driver.findElement(By.className("error-message-container"));
		Thread.sleep(2000);
	    Assert.assertTrue(errorMessage.isDisplayed());
	}

	@After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
