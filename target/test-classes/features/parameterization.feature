Feature: Login Functionality Test

  Scenario Outline: Valid User Login
    Given User is on the SauceDemo app login page
    When User enters valid username "<username>" and password "<password>"
    Then The Pages titles should be "Swag Labs"
    
    Examples:
      | username      | password |
      | standard_user | secret_sauce |
      | locked_out_user | secret_sauce |
      

  Scenario Outline: Invalid User Login
    Given User is on the SauceDemo app login page
    When User enters invalid username "<username>" and password "<password>"
    Then The User should see an error message on the login page as "Epic sadface: Username and password do not match any user in this service"

    Examples:
      | username    | password |
      | invaliduser1| invalidpass1 |
      | invaliduser2| invalidpass2 |
     