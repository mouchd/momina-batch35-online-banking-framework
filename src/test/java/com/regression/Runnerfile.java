package com.regression;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"json:target/cucumber.json"},//report = main in jason report ,get path from target folder
		features = {"./src/test/resources/onlinebanking.feature"}, //feature file location or path
		glue = {"com.generic"}, //stepdef package name
		tags ="@Smoke" //@Smoke or which one need to run
		
		)

public class Runnerfile  extends AbstractTestNGCucumberTests{//need help TestNG or Junit
	
}
