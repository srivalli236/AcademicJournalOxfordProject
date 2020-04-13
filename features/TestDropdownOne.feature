@Feature
Feature:  test academicjounalsOup Website


 @TS_D01TC01
  Scenario: Selecting the first value in the dropdown
    Given user opens firefox browser and navigates to the academicjournalsOup homepage	
    When user selects a dropdown
    And user selects first value in the dropdown
    Then the user should be able to navigate to the first page

  @TS_D01TC02
  Scenario: Selecting the second value in the dropdown
    Given user opens firefox browser and navigates to the academicjournalsOup homepage
    When user selects a dropdown
    And user selects second value in the dropdown
    Then the user should be able to navigate to the second page
    
    @TS_D01TC03
  Scenario: Selecting the third value in the dropdown
    Given user opens firefox browser and navigates to the academicjournalsOup homepage
    When user selects a dropdown
    And user selects third value in the dropdown
    Then the user should be able to navigate to the third page
    
   @TS_D01TC04
  Scenario: Selecting the fourth value in the dropdown
    Given user opens firefox browser and navigates to the academicjournalsOup homepage
    When user selects a dropdown
    And user selects fourth value in the dropdown
    Then the user should be able to navigate to the fourth page
    
  @TS_D01TC05
  Scenario: Selecting the fifth value in the dropdown
    Given user opens firefox browser and navigates to the academicjournalsOup homepage
    When user selects a dropdown
    And user selects fifth value in the dropdown
    Then the user should be able to navigate to the fifth page