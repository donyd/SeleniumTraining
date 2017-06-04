package com.selenium.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DropDown {
	
	public WebDriver driver;
	
	public DropDown(){
		System.out.println("This is a constructor");
		System.setProperty("webdriver.chrome.driver", "D:/webdrivers/chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void clickActions() throws InterruptedException {
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> lstCities = driver.findElements(By.xpath("//select[@id='City']//option"));
		
		System.out.println("Cities list size is " + lstCities.size());
		
		for (WebElement city: lstCities){
			System.out.println("city name is " + city.getText());
			
			if(city.getText().equals("Trichy")) {
				city.click();
				break;
			}
		}
		
	}
	

}
