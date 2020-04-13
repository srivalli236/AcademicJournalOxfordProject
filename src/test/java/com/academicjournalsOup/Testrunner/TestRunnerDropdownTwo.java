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
tags = {"@TC_01, @TC_02, @TC_03, @TC_04, @TC_05, @TC_06"})

public class TestRunnerDropdownTwo {
	private TestNGCucumberRunner testRunner;

	/**
	 * Executed before the first "@Test" method in JUnit test class for DropdownTwo
	 */
	@BeforeClass
	public void setUP()
	{
		testRunner = new TestNGCucumberRunner(TestRunnerDropdownTwo.class);			
	}

	/**
	 * Executed for all "@Test" methods for Register page for DropdownTwo
	 * @param cFeature
	 */
	@Test(description="checking dropdown",dataProvider="features")
	public void dropdown(CucumberFeatureWrapper cFeature)
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}

	/**
	 * Extracts data from the external file for DropdownTwo
	 * @return
	 */
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}

	/**
	 * Executed after the "@Test" methods in the JUnit test class for for DropdownTwo
	 * @throws InterruptedException
	 */
	@AfterClass
	public void tearDown() throws InterruptedException
	{		
		testRunner.finish();
		
	}
}