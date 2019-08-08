package com.mmp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	

	WebDriver driver;

	@FindBy (xpath="//a[@class='button button-alt'][contains(text(),'Login')] ")
	WebElement loginButton;

	@FindBy (id="username")
	WebElement userName;

	@FindBy (id="password")
	WebElement password;

	@FindBy (name="submit")
	WebElement submit;


	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void patientLogin() {

		loginButton.click();
		userName.sendKeys("Rose1");
		password.sendKeys("Rose123456");
		submit.click();


	}

}
