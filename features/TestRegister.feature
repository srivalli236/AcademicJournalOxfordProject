Feature: Test Wordpress login scenario

@R_01
  Scenario Outline: Test login with valid credentials and Invalid credentials
    Given Open chrome and start application
    When I click on register button
    When I enter valid "<usernameNumber>" 
    When user should be able to register
    Then application should be closed

    Examples: 
   |usernameNumber|
   |1   	|
   |2       |


