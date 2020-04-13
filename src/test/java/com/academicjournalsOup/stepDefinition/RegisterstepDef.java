package com.academicjournalsOup.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.academicjournalsOup.utility.ExcelDataConfig;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Represents testing to register a new user on the website: https://academic.oup.com/journals
 *
 * Bugs: none known
 *
 * @author       Group
 * @version      Selenium 2020    
 */

/**
 * This class helps us extract data from the Excel sheet
 */
public class RegisterstepDef {
	
	ExcelDataConfig configExcel=new ExcelDataConfig("./src/test/resources/XLSX/Worksheet.xlsx");	//Extracting data from the excel sheet
	WebDriver driver;	//Initializing webdriver
	public static ExtentReports report = new ExtentReports("./Extent-Reports/ExtentReportThree.html");	//Using ExtentReports for generating extent reports
	ExtentTest test = report.startTest("logInTest");
	
	/**
	 * Creating a method to call the specific browser driver and navigate to home URL
	 * @throws Throwable
	 */
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {

		/**
		 * Webdriver is an interface 
		 * It provides all the required methods to automate
		 * So, the return type should be webdriver
		 */
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/binaries/geckodriver.exe");
		driver=new FirefoxDriver();       

		driver.get("https://academic.oup.com/journals");
		driver.manage().window().maximize();
	}

	/**
	 * Creating a method to click the register button as defined by the xpath 
	 * @throws Throwable
	 */
	@When("^I click on register button$")
	public void user_clicks_on_register_button() throws Throwable {
		driver.findElement(By.xpath("//a[@class='register']")).click();
		Assert.assertEquals("https://academic.oup.com/my-account/register?siteId=5567&returnUrl=%2fjournals", driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		test.log(LogStatus.PASS, "Authentication sucessfully");
		System.out.println("User is able to login sucessfully"); 
	}
	
	/**
	 * Creating a method to enter text data in all the text boxes as defined by the element locators 
	 * @throws Throwable
	 */
	@When("^I enter valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String usernameNumber) throws Throwable {
		Object[][] data=configExcel.passData();
		String username="";
		String password="";
		String confirmPassword="";
		
		
		if(null!= usernameNumber ) {
			int userCount = Integer.parseInt(usernameNumber.trim());

			username = (String )data[userCount-1][0];
			password = (String )data[userCount-1][1];
			confirmPassword = (String )data[userCount-1][2];
			
			test.log(LogStatus.PASS, "Authentication sucessfully");
		}
		
		driver.findElement(By.id("EmailAddress")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password); 
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		Thread.sleep(3000);
	}

	/**
	 * Creating a method to click the register button on the register page as defined by the xpath 
	 * @throws Throwable
	 */
	@When("^user should be able to register$")
	public void user_should_be_able_to_register() throws Throwable {
		
		WebElement element = driver.findElement(By.xpath("//button[@id='registerBtn']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		Thread.sleep(20000);
		Assert.assertEquals("https://academic.oup.com/journals", driver.getCurrentUrl());
		System.out.println(driver.getCurrentUrl());
		test.log(LogStatus.PASS, "Authentication sucessfully");
		System.out.println("User is able to register sucessfully"); 
	}

	/**
	 * Creating a method to close the application
	 * @throws Throwable
	 */
	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
		driver.quit();
		
		
	}
}
