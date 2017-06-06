package com.selenium.training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class WaitAgain {

	public WebDriver driver;

	public WaitAgain() {
		System.setProperty("webdriver.chrome.driver",
				"D:/webdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().window().maximize();

	}

	public void fluentwait(final By by) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(30, TimeUnit.SECONDS)

				.pollingEvery(2, TimeUnit.SECONDS)

				.ignoring(NoSuchElementException.class).ignoring(ElementNotVisibleException.class)
				.ignoring(StaleElementReferenceException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {

				return driver.findElement(by);

			}

		});
	}

	@Test
	public void firefoxProgram() {
		driver.get("http://www.deal4loans.com/apply-education-loans.php");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.className("edu-get-quotebtn")));
		fluentwait(By.className("edu-get-quotebtn1"));
		driver.findElement(By.className("edu-get-quotebtn")).click();

	}

}
