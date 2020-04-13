package com.academicjournalsOup.stepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.academicOupjournals.Pages.DropdownOne;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Represents testing a Dropdown-"Journals by Subject" on the website: https://academic.oup.com/journals
 *
 * Bugs: 		 none known
 *
 * @author       Group
 * @version      Selenium 2020    
 */

/**
 * This class helps to test the first Dropdown using gherkin language from cucumber
 */
public class DropdownOnestepDef {

	WebDriver driver;
	Logger logger;
	DropdownOne sk=new DropdownOne(driver);

	public static ExtentReports report = new ExtentReports("./Extent-Reports/ExtentReportOne.html"); //Using Extentreports creating a new extent report
	ExtentTest test = report.startTest("dropdowntest");

	/**
	 * Creating the method for opening firefox browser and navigationg to homepage
	 * @throws Throwable
	 */
	@Given("^user opens firefox browser and navigates to the academicjournalsOup homepage$")
	public void the_user_opens_the__homepageOne() throws Throwable {
		sk.homepage();
		logger = Logger.getLogger("steps");
		PropertyConfigurator.configure("Log4j.properties");
		test.log(LogStatus.PASS, "Navigated to homepage successfully");
		logger.info("Browser is launched and navigated to url");
	}

	/**
	 * Using the method from DropdownOne.java for selecting a dropdown
	 * @throws Throwable
	 */
	@When("^user selects a dropdown$")
	public void the_user_selects_dropdownOne() throws Throwable {
		sk.JournalsbySubject();
		logger.info("First dropdown is selected");
	}

	/**
	 * Using the method from DropdownOne.java for seleting the first value of Dropdown
	 * @throws Throwable
	 */
	@And("^user selects first value in the dropdown$")
	public void the_user_select_on_the_firstvalue() throws Throwable {
		sk.ArtsnHumanities();
		logger.info("Firstvalue in dropdown is selected");
	}

	/**
	 * Using the method from DropdownOne.java to navigate to the first page
	 * Taking a screenshot and closing the browser
	 * @throws Throwable
	 */
	@Then("^the user should be able to navigate to the first page$")
	public void the_user_should_navigate_to_firsvaluepage() throws Throwable {
		sk.firstvaluepage();
		logger.info("successfully navigated to firstvalue page");
		sk.Wait(3);
		sk.screenshot("./Screenshots/dd1.png");
		test.log(LogStatus.PASS, "Navigated to firstvaluepage successfully");
		sk.closebrowser();
	}

	/**
	 *  Using the method from DropdownOne.java to select second value in the dropdown
	 * @throws Throwable
	 */
	@And("^user selects second value in the dropdown$")
	public void the_user_select_on_the_secondvalue() throws Throwable {
		sk.Law();
		logger.info("Secondvalue in dropdown is selected");
	}

	/**
	 *  Using the method from DropdownOne.java to navigate to the second page 
	 *  Taking a screenshot and closing the browser
	 * @throws Throwable
	 */
	@Then("^the user should be able to navigate to the second page$")
	public void the_user_should_navigate_to_secondvaluepage() throws Throwable {
		sk.secondvaluepage();
		logger.info("successfully navigated to secondvalue page");
		sk.Wait(3);
		sk.screenshot("./Screenshots/dd2.png");
		test.log(LogStatus.PASS, "Navigated to secondvaluepage successfully");
		sk.closebrowser();
	}

	/**
	 *  Using the method from DropdownOne.java to select third value in the dropdown
	 * @throws Throwable
	 */
	@And("^user selects third value in the dropdown$")
	public void the_user_select_on_the_thirdvalue() throws Throwable {
		sk.MedicinenHealth();
		logger.info("Thirdvalue in dropdown is selected");
	}

	/**
	 *  Using the method from DropdownOne.java to navigate to the third page 
	 *  Taking a screenshot and closing the browser
	 * @throws Throwable
	 */
	@Then("^the user should be able to navigate to the third page$")
	public void the_user_should_navigate_to_thirdvaluepage() throws Throwable {
		sk.thirdvaluepage();
		logger.info("successfully navigated to thirdvalue page");
		sk.Wait(3);
		sk.screenshot("./Screenshots/dd3.png");
		test.log(LogStatus.PASS, "Navigated to thirdvaluepage successfully");
		sk.closebrowser();
	}

	/**
	 *  Using the method from DropdownOne.java to select fourth value in the dropdown
	 * @throws Throwable
	 */
	@And("^user selects fourth value in the dropdown$")
	public void the_user_select_on_the_fourthvalue() throws Throwable {
		sk.ScinMath();
		logger.info("fourth value in dropdown is selected");
	}

	/**
	 *  Using the method from DropdownOne.java to navigate to the fourth page 
	 *  Taking a screenshot and closing the browser
	 * @throws Throwable
	 */
	@Then("^the user should be able to navigate to the fourth page$")
	public void the_user_should_navigate_to_fourthvaluepage() throws Throwable {
		sk.fourthvaluepage();
		logger.info("successfully navigated to fourthvalue page");
		sk.Wait(3);
		sk.screenshot("./Screenshots/dd4.png");
		test.log(LogStatus.PASS, "Navigated to fourthvaluepage successfully");
		sk.closebrowser();
	}

	/**
	 *  Using the method from DropdownOne.java to select fifth value in the dropdown
	 * @throws Throwable
	 */
	@And("^user selects fifth value in the dropdown$")
	public void the_user_select_on_the_fifthvalue() throws Throwable {
		sk.SocialSci();
		logger.info("fifth value in dropdown is selected");
	}

	/**
	 *  Using the method from DropdownOne.java to navigate to the fifth page
	 *  Taking a screenshot and closing the browser
	 * @throws Throwable
	 */
	@Then("^the user should be able to navigate to the fifth page$")
	public void the_user_should_navigate_to_fifthvaluepage() throws Throwable {
		sk.fifthvaluepage();
		logger.info("successfully navigated to fifthvalue page");
		sk.Wait(3);
		sk.screenshot("./Screenshots/dd5.png");
		test.log(LogStatus.PASS, "Navigated to fifthvaluepage successfully");
		sk.closebrowser();

		test.log(LogStatus.PASS, "Succesfully tested dropdown");
		report.endTest(test);
		report.flush();
	}
}