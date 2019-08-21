package com.mmp.testcases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.mmp.pages.RegPage;


public class RegPageTest extends TestBase {

	WebDriver driver;

	@Test

	public void FillRegForm() {

		RegPage regpage=new RegPage(driver);
		regpage.FillingRegPage();

	}
}
