package com.academicjournalsOup.Testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
glue= {"com.academicjournalsOup.stepDefinition"},
plugin = {"pretty", "html:reports/cucumber-html-reports"},
tags = {"@TS_D01TC01,@TS_D01TC02, @TS_D01TC03,@TS_D01TC04,@TS_D01TC05"},
monochrome=true)

/**
 * This runs with the help of cucumber 
 *
 * Bugs: none known
 *
 * @author       Group
 * @version      Selenium 2020    
 */
public class TestRunnerDropdownOne {
	private TestNGCucumberRunner testRunner;

	/**
	 * Executed before the first "@Test" method in JUnit test class for DropdownOne 
	 */
	@BeforeClass
	public void setUP()
	{
		testRunner = new TestNGCucumberRunner(TestRunnerDropdownOne.class);			
	}

	/**
	 * Executed for all "@Test" methods for Register page for DropdownOne 
	 * @param cFeature
	 */
	@Test(description="checking dropdown",dataProvider="features")
	public void dropdown(CucumberFeatureWrapper cFeature)
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}

	/**
	 * Extracts data from the external file for DropdownOne
	 * @return
	 */
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}

	/**
	 * Executed after the "@Test" methods in the JUnit test class for for DropdownOne 
	 * @throws InterruptedException
	 */
	@AfterClass
	public void tearDown() throws InterruptedException
	{		
		testRunner.finish();
	}
}