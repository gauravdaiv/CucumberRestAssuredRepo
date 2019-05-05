package com.basic.B17googletest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class MyGoogleStepDefs {
	
	Response res;
	
		
	@Given("^I want to open google$")
	public void i_want_to_open_google()  {
		
				
		res = RestAssured.given().get("https://www.google.com");
		System.out.println("Hitting google.com");
	}

	@Then("^I want to check \"([^\"]*)\" status code$")
	public void i_want_to_check_status_code(String statusCode) {
		
		System.out.println("Validating status code");
		
		int stcode = res.getStatusCode();
		String sscode = Integer.toString(stcode);
		Assert.assertEquals(statusCode,sscode);
				
	    }

}
