package com.academicjournalsOup.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Represents code to invoke webdriver and diffrent browsers
 *
 * Bugs: none known
 *
 * @author       Group
 * @version      Selenium 2020    
 */
public class BrowserFactory {
	/**
	 * Creating a method for ConfigReader and using it to fetch the path of chrome path and firefox
	 */
	ConfigReader config=new ConfigReader();

	
	public WebDriver driver; //Initialising the web driver
	/**
	 * Comparing the borwser name, from configreader using the appropriate browser 
	 * @param browserName
	 * @param url
	 * @return
	 */
	public WebDriver startBrowser(String browserName,String url) {
		if(browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", config.getchromepath());
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", config.getFirefoxDriver());
			driver=new FirefoxDriver();
		}

		/**
		 * This method helps in maximising the browser window
		 */
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}