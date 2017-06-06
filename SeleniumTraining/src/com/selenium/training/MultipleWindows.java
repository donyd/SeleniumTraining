package com.selenium.training;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindows {
	
	public WebDriver driver;
	
	public MultipleWindows(){
		System.setProperty("webdriver.chrome.driver", "D:/webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	
	@Test
	public void chromeProgram() throws InterruptedException{
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		
		driver.findElement(By.linkText("privacy policy")).click();
		
				
		Set<String> browsersA = driver.getWindowHandles();
		System.out.println("No. of browsers is " + browsersA.size());
		driver.findElement(By.id("Name")).sendKeys("hello");
		Thread.sleep(3000);
		for(String browser: browsersA){
			System.out.println("Browser id is: " + browser);
			
			driver.switchTo().window(browser);
			
			if(driver.getTitle().equals("Privacy Policy - Deal4loans.com's Services | Online Loan Application And Information")){
				driver.findElement(By.xpath("//a[text()='www.deal4loans.com']")).click();
				Thread.sleep(3000);
				driver.close();
				Thread.sleep(3000);
			}
		}
		
		
		Set<String> browsersB = driver.getWindowHandles();
		System.out.println("No. of browsers is " + browsersB.size());
		//driver.findElement(By.id("Name")).sendKeys("hello");
		for(String browser: browsersB){
			System.out.println("Browser id is: " + browser);
			
			driver.switchTo().window(browser);
			
			if(driver.getCurrentUrl().equals("http://www.deal4loans.com/apply-education-loans.php")){
				driver.findElement(By.id("Name")).clear();
				Thread.sleep(3000);
				driver.quit();
			}
		}
		
	}
	
}
