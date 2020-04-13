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
tags = {"@S_01, @S_02"},
monochrome=true)

/**
 * This class is used to run the Sign in page
 */
public class TestRunnerSignin {
	private TestNGCucumberRunner testRunner;

	/**
	 * Executed before the first "@Test" method in JUnit test class for Signin page
	 */
	@BeforeClass
	public void setUP()
	{
	testRunner = new TestNGCucumberRunner(TestRunnerSignin.class);
	}

	/**
	 * Executed for all "@Test" methods
	 * @param cFeature
	 */
	@Test(description="to check Signin",dataProvider="features")
	public void signinpage(CucumberFeatureWrapper cFeature)
	{
	testRunner.runCucumber(cFeature.getCucumberFeature());
	}

	/**
	 * Extracts data from the external file for Signin page
	 * @return
	 */
	@DataProvider(name="features")
	public Object[][] getFeatures()
	{
	return testRunner.provideFeatures();
	}

	/**
	 * Executed after the "@Test" methods in the JUnit test class for Signin page
	 * @throws InterruptedException
	 */
	@AfterClass
	public void tearDown() throws InterruptedException
	{
	testRunner.finish();
	}
}
