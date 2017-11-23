package com.test.TestProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest1 {
  @Test
  public void f() {
	  
	 /* System.out.println("Test 2");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\tipuranjali\\workspace\\new project\\drivers\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("www.google.com");*/
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method 2");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("After method Test 2");
  }

  @BeforeSuite
  public void beforeSuite() {
  
  System.out.println("Before suit Test 2");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suite test 2");
	  
  }

}
