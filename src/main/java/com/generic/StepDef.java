package com.generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.pageobjectmodel.OnlineBankingLoginPage;
import com.util.BaseConfig;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	WebDriver driver;
	
	@Given("Open the Browser")
	public void open_the_browser()throws Exception {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	}
	
	@Given("Go to Application URL")
	public void go_to_application_url() throws Exception {
		driver.get(BaseConfig.getConfig("URL"));
	}
	
	@When("valid user name")
	public void valid_user_name() throws Exception {
	driver.findElement(OnlineBankingLoginPage.getUser()).click();
	driver.findElement(OnlineBankingLoginPage.getUser()).sendKeys(BaseConfig.getConfig("username"));
	}
	
	@When("valid password")
	public void valid_password() throws Exception {
	driver.findElement(OnlineBankingLoginPage.getPassword()).click();
	driver.findElement(OnlineBankingLoginPage.getPassword()).sendKeys(BaseConfig.getConfig("password"));
	}

	@When("login")
	public void login() {
	driver.findElement(OnlineBankingLoginPage.getLogin()).click();
	}

	@Then("check logout button there or not")
	public void check_logout_button_there_or_not() {
	//assertion
	SoftAssert sf =new SoftAssert();
	sf.assertTrue(driver.findElement(OnlineBankingLoginPage.getLogOutBtn()).isDisplayed());
	System.out.println("Hello");
	sf.assertAll();	
}

	@Given("put invalid username")
	public void put_invalid_username() throws Exception {
	driver.findElement(OnlineBankingLoginPage.getUser()).click();
	driver.findElement(OnlineBankingLoginPage.getUser()).sendKeys(BaseConfig.getConfig("Invalid_username"));
	}

	@When("put invalid password")
	public void put_invalid_password() throws Exception {
	driver.findElement(OnlineBankingLoginPage.getPassword()).click();
	driver.findElement(OnlineBankingLoginPage.getPassword()).sendKeys(BaseConfig.getConfig("Invalid_password"));
	}
	@When("click login")
	public void click_login() {
	driver.findElement(OnlineBankingLoginPage.getLogin()).click();
	}
	@When("Accept Alert")
	public void accept_alert() {
	   
	}
	@Then("Logout button should not visible")
	public void logout_button_should_not_visible() {
		
	Alert alert = driver.switchTo().alert();
	alert.accept();
	//Soft Assert
	SoftAssert sf =new SoftAssert();
	sf.assertTrue(!driver.findElement(OnlineBankingLoginPage.getLogOutBtn()).isDisplayed());
	System.out.println("Hello");
	sf.assertAll();	
}

}


