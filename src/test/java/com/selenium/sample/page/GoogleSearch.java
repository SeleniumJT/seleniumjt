package com.selenium.sample.page;

import java.io.IOException;

import com.jt.selenium.SeleniumJT;
import com.jt.selenium.page.PageObject;

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

	public void firstTest() throws IOException {
		test.open("/");
		test.type("gbqfq", "RDF Group");
		test.pause(2000);
		test.verifyTextPresent("Offering a complete portfolio of IT services");
	}

}
