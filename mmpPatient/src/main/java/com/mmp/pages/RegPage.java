package com.mmp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class RegPage{
	
	//creating Object repo

	@FindBy (xpath="//a[contains(text(),'Register')]")
	WebElement register;


	@FindBy(name="fname")
	WebElement firstName;

	@FindBy (id="lastname")
	WebElement lastName;


	@FindBy (id="datepicker")
	WebElement dateOfBirth;

	@FindBy (id="license")
	WebElement license;

	@FindBy (name="ssn")
	WebElement ssn;

	@FindBy (name="state")
	WebElement state;

	@FindBy (name="city")
	WebElement city;

	@FindBy (name="address")
	WebElement address;

	@FindBy (name="zipcode")
	WebElement zipCode;

	@FindBy (id="age")
	WebElement age;

	@FindBy (id="height")
	WebElement height;

	@FindBy (id="weight")
	WebElement weight;

	@FindBy (id="pharmacy")
	WebElement pharmacy;

	@FindBy (id="pharma_adress")
	WebElement pharmacyAddress;

	@FindBy (id="email")
	WebElement email;

	@FindBy (id="username")
	WebElement username;

	@FindBy (id="password")
	WebElement password;

	@FindBy (id="confirmpassword")
	WebElement confirmPassword;


	@FindBy (id="security")
	WebElement security;

	@FindBy (id="answer")
	WebElement answer;

	@FindBy (name="register")
	WebElement submit;

	//initializing the page objects

	public RegPage(WebDriver driver){
	PageFactory.initElements(driver, this);

		
	}

	public  void fillForm(){
		register.click();

		firstName.sendKeys("abc");

		lastName.sendKeys("abc");

		dateOfBirth.sendKeys("7/8/1989");

		license.sendKeys("12345678");

		ssn.sendKeys("3434654376");

		state.sendKeys("VA");

		city.sendKeys("Herndon");

		address.sendKeys("100 snowRoad");

		zipCode.sendKeys("56456");

		age.sendKeys("32");

		height.sendKeys("100");

		weight.sendKeys("120");

		pharmacy.sendKeys("cvs");

		pharmacyAddress.sendKeys("50 cvs Road");

		email.sendKeys("abc123@gmail.com");

		username.sendKeys("abcd12");

		password.sendKeys("absd12");

		confirmPassword.sendKeys("absd12");

		Select dropdown = new Select(security);  
		dropdown.selectByValue("what is your anniversary date");

		answer.sendKeys("8/7/2002");

		submit.click();
	}









}



