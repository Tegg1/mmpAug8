package com.mmp.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mmp.pages.LoginPage;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	
	public void test() {
		LoginPage loginpage =new LoginPage(driver);
		loginpage.patientLogin();

}
}