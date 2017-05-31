package com.selenium.training;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTitle_refresh_getcurrenturl {

	public WebDriver driver;
	
	public GetTitle_refresh_getcurrenturl(){
		
		// Specify browser type and driver location
		System.setProperty("webdriver.chrome.driver", "D:/webdrivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void chromeProgram() throws InterruptedException{
		driver.get("http://www.espn.com");
		driver.manage().window().maximize();
		
		// Get the page's title and display in console
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is " + pageTitle);
		
		// Get the page's URL and display in console
		String pageURL = driver.getCurrentUrl();
		System.out.println("URL of the page is " + pageURL);
		
		// Navigate to a page based on linkText content i.e. innerHTML
		driver.findElement(By.linkText("NHL")).click();
		Thread.sleep(4000);
		
		// Get the new page's URL and display in console
		String newPageURL = driver.getCurrentUrl();
		System.out.println("URL of new page is " + newPageURL);
		
		// Navigate back, forward and refresh page
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		
	}
	
	
	

}
