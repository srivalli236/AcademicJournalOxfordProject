package com.academicjournalsOup.stepDefinition;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.academicjournalsOup.utility.BrowserFactory;
import com.academicjournalsOup.utility.ConfigReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Represents testing to check the functionality Sign-in page on the website: https://academic.oup.com/journals 
 *
 * Bugs: none known
 *
 * @author       Group
 * @version      Selenium 2020    
 */
public class SigninstepDef {
	
	 public WebDriver driver;	//Initialising webdriver
	 ConfigReader Config = new ConfigReader();	//Creating a methid for ConfigReader class
	 Logger logger;	//Initialising Logger
	 
   /**
    * Invoking a method to open the desired browser and URL
    * @throws Throwable
    */
   @Given("^Open the Web site and launch the application$")				
   public void Open_the_Web_site_and_launch_the_application() throws Throwable {	
	   	//the below steps will open the desired browser and the desired URL
	   	BrowserFactory browserfactory=new BrowserFactory();
	   	logger = Logger.getLogger("Steps");
	   	PropertyConfigurator.configure("Log4j.properties");
	   	driver=browserfactory.startBrowser("chrome", Config.getApplicationURL());
	   	logger.info("Browser is launched and navigated to desired  URL");
    }	
   
   /**
    * Invoking a method to select the sign in option,a pop up appears and provides User name and password credentials
    * @throws Throwable
    */
   @When("^Enter the valid user name password in signin Pop up$")					
   public void Enter_the_valid_user_name_password_in_signin_Pop_up() throws Throwable {	
	   	//the below step will select the sign in option,a pop up appears and provides User name and password credentials
	   	com.academicOupjournals.Pages.Signinpage sp= PageFactory.initElements(driver,com.academicOupjournals.Pages.Signinpage.class);
	    //To create an object with argument you need to create a constructor
 	   	//If you create object for any class constructor method of that class will be executed
	    sp.signinclick();
		sp.UsernameNPassword();
	}
   
   /**
    * Invoking a method to click on the sign in button
    * @throws Throwable
    */
   @When("^sign in with the valid data$")					
   public void sign_in_with_the_valid_data() throws Throwable {
	   	//the below step will click on the sign in button
	    com.academicOupjournals.Pages.Signinpage sp= PageFactory.initElements(driver,com.academicOupjournals.Pages.Signinpage.class);
	   	sp.Signin();
	   	logger.info("click action performed on signin button");
	   	Thread.sleep(2000);	
   }
   
   /**
    * Invoking a method to check if the desired user page is directed or not and finally closes the website
    * @throws Throwable
    */
   @Then("^user page is visible and browser is closed$")
   public void user_page_is_visible_and_browser_is_closed() throws Throwable {
	   	//the below step will check if the desired user page is directed or not and finally closes the website
	    com.academicOupjournals.Pages.Signinpage sp=  PageFactory.initElements(driver,com.academicOupjournals.Pages.Signinpage.class);
	   	sp.Userpage();
	   	Thread.sleep(2000);
	   	logger.info("userpage is displayed ");
	   	driver.close();
	   	logger.info("browser is closed ");
   }
   
   /**
    * Invoking a method to select the sign in option, a pop up appears and provides user name and password credentials
    * @throws Throwable
    */
   @When("^Enter the invalid user name password in signin Pop up$")					
   public void Enter_the_invalid_user_name_password_in_signin_Pop_up() throws Throwable {	
	   	//the below step will select the sign in option,a pop up appears and provides user name and password credentials
	   	Thread.sleep(4000);
	   	com.academicOupjournals.Pages.Signinpage sp= PageFactory.initElements(driver,com.academicOupjournals.Pages.Signinpage.class);
		sp.signinclick();
		sp.UsernameNPassword1();
	}
   
   /**
    * Invoking a method to click on the sign in button
    * @throws Throwable
    */
   @When("^sign in with the invalid data$")					
   public void sign_in_with_the_invalid_data() throws Throwable {
	   	//the below step will click on the sign in button
	    com.academicOupjournals.Pages.Signinpage sp= PageFactory.initElements(driver,com.academicOupjournals.Pages.Signinpage.class);
	   	sp.Signin();
	   	logger.info("click action performed on signin button");
	   	Thread.sleep(2000);
   }
   
   /**
    * Invoking a method to check if the desired user page is directed or not and finally closes the web site
    * @throws Throwable
    */
   @Then("^user page is not visible and browser is closed$")
   public void user_page_is_not_visible_and_browser_is_closed() throws Throwable {
	   	//the below step will check if the desired user page is directed or not and finally closes the web site
	    com.academicOupjournals.Pages.Signinpage sp=  PageFactory.initElements(driver,com.academicOupjournals.Pages.Signinpage.class);
	   	sp.Userpage();
	   	Thread.sleep(2000);
	   	logger.info("userpage is not displayed ");
	   	driver.close();	//This method will close the current tab
	   	logger.info("browser is closed ");
   }
}
