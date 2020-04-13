package com.academicOupjournals.Pages;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.academicjournalsOup.utility.BrowserFactory;
import com.academicjournalsOup.utility.ConfigReader;

/**
 *This class helps to create methods which are invoked in DropdownTwostepDef.java
 */
public class DropdownTwo {
	WebDriver driver;
	
	public DropdownTwo(WebDriver driver) {
		this.driver = driver;
	}
	ConfigReader config=new ConfigReader();
	
	By resources=By.xpath("//nav[@class='navbar-menu']//a[@class='nav-link dummy-link'][contains(text(),'Resources')]");
	By authors=By.xpath("//nav[@class='navbar-menu']//a[contains(@class,'nav-link')][contains(text(),'Authors')]");
	By librarians=By.xpath("//nav[@class='navbar-menu']//a[contains(@class,'nav-link')][contains(text(),'Librarians')]");
	By societies=By.xpath("//nav[@class='navbar-menu']//a[contains(@class,'nav-link')][contains(text(),'Societies')]");
	By sponsors=By.xpath("//nav[@class='navbar-menu']//a[contains(@class,'nav-link')][contains(text(),'Sponsors & Advertisers')]");
	By press=By.xpath("//nav[@class='navbar-menu']//a[contains(@class,'nav-link')][contains(text(),'Press')]");
	By agents=By.xpath("//nav[@class='navbar-menu']//a[contains(@class,'nav-link')][contains(text(),'Agents')]");
	
	/**
	 * Creating a method to navigate to application URL
	 */
	public void homepage() {
		BrowserFactory bf=new BrowserFactory();
		driver=bf.startBrowser("firefox", "https://academic.oup.com/journals");
		System.out.println(driver.getTitle());
	}
	
	/**
	 * Creating a method to click on the first dropdown: resources
	 */
	public void resources() {
		driver.findElement(resources).click();	
	}
	
	/**
	 * Creating a method to click the first value in the dropdown: authors
	 */
	public void firstitem() {
		System.out.println("driver=" +driver);
		driver.findElement(authors).click();
	}
	
	/**
	 * Creating a method to check if the browser has successfully navigated to firstitempage
	 */
	public void firstitempage() {
		Assert.assertEquals("https://academic.oup.com/journals/pages/authors", driver.getCurrentUrl());
		System.out.println("successfully navigated to next page");
	}
	
	/**
	 * Creating a method to click the second value in the dropdown: librarians
	 */
	public void seconditem() {
	    System.out.println("driver=" +driver);
			driver.findElement(librarians).click();
	}
	
	/**
	 * Creating a method to check if the browser has successfully navigated to seconditempage
	 */
	public void seconditempage() {
			Assert.assertEquals("https://academic.oup.com/journals/pages/librarians", driver.getCurrentUrl());
			System.out.println("successfully navigated to next page");
	}
	
	/**
	 * Creating a method to click the third value in the dropdown: societies
	 */
	public void thirditem() {
	    System.out.println("driver=" +driver);
			driver.findElement(societies).click();
	}
	
	/**
	 * Creating a method to check if the browser has successfully navigated to thirditempage
	 */
	public void thirditempage() {
			Assert.assertEquals("https://academic.oup.com/journals/pages/societies", driver.getCurrentUrl());
			System.out.println("successfully navigated to next page");
	}
	
	/**
	 * Creating a method to click the fourth value in the dropdown: sponsors
	 */
	public void fourthitem() {
	    System.out.println("driver=" +driver);
			driver.findElement(sponsors).click();
	}
	
	/**
	 * Creating a method to check if the browser has successfully navigated to fourthitempage
	 */
	public void fourthitempage() {
			Assert.assertEquals("https://academic.oup.com/journals/pages/sponsorship_and_advertising", driver.getCurrentUrl());
			System.out.println("successfully navigated to next page");
	}
	
	/**
	 * Creating a method to click the fifth value in the dropdown: press
	 */
	public void fifthitem() {
	    System.out.println("driver=" +driver);
			driver.findElement(press).click();
	}
	
	/**
	 * Creating a method to check if the browser has successfully navigated to fifthitempage
	 */
	public void fifthitempage() {
			Assert.assertEquals("https://academic.oup.com/journals/pages/press", driver.getCurrentUrl());
			System.out.println("successfully navigated to next page");
	}
	
	/**
	 * Creating a method to click the sixth value in the dropdown: agents
	 */
	public void sixthitem() {
	    System.out.println("driver=" +driver);
			driver.findElement(agents).click();
	}
	
	/**
	 * Creating a method to check if the browser has successfully navigated to sixthitempage
	 */
	public void sixthitempage() {
			Assert.assertEquals("https://academic.oup.com/journals/pages/agents", driver.getCurrentUrl());
			System.out.println("successfully navigated to next page");
	}
	
	/**
	 * Creating a method to take screenshot and save it in the Screenshots folder
	 * @param path
	 * @throws IOException
	 */
	public void screenshot(String path) throws IOException { //for taking screenshots
		TakesScreenshot ts= (TakesScreenshot)driver;
		File sr=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sr, new File(path));
	}
	
	public void Wait(int timeout) throws InterruptedException {
		TimeUnit.SECONDS.sleep(timeout);
	}
	
	public void closebrowser()//closing the opened window
	{
		driver.close();
	}
	
}
