package com.academicOupjournals.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.academicjournalsOup.utility.BrowserFactory;
import com.academicjournalsOup.utility.ConfigReader;

/**
 *This class helps to create methods which are invoked in DropdownOnestepDef.java
 */
public class DropdownOne {

	WebDriver driver;

	public DropdownOne(WebDriver driver) {
		this.driver = driver;
	}
	ConfigReader config=new ConfigReader();

	By JournalsbySubject = By.xpath("//nav[@class='navbar-menu']//a[@class='nav-link dummy-link'][contains(text(),'Journals by Subject')]");
	By ArtsnHumanities = By.linkText("Arts & Humanities");
	By Law = By.xpath("//nav[@class='navbar-menu']//a[contains(@class,'nav-link')][contains(text(),'Law')]");
	By MedicinenHealth = By.xpath("//nav[@class='navbar-menu']//a[contains(@class,'nav-link')][contains(text(),'Medicine & Health')]");
	By ScinMath = By.xpath("//nav[@class='navbar-menu']//a[contains(@class,'nav-link')][contains(text(),'Science & Mathematics')]");
	By SocialSci = By.xpath("//nav[@class='navbar-menu']//a[contains(@class,'nav-link')][contains(text(),'Social Sciences')]");

	/**
	 * Creating a method to navigate to application URL
	 */
	public void homepage() {
		BrowserFactory bf=new BrowserFactory();
		driver=bf.startBrowser("firefox", "https://academic.oup.com/journals");
		System.out.println(driver.getTitle());
	}

	/**
	 * Creating a method to click on the first dropdown: JournalsbySubject
	 */
	public void JournalsbySubject() {
		driver.findElement(JournalsbySubject).click();	
	}

	/**
	 * Creating a method to click the first value in the dropdown: ArtsnHumanities
	 */
	public void ArtsnHumanities() {
		System.out.println("driver=" +driver);
		driver.findElement(ArtsnHumanities).click();
	}

	/**
	 * Creating a method to click the second value in the dropdown: Law
	 */
	public void Law() {
		System.out.println("driver=" +driver);
		driver.findElement(Law).click();
	}

	/**
	 * Creating a method to click the third value in the dropdown: MedicinenHealth
	 */
	public void MedicinenHealth() {
		System.out.println("driver=" +driver);
		driver.findElement(MedicinenHealth).click();
	}

	/**
	 * Creating a method to click the fourth value in the dropdown: ScinMath
	 */
	public void ScinMath() {
		System.out.println("driver=" +driver);
		driver.findElement(ScinMath).click();
	}

	/**
	 * Creating a method to click the fifth value in the dropdown: SocialSci
	 */
	public void SocialSci() {
		System.out.println("driver=" +driver);
		driver.findElement(SocialSci).click();
	}

	/**
	 * Creating a method to check if the browser has navigated to firstvaluepage
	 */
	public void firstvaluepage() {
		Assert.assertEquals("https://academic.oup.com/journals/pages/arts_and_humanities", driver.getCurrentUrl());
		System.out.println("navigated");
	}

	/**
	 * Creating a method to check if the browser has navigated to secondvaluepage
	 */
	public void secondvaluepage() {
		Assert.assertEquals("https://academic.oup.com/journals/pages/law", driver.getCurrentUrl());
		System.out.println("navigated");
	}

	/**
	 * Creating a method to check if the browser has navigated to thirdvaluepage
	 */
	public void thirdvaluepage() {
		Assert.assertEquals("https://academic.oup.com/journals/pages/medicine_and_health", driver.getCurrentUrl());
		System.out.println("navigated");
	}
	
	/**
	 * Creating a method to check if the browser has navigated to fourthvaluepage
	 */
	public void fourthvaluepage() {
		Assert.assertEquals("https://academic.oup.com/journals/pages/science_and_mathematics", driver.getCurrentUrl());
		System.out.println(" navigated");
	}

	/**
	 * Creating a method to check if the browser has navigated to fifthvaluepage
	 */
	public void fifthvaluepage() {
		Assert.assertEquals("https://academic.oup.com/journals/pages/social_sciences", driver.getCurrentUrl());
		System.out.println(" navigated");
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
	
	/**
	 * This method pauses the browser for a specified duration
	 * @param timeout
	 * @throws InterruptedException
	 */
	public void Wait(int timeout) throws InterruptedException
	{
		TimeUnit.SECONDS.sleep(timeout);
	}
	
	/**
	 * The below method is used to close the current window
	 */
	public void closebrowser()
	{
		driver.close();
	}

}