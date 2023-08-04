package com.pageobjectmodel;

import org.openqa.selenium.By;

public class OnlineBankingLoginPage {

	//pom or page object method =By()
	//PF or page Factory = @FindBy annotation
	
	private static	By username = By.xpath("//*[@id='username']");
	private  static	By password= By.xpath("//*[@id='password']");
	private static	By login= By.xpath("//*[@value='Login']");
	private static 	By logOutBtn= By.xpath("//*[@id='logoutButton']");
	
	public static By getUser() {
		return username;
	}
	public static By getPassword() {
		return password;
	}
	public static By getLogin() {
		return login;
	}
	public static By getLogOutBtn() {
		return logOutBtn;
	}
	
	
	
}
