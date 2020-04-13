package com.academicjournalsOup.utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

/**
 * Represents methods for calling browsers and URL
 *
 * Bugs: none known
 *
 * @author       Group
 * @version      Selenium 2020    
 */

/**
 * This is the class which helps us set path for web driver of the browser and path for application url
 */
public class ConfigReader {
	/**
	 * Creating a method for Properties  
	 */
	Properties pro;

	public ConfigReader() {

		try {
			File src=new File("./Configuration/Config.property"); //Fetching the file Config.property in configuration directory

			FileInputStream fis=new FileInputStream(src); 

			pro=new Properties();

			pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is" + e.getMessage());
		}

	}
	/**
	 * This method help us getting the chromedirver location
	 * @return
	 */
	public String getchromepath() {
		String path1=pro.getProperty("chromeDriver");
		return path1;
	}
	/**
	 * This method help us getting the firefox location
	 * @return
	 */
	public String getFirefoxDriver() {
		String path2=pro.getProperty("FirefoxDriver");
		return path2;
	}
	/**
	 * This method help us getting the location of application URL
	 * @return
	 */
	public String getApplicationURL() {
		return pro.getProperty("URL");
	}

}
