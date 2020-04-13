package com.academicOupjournals.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Creating a class to store the paths of the different web elements used 
 */
public class Signinpage {
	WebDriver driver;
	
	/**
	 * This constructor is binding the foreign driver properties to local driver
	 * To create an object with argument you need to create a constructor
 	 * If you create object for any class constructor method of that class will be executed
	 * @param driver
	 */
	public  Signinpage(WebDriver driver)
	{
		// TODO Auto-generated method stub
         this.driver=driver; 	//"this" keyword is used to differentiate local driver and foreign driver  
	}
	
	/**
	 * "@FindBy" annotation is used to find the locator of the desired element: Signinclick
	 */
	@FindBy(id="header-account-info-user-fullname")
	@CacheLookup  //to instruct initElements() method to cache the elements once it is located
	WebElement Signinclick;
	
	/**
	 * "@FindBy" annotation is used to find the locator of the desired element: Username
	 */
	@FindBy(xpath="//input[@id='user_LoginFormPopup']")
	@CacheLookup  //to instruct initElements() method to cache the elements once it is located
	WebElement Username;
	
	/**
	 * "@FindBy" annotation is used to find the locator of the desired element: Password
	 */
	@FindBy(css="input[type=password]")
	@CacheLookup  //to instruct initElements() method to cache the elements once it is located
	WebElement Password;
	
	/**
	 * "@FindBy" annotation is used to find the locator of the desired element: Signin
	 */
	@FindBy(xpath="//button[@class='signin-button button']")
	@CacheLookup  //to instruct initElements() method to cache the elements once it is located
	WebElement Signin;
	
	/**
	 * Creating a method to invoke signinclick() and click action is performed
	 * @throws Exception
	 */
	public void  signinclick() throws Exception
	{
		//here the signinclick() web element is invoked and click option is performed
		Signinclick.click();
		Thread.sleep(2000);
	}
	
	/**
	 * Passing the text data to text box
	 * @throws Exception
	 */
	public void UsernameNPassword() throws Exception 
	{
		//here the valid data is provided 
		Username.sendKeys("srivalliammu98@gmail.com");
		Thread.sleep(2000);
    	Password.sendKeys("Valli@1998");
    	Thread.sleep(2000);
    }
	
	/**
	 * Click action is performed on the Signin() method 
	 */
    public void Signin() 
    {
        //here the Sign in Web element is invoked and click option is performed
    	Signin.click();	
    }
    
    /**
     * Assert function checks if the actual site is same as the expected site
     */
    public void Userpage() {
    	//the below step checks if the actual site is same as the expected site
    	Assert.assertEquals("https://academic.oup.com/journals",driver.getCurrentUrl());
    	System.out.println("succesfully navigated to userpage");
    }
    
    /**
     * Passing the text data to text box through sendKeys() method
     * @throws Exception
     */
    public void UsernameNPassword1() throws Exception 
	{
		//here the invalid data is provided.
		Username.sendKeys("abcd");
		Thread.sleep(2000);
    	Password.sendKeys("efgh");
    	Thread.sleep(2000);
}
}
