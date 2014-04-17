package com.selenium.sample.page;

import java.io.IOException;

import com.jt.selenium.SeleniumJT;
import com.jt.selenium.page.PageObject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * This is a very simple PageObject.
 * 
 * @author Dave.Hampton
 *
 */
public class GoogleSearch extends PageObject {
	
	public GoogleSearch(SeleniumJT test) {
		super(test);
	}

	public void openGoogle() throws Exception {

		test.open("/");
	}

	public void typeValue(String value) throws Exception {

		test.type("gbqfq", value);
		test.pause(2000);
	}
	

	public void checkResult(String value) throws Exception {

		test.verifyTextPresent(value);
		test.stop();
	}

}
