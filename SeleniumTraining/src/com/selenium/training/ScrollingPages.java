package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ScrollingPages {
	
	public WebDriver driver;
	
	public ScrollingPages(){
		System.setProperty("webdriver.chrome.driver", "D:/webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void chromeProgram() throws InterruptedException{
		driver.get("https://stackoverflow.com/questions/3401343/scroll-element-into-view-with-selenium");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		// Selenium class that allows dynamic (run time only) modification of viewport elements, supposedly by CSS - need further research on this
		// Scroll by pixels
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0, 2000)", "");
//		
//		jse.executeScript("window.alert(\"You've been scrolled sucka\")", "");
		
		// Scroll by element
		WebElement element = driver.findElement(By.xpath("//a[text()='feedback']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
		
		
	}
	

}
