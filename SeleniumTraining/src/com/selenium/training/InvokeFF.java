package com.selenium.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class InvokeFF {
	
	public WebDriver driver;
	
	public InvokeFF(){
		System.setProperty("webdriver.gecko.driver", "D:/webdrivers/geckodriver.exe");
		
		driver = new FirefoxDriver();
	}
	
	@Test
	public void firefoxProgram(){
		
	}
	

}
