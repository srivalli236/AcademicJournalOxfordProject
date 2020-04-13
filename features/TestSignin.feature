Feature:to test the academy site with data

@S_01
Scenario:to test sign in page functionality
Given Open the Web site and launch the application
When Enter the valid user name password in signin Pop up
When sign in with the valid data
Then user page is visible and browser is closed

@S_02
Scenario:to test sign in page functionality with invalid data
Given Open the Web site and launch the application
When Enter the invalid user name password in signin Pop up
When sign in with the invalid data
Then user page is not visible and browser is closed
