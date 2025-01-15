package com.flipkart;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class search {
	static WebDriver driver;
	static Wait wait; 
	@BeforeClass
	public static void Method(){
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		String url ="https://www.flipkart.com";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	//@Test
	
		public static void Method1(){
			WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
			search.click();
	}
	@Test
	public static void Method2(){
			WebElement mobile=driver.findElement(By.xpath("//span[text()='Mobiles']"));
			mobile.click();
			
			}
		
	
	}


	
	


	