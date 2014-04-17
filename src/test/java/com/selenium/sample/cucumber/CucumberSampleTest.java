package com.selenium.sample.cucumber;

import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


import org.junit.runner.RunWith;

//As with most JUnit frameworks, we need to specify the JUnit runner
@RunWith(Cucumber.class)

@CucumberOptions(
		format 		= 	{"pretty", "html:target/cucumber-html-report"},
		features 	= 	{"src/test/resources/features"})

public class CucumberSampleTest {

}
