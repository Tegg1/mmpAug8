package com.mmp.base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {
	
	public  static WebDriver driver;
	public static Properties prop;
	public  TestBaseClass () throws IOException {

		// open url 
		
		prop =new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\meenu\\eclipse-workspace\\mmpPatient\\src\\main\\java\\com\\mmp\\config\\config.Properties");
prop.load(ip);


		
	}
	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(browserName.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}
			
		
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}}


