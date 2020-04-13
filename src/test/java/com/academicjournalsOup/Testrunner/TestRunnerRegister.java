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
tags = {"@R_01"},
monochrome=true)

/**
 * This class is used to run the Register page
 */
public class TestRunnerRegister {
	private TestNGCucumberRunner testRunner;

	/**
	 * Executed before the first "@Test" method in JUnit test class for Register page
	 */
	@BeforeClass
	public void setUP()
	{
		testRunner = new TestNGCucumberRunner(TestRunnerRegister.class);			
	}

	/**
	 * Executed for all "@Test" methods for Register page
	 * @param cFeature
	 */
	@Test(description="login",dataProvider="features")
	public void login(CucumberFeatureWrapper cFeature)
	{
		testRunner.runCucumber(cFeature.getCucumberFeature());
	}

	/**
	 * Extracts data from the external file for Register page
	 * @return
	 */
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
		return testRunner.provideFeatures();
	}

	/**
	 * Executed after the "@Test" methods in the JUnit test class for Register page
	 * @throws InterruptedException
	 */
	@AfterClass
	public void tearDown() throws InterruptedException
	{		
		testRunner.finish();
	}
}
