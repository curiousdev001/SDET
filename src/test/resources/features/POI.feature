Feature: Login Functionality Verification

  Scenario: Verify successful login
    Given The User is on the SauceDemo login page
    When The User enters valid username and password
    Then The Page title should be "Swag Labs"
    
  Scenario: Verify unsuccessful login with invalid credentials
    Given The User is on the SauceDemo login page
    When The User enters invalid username and password
    Then The Error message should be displayed as "Epic sadface: Username and password do not match any user in this service"
    
  Scenario: Verify successful login
    Given The User is on the SauceDemo login page
    When The User2 enters valid username and password
    Then The Page title should be "Swag Labs"
    
  Scenario: Verify unsuccessful login with invalid credentials
    Given The User is on the SauceDemo login page
    When The User2 enters invalid username and password
    Then The Error message should be displayed as "Epic sadface: Username and password do not match any user in this service"
    
  Scenario: Verify successful login
    Given The User is on the SauceDemo login page
    When The User3 enters valid username and password
    Then The Page title should be "Swag Labs"
    
  Scenario: Verify unsuccessful login with invalid credentials
    Given The User is on the SauceDemo login page
    When The User3 enters invalid username and password
    Then The Error message should be displayed as "Epic sadface: Username and password do not match any user in this service"
    
  Scenario: Verify successful login
    Given The User is on the SauceDemo login page
    When The User4 enters valid username and password
    Then The Page title should be "Swag Labs"
    
  Scenario: Verify unsuccessful login with invalid credentials
    Given The User is on the SauceDemo login page
    When The User4 enters invalid username and password
    Then The Error message should be displayed as "Epic sadface: Username and password do not match any user in this service"  