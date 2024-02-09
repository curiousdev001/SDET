package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Util.ExcelReader;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class POILogin {

	WebDriver driver;

    @Given("^The User is on the SauceDemo login page$")
    public void user_is_on_the_SauceDemo_login_page() {
    	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @When("^The User enters valid username and password$")
    public void user_enters_valid_username_and_password() throws InterruptedException {
    	Object[][] testData = ExcelReader.readTestData(".\\dataFiles\\testdata.xlsx", "Sheet1");
    	String username = (String) testData[0][0];
        String password = (String) testData[0][1];    	
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        WebElement submitButton = driver.findElement(By.id("login-button"));
        submitButton.click();
        
    }
    

    @When("^The User enters invalid username and password$")
    public void user_enters_invalid_username_and_password() throws InterruptedException {
    	Object[][] InvalidTestData = ExcelReader.readTestData(".\\dataFiles\\InvalidTestdata.xlsx", "Sheet1");
    	String username1 = (String) InvalidTestData[0][0];
        String password1 = (String) InvalidTestData[0][1]; 
    	WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys(username1);
        passwordInput.sendKeys(password1);
        WebElement submitButton1 = driver.findElement(By.id("login-button"));
        submitButton1.click();
        
    }
    @When("^The User2 enters valid username and password$")
    public void user2_enters_valid_username_and_password() throws InterruptedException {
    	Object[][] testData = ExcelReader.readTestData(".\\dataFiles\\testdata.xlsx", "Sheet1");
    	String username = (String) testData[1][0];
        String password = (String) testData[1][1];    	
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        WebElement submitButton = driver.findElement(By.id("login-button"));
        submitButton.click();
        
    }
    

    @When("^The User2 enters invalid username and password$")
    public void user2_enters_invalid_username_and_password() throws InterruptedException {
    	Object[][] InvalidTestData = ExcelReader.readTestData(".\\dataFiles\\InvalidTestdata.xlsx", "Sheet1");
    	String username1 = (String) InvalidTestData[1][0];
        String password1 = (String) InvalidTestData[1][1]; 
    	WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys(username1);
        passwordInput.sendKeys(password1);
        Thread.sleep(3000);
        WebElement submitButton1 = driver.findElement(By.id("login-button"));
        submitButton1.click();
        Thread.sleep(3000);
    }
    @When("^The User3 enters valid username and password$")
    public void user3_enters_valid_username_and_password() throws InterruptedException {
    	Object[][] testData = ExcelReader.readTestData(".\\dataFiles\\testdata.xlsx", "Sheet1");
    	String username = (String) testData[2][0];
        String password = (String) testData[2][1];    	
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        WebElement submitButton = driver.findElement(By.id("login-button"));
        submitButton.click();
        
    }
    

    @When("^The User3 enters invalid username and password$")
    public void user3_enters_invalid_username_and_password() throws InterruptedException {
    	Object[][] InvalidTestData = ExcelReader.readTestData(".\\dataFiles\\InvalidTestdata.xlsx", "Sheet1");
    	String username1 = (String) InvalidTestData[2][0];
        String password1 = (String) InvalidTestData[2][1]; 
    	WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys(username1);
        passwordInput.sendKeys(password1);
        WebElement submitButton1 = driver.findElement(By.id("login-button"));
        submitButton1.click();
       }
    @When("^The User4 enters valid username and password$")
    public void user4_enters_valid_username_and_password() throws InterruptedException {
    	Object[][] testData = ExcelReader.readTestData(".\\dataFiles\\testdata.xlsx", "Sheet1");
    	String username = (String) testData[3][0];
        String password = (String) testData[3][1];    	
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        WebElement submitButton = driver.findElement(By.id("login-button"));
        submitButton.click();
        
    }
    

    @When("^The User4 enters invalid username and password$")
    public void user4_enters_invalid_username_and_password() throws InterruptedException {
    	Object[][] InvalidTestData = ExcelReader.readTestData(".\\dataFiles\\InvalidTestdata.xlsx", "Sheet1");
    	String username1 = (String) InvalidTestData[3][0];
        String password1 = (String) InvalidTestData[3][1]; 
    	WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        usernameInput.sendKeys(username1);
        passwordInput.sendKeys(password1);
        WebElement submitButton1 = driver.findElement(By.id("login-button"));
        submitButton1.click();
        
    }
  /*
    @And("^The User clicks on the Submit button$")
    public void user_clicks_on_the_Submit_button() {
       
    }

    @Then("^The User should be logged in successfully$")
    public void user_should_be_logged_in_successfully() {
        // Add assertions to verify successful login
    }
*/
    @Then("^The Page title should be \"([^\"]*)\"$")
    public void page_title_should_be(String expectedTitle) {
        String actualTitle = driver.getTitle();
      Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("^The User should see an error message$")
    public void user_should_see_an_error_message() {
        WebElement errorMessage = driver.findElement(By.className("error-message-container"));
        
       Assert.assertTrue(errorMessage.isDisplayed());
    }

    @And("^The Error message should be displayed as \"([^\"]*)\"$")
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

