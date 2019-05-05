package com.basic.MyCircuit;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;


public class MyCircuitStepDefs {
	
	Response res;
	
	@Given("^user start the rest assured test$")
	public void user_start_the_rest_assured_test() {
		
	res = RestAssured.given().get("http://ergast.com/api/f1/drivers.json");
	int statuscode = res.getStatusCode();
	//Assert.assertTrue(expStatusCode==statuscode);
	   
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
	    
	}

	@Then("^user checks the count or size$")
	public void user_checks_the_count_or_size() throws Throwable {
		
		String limitValue = res.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals("30", limitValue);
		
		
		
		//verify the size
	//	res.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));
	    
	}

	@Then("^user checks at path \"([^\"]*)\"$")
	public void user_checks_at_path(String arg1) throws Throwable {
	   
	}

}
