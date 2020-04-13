package com.academicjournalsOup.stepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.academicOupjournals.Pages.DropdownTwo;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Represents testing a Dropdown-"Resources" on the website: https://academic.oup.com/journals
 *
 * Bugs: 	     none known
 *
 * @author       Group
 * @version      Selenium 2020    
 */

/**
 * This class helps to test the Second Dropdown using gherkin language from cucumber
 */
public class DropdownTwostepDef {
	
	WebDriver driver;
	Logger logger;
	DropdownTwo s1=new DropdownTwo(driver);
    
	public static ExtentReports report = new ExtentReports("./Extent-Reports/ExtentReportTwo.html");
	ExtentTest test = report.startTest("dropdowntest");
	
	/**
	 * Creating the method for opening firefox browser and navigationg to homepage
	 * @throws Throwable
	 */
	@Given("^user opens browser and navigates to the academicjournalsOup homepage$")
	public void the_user_opens_the__homepageOne() throws Throwable {
		s1.homepage();
		logger = Logger.getLogger("steps");
		PropertyConfigurator.configure("Log4j.properties");
		test.log(LogStatus.PASS, "Navigated to homepage successfully");
		logger.info("Browser is launched and navigatedto URL");
	}

	/**
	 * Using the method from DropdownTwo.java for selecting a dropdown
	 * @throws Throwable
	 */
	@When("^user selects a dropdownTwo$")
	public void the_user_selects_dropdownTwo() throws Throwable {
		s1.resources();
		logger.info("Fourth dropdown is selected");
	}

	/**
	 * Using the method from DropdownTwo.java for seleting the first item of Dropdown
	 * @throws Throwable
	 */
	@And("^user selects first item in the dropdown$")
	public void the_user_select_on_the_firstitem() throws Throwable {
		s1.firstitem();
		logger.info("First value of dropdown is selected");
	}

	/**
	 * Using the method from DropdownOne.java to navigate to the firstitem page
	 * Taking a screenshot and closing the browser
	 * @throws Throwable
	 */
	@Then("^the user should be able to navigate to the firstitem page$")
	public void the_user_should_navigate_to_firstitempage() throws Throwable {
		s1.firstitempage();
	    s1.Wait(3);
		s1.screenshot("./Screenshots/img1.png");
		test.log(LogStatus.PASS, "Navigated to first item page successfully");
		s1.closebrowser();
	}

	/**
	 * Using the method from DropdownTwo.java for seleting the second item of Dropdown
	 * @throws Throwable
	 */
	@And("^user selects second item in the dropdown$")
	public void the_user_select_on_the_seconditem() throws Throwable {
		s1.seconditem();
		logger.info("Second value of dropdown is selected");
	}

	/**
	 * Using the method from DropdownOne.java to navigate to the seconditem page
	 * Taking a screenshot and closing the browser
	 * @throws Throwable
	 */
	@Then("^the user should be able to navigate to the seconditem page$")
	public void the_user_should_navigate_to_seconditempage() throws Throwable {
		s1.seconditempage();
		s1.Wait(3);
		s1.screenshot("./Screenshots/img2.png");
		test.log(LogStatus.PASS, "Navigated to second item page successfully");
		s1.closebrowser();
	}
	
	/**
	 * Using the method from DropdownTwo.java for seleting the third item of Dropdown
	 * @throws Throwable
	 */
	@And("^user selects third item in the dropdown$")
	public void the_user_select_on_the_thirditem() throws Throwable {
		s1.thirditem();
		logger.info("Third value of dropdown is selected");
	}

	/**
	 * Using the method from DropdownOne.java to navigate to the thirditem page
	 * Taking a screenshot and closing the browser
	 * @throws Throwable
	 */
	@Then("^the user should be able to navigate to the thirditem page$")
	public void the_user_should_navigate_to_thirditempage() throws Throwable {
		s1.thirditempage();
		s1.Wait(3);
		s1.screenshot("./Screenshots/img3.png");
		test.log(LogStatus.PASS, "Navigated to third item page successfully");
		s1.closebrowser();
	}
	
	/**
	 * Using the method from DropdownTwo.java for seleting the fourth item of Dropdown
	 * @throws Throwable
	 */
	@And("^user selects fourth item in the dropdown$")
	public void the_user_select_on_the_fourthitem() throws Throwable {
		s1.fourthitem();
		logger.info("Fourth value of dropdown is selected");
	}

	/**
	 * Using the method from DropdownOne.java to navigate to the fourthitem page
	 * Taking a screenshot and closing the browser
	 * @throws Throwable
	 */
	@Then("^the user should be able to navigate to the fourthitem page$")
	public void the_user_should_navigate_to_fourthitempage() throws Throwable {
		s1.fourthitempage();
		s1.Wait(3);
		s1.screenshot("./Screenshots/img4.png");
		test.log(LogStatus.PASS, "Navigated to fourth item page successfully");
		s1.closebrowser();
	}
	
	/**
	 * Using the method from DropdownTwo.java for seleting the fifth item of Dropdown
	 * @throws Throwable
	 */
	@And("^user selects fifth item in the dropdown$")
	public void the_user_select_on_the_fifthitem() throws Throwable {
		s1.fifthitem();
		logger.info("Fifth value of dropdown is selected");
	}

	/**
	 * Using the method from DropdownOne.java to navigate to the fifthitem page
	 * Taking a screenshot and closing the browser
	 * @throws Throwable
	 */
	@Then("^the user should be able to navigate to the fifthitem page$")
	public void the_user_should_navigate_to_fifthitempage() throws Throwable {
		s1.fifthitempage();
		s1.Wait(3);
		s1.screenshot("./Screenshots/img5.png");
		test.log(LogStatus.PASS, "Navigated to fifth item page successfully");
		s1.closebrowser();
	}
	
	/**
	 * Using the method from DropdownTwo.java for seleting the sixth item of Dropdown
	 * @throws Throwable
	 */
	@And("^user selects sixth item in the dropdown$")
	public void the_user_select_on_the_sixthitem() throws Throwable {
		s1.sixthitem();
		logger.info("Sixth value of dropdown is selected");
	}

	/**
	 * Using the method from DropdownOne.java to navigate to the sixthitem page
	 * Taking a screenshot and closing the browser
	 * @throws Throwable
	 */
	@Then("^the user should be able to navigate to the sixthitem page$")
	public void the_user_should_navigate_to_sixthitempage() throws Throwable {
		s1.sixthitempage();
		s1.Wait(3);
		s1.screenshot("./Screenshots/img6.png");
		test.log(LogStatus.PASS, "Navigated to sixth item page successfully");
		s1.closebrowser();
		report.endTest(test);
		report.flush();
	}

}