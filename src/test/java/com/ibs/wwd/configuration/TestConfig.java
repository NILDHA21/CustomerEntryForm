package com.ibs.wwd.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.ibs.wwd.constant.TestData;

public class TestConfig {
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeAllClasses() {
		System.out.println("I am before all class ......");
	}
	
	@BeforeClass
	public void before (){
		System.out.println("I am before single class ......");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(TestData.URL);
	}
	
	@AfterClass
	public void after() {
		System.out.println("I am after single class ......");
		if (driver != null) {
			driver.quit();
		}
	}
	@AfterSuite
	public void afterAllClasses() {
		System.out.println("I am after all class ......");
	}
}
