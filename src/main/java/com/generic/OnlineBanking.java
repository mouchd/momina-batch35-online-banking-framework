package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pageobjectmodel.OnlineBankingLoginPage;
import com.util.BaseConfig;

import cucumber.api.cli.Main;


public class OnlineBanking {
	
	@Test
	public static void getLogin() throws Exception{
	
			
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(BaseConfig.getConfig("URL"));
		//put user
		driver.findElement(OnlineBankingLoginPage.getUser()).click();
		driver.findElement(OnlineBankingLoginPage.getUser()).sendKeys(BaseConfig.getConfig("username"));
		
		//put password
		driver.findElement(OnlineBankingLoginPage.getPassword()).click();
		driver.findElement(OnlineBankingLoginPage.getPassword()).sendKeys(BaseConfig.getConfig("password"));
		//login
		driver.findElement(OnlineBankingLoginPage.getLogin()).click();
		
		
		   //Assertion
	    //Hard Assert
	    //Assert.assertTrue(driver.findElement(LoginPage.logoutBtn).isDisplayed());
	    //System.out.println("Hi");
	    //Soft Assert
		
	    SoftAssert sf = new SoftAssert();
	    sf.assertTrue(driver.findElement(OnlineBankingLoginPage.getLogOutBtn()).isDisplayed());
	    System.out.println("Hello");
	    sf.assertAll();
	    
		//Close Browser
	   // driver.quit();
	}
		
		 
	
}

