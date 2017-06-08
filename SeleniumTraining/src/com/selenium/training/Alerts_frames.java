package com.selenium.training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts_frames {
	
	public WebDriver driver;
	
	public Alerts_frames(){
		System.out.println("This is the constructor");
		System.setProperty("webdriver.chrome.driver", "D:/webdrivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void clickactions() throws InterruptedException {
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(e);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		// a.accept();
		a.dismiss();
		
		// Leave the currently entered frame
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Run »']")).click();
	}
	
	

}
