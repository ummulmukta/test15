package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="Feature",
		glue="com.stepdefinition",
		tags="@customerservice",
		plugin= "pretty",
		monochrome=true
	)
public class TestRunner extends AbstractTestNGCucumberTests{

}
