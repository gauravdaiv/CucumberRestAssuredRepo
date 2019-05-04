package com.basic.MyCircuit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src/test/resources/com/basic/MyCircuit/MyCircuit.feature"},
		glue={"com/basic/MyCircuit/"}
		
		
		)

public class RunMyCircuitTest {
	
	

}
