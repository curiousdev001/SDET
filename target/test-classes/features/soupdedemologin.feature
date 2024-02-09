Feature: Login Functionality Verification

  Scenario: Verify successful login
    Given User is on the SauceDemo login page
    When User enters valid username and password
    And User clicks on the Submit button
    Then User should be logged in successfully
    And Page title should be "Swag Labs"

  Scenario: Verify unsuccessful login with invalid credentials
    Given User is on the SauceDemo login page
    When User enters invalid username and password
    And User clicks on the Submit button
    Then User should see an error message
    And Error message should be displayed as "Epic sadface: Username and password do not match any user in this service"

