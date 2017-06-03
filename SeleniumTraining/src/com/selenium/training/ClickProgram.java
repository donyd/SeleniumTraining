package com.selenium.training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClickProgram {
	
	public WebDriver driver;
	
	public ClickProgram(){
		System.setProperty("webdriver.chrome.driver", "D:/webdrivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void chromeProgram(){
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//option[@value='Chennai']")).click();
		
		WebElement authorizeCheckbox = driver.findElement(By.name("accept"));
		boolean selectedOrNot = authorizeCheckbox.isSelected();
		
		System.out.println("Check is selected: " + selectedOrNot);
		
		authorizeCheckbox.click();
		
		selectedOrNot = authorizeCheckbox.isSelected();
		
		System.out.println("Check is selected: " + selectedOrNot);
		
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.alert(selectedOrNot)", "");
		
		
	
		
				
		//driver.findElement(By.className("edu-get-quotebtn")).click();
		
		
		WebElement courseName = driver.findElement(By.id("Course_Name"));
		boolean textboxEnabled = courseName.isEnabled(); 
		System.out.println("Textbox is active " + textboxEnabled);
		
		driver.findElement(By.xpath("//option[text()='Post Graduation Courses']")).click();
		
		textboxEnabled = courseName.isEnabled();
		System.out.println("Textbox is active " + textboxEnabled);
		
		
		boolean hintShown = driver.findElement(By.className("hintanchor")).isDisplayed();
		System.out.println("Hint is shown for name " + hintShown);
		
	}

}
