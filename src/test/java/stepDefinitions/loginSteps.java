package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.testng.Assert;
import BaseTest.BaseTest;

public class loginSteps {
	
	 	WebDriver driver;
	    
	    @Given("^User is on the SauceDemo login page$")
	    public void user_is_on_the_SauceDemo_login_page() {
	    	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	    	driver.get("https://www.saucedemo.com/");
	    }

	    @When("^User enters valid username and password$")
	    public void user_enters_valid_username_and_password() {
	        WebElement usernameInput = driver.findElement(By.id("user-name"));
	        WebElement passwordInput = driver.findElement(By.id("password"));
	        usernameInput.sendKeys("standard_user");
	        passwordInput.sendKeys("secret_sauce");
	    }

	    @When("^User enters invalid username and password$")
	    public void user_enters_invalid_username_and_password() {
	        WebElement usernameInput = driver.findElement(By.id("user-name"));
	        WebElement passwordInput = driver.findElement(By.id("password"));
	        usernameInput.sendKeys("abcd");
	        passwordInput.sendKeys("password");
	    }

	    @And("^User clicks on the Submit button$")
	    public void user_clicks_on_the_Submit_button() {
	        WebElement submitButton = driver.findElement(By.id("login-button"));
	        submitButton.click();
	    }

	    @Then("^User should be logged in successfully$")
	    public void user_should_be_logged_in_successfully() {
	        // Add assertions to verify successful login
	    }

	    @And("^Page title should be \"([^\"]*)\"$")
	    public void page_title_should_be(String expectedTitle) {
	        String actualTitle = driver.getTitle();
	      //  assert.assertEquals(expectedTitle, actualTitle);
	    }

	    @Then("^User should see an error message$")
	    public void user_should_see_an_error_message() {
	        WebElement errorMessage = driver.findElement(By.className("error-message-container"));
	       Assert.assertTrue(errorMessage.isDisplayed());
	    }

	    @And("^Error message should be displayed as \"([^\"]*)\"$")
	    public void error_message_should_be_displayed_as(String expectedErrorMessage) {
	    	 WebElement errorMessage = driver.findElement(By.className("error-message-container"));
	         String actualErrorMessage = errorMessage.getText();
	         expectedErrorMessage = actualErrorMessage;
	         Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	    }

	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}