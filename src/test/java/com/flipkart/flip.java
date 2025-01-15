package com.flipkart;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flip {
	static WebDriver driver;
	 Wait wait; 
	@BeforeClass
	public static void Method1(){
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		String url ="https://www.flipkart.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public static void Method2(){
			WebElement mobile=driver.findElement(By.xpath("//span[text()='Mobiles']"));
			mobile.click();
			java.util.List<WebElement>options=(java.util.List<WebElement>) driver.findElement(By.xpath("//div[text()='SAMSUNG']"));
			for(WebElement option:options){
				String tab =option.getText();
				System.out.println("The Tab values are "+tab);
			}
		
	
	}
}



