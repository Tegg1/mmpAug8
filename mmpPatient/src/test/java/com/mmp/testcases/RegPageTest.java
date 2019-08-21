package com.mmp.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mmp.pages.RegPage;


public class RegPageTest extends TestBase {

	WebDriver driver;
	// adding a comment again

	@Test

	public void FillRegForm() {

		RegPage regpage=new RegPage(driver);
		regpage.FillingRegPage();

	}
}
