package com.selenium.training;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome {
	
	public WebDriver driver;
	
	@Test 
	public void chromeProgram(){
		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}

}
