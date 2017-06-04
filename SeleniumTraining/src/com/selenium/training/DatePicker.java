package com.selenium.training;

import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {
	
	public WebDriver driver;
	Calendar cal = Calendar.getInstance();
	int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
	String dayOfMonthStr = String.valueOf(dayOfMonth);
	
	public DatePicker(){
		System.out.println("This is a constructor");
		System.setProperty("webdriver.chrome.driver", "D:/webdrivers/chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	
	@Test
	public void clickActions() throws InterruptedException {
		driver.get("http://2008.kelvinluck.com/assets/jquery/datePicker/v2/demo/datePicker.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='chooseDateForm']/fieldset/ol/li[1]/a")).click();
		
		List<WebElement> lstDates = driver.findElements(By.xpath("//table//tr//td"));
		
		System.out.println("Dates list size is " + lstDates.size());
		
		for (WebElement date : lstDates){
			System.out.println("Date of the week is " + date.getText());
			
			
			
			if(date.getText().equals(dayOfMonthStr)) {
				date.click();
				break;
			}
		}
		
	}
	

}
