package com.selenium.training;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeIE {
	
	public WebDriver driver;
	
	@Test 
	public void chromeProgram(){
		System.setProperty("webdriver.ie.driver", "D:\\webdrivers\\IEDriverServer.exe");
		
		driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		
	}

}
