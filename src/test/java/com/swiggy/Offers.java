package com.swiggy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Offers {
	static WebDriver driver;
	static Wait wait;
	static String user;
	static String Username;
	static int in;
	
	//precondition
	@BeforeClass
	public static void applicationLaunch() throws FileNotFoundException {
		
		
		
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
	    options.addArguments("--disable-popups");
	    options.addArguments("--disable-notifications");
	    options.addArguments("start-maximized");
		driver = new EdgeDriver(options);
		driver.get("https://www.swiggy.com/username:"+user);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	@AfterClass
	public static void browserClose() {
		driver.close();
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@After
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@Test
	public void method2() {
		System.out.println("Method2");
		WebElement search = driver.findElement(By.xpath("//div[text()='Search for restaurant, item or more']"));
		search.click();
		WebElement inputBox = driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']"));
		inputBox.sendKeys("chinese food");
	}
	@Test
	public void method3() {
		System.out.println("Method 3");
		WebElement chinese = driver.findElement(By.xpath("//div[contains(text(),'Home')]/preceding::b[text()='Chinese']"));
		wait.until(ExpectedConditions.elementToBeClickable(chinese));
		chinese.click();
	}
	@Test
	public void method4() {
		System.out.println("Method 4");
		List<WebElement> tabs = driver.findElements(By.xpath("//div[contains(@class,'Search_widgets')]/div/span/span/span"));
		for(WebElement tab : tabs) {
			String text = tab.getText();
			if(text.equals("Restaurants")) {
				System.out.println(text+" is displayed");
			}
			else if(text.equals("Dishes")) {
				System.out.println(text+" is displayed");
			}
		}
	}
	@Test
	public void method5() {
		System.out.println("Method 5");
		List<WebElement> restaurants = driver.findElements(By.xpath("//div[contains(@class,'styles_restaurantListItem')]/a/div/div[contains(@class,'styles_containerImageBadge')]/div"));
	}
	@Test
	public void method6() {
		System.out.println("Method 6");
		WebElement dishes = driver.findElement(By.xpath("//span[text()='Dishes']"));
		wait.until(ExpectedConditions.elementToBeClickable(dishes));
		dishes.click();
	}
	@Test
	public void validate_dishes_displayed() {
		
	}



}
