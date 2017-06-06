package com.selenium.training;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class DropDowns {
	
	public WebDriver driver;
	
	@Test
	public void chromeProgram(){
		System.setProperty("webdriver.chrome.driver",  "D:/webdrivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		
		// driver.findElement(By.xpath("//option[@value='Cochin']")).click();
		
		// selection using Select()
		WebElement selectItem = driver.findElement(By.id("City"));
		Select optionSelected = new Select(selectItem);
		
		// select by index		
		//optionSelected.selectByIndex(1);
		
		// select by value
		optionSelected.selectByValue("Chennai");
		
		// select by visible text
//		optionSelected.selectByVisibleText("Chandigarh");
//		System.out.println("The selected value is " + optionSelected.getFirstSelectedOption().getText());
		
		List<WebElement> cities = driver.findElements(By.xpath("//select[@id='City']//option"));
		System.out.println("Size of cities is " + cities.size());
		
		for (WebElement city: cities){
			System.out.println("city name " + city.getText());
			
			if(city.getText().equals("Trichy")){
				city.click();
				break;
			}
		}
		
	}

}
