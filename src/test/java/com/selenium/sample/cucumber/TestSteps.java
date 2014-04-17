package com.selenium.sample.cucumber;

import com.jt.selenium.SeleniumJT;
import com.jt.selenium.factory.SeleniumJTFactory;
import com.selenium.sample.page.GoogleSearch;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Example cucumber test utilising the Page Object pattern
 * 
 * @author dave.hampton
 *
 */
public class TestSteps {

	protected SeleniumJT test;
	GoogleSearch googleSearch;

	@Given("^I want to use the (.*) browser$")
	public void chooseBrowser(String browser) throws Exception {

		test = SeleniumJTFactory.getSeleniumJT(browser);
		googleSearch = new GoogleSearch(test);

	}

	@When("^I do a google search$")
	public void openGoogle() throws Exception {

		googleSearch.openGoogle();
	}

	@And("^I search for (.*)$")
	public void typeValue(String value) throws Exception {

		googleSearch.typeValue(value);
	}

	@Then("^I see text (.*)$")
	public void checkResult(String value) throws Exception {

		googleSearch.checkResult(value);
		
	}

}
