package com.basic.allfilesinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class OneFolderStepDefs {
	
	public WebDriver driver;
	
	@Given("the user is on facebook login Page")
	public void the_user_is_on_facebook_login_Page()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\GauravRadicalSoftware\\Selenium\\chromedriver_win32_B45\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@When("^he enters \"([^\"]*)\" as user name$")
	public void he_enters_as_user_name(String userName) {
	   
	    driver.findElement(By.xpath("//input[@name ='email']")).sendKeys(userName);
	}
	
	@When("^he enters \"([^\"]*)\" as password$")
	public void he_enters_as_password(String pwd) {
	    
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(pwd);
	}

	
	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox(String userName) {
	  
		String UName = driver.findElement(By.xpath("//input[@name ='email']")).getText();
	    System.out.println(UName);
	}

}
