package com.meesho;

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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class proje {
		static WebDriver driver;
		 Wait wait; 
		@BeforeClass
		public static void Method1(){
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			String url ="https://www.meesho.com/";
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		}
		@Test
		public void Method2(){
			WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
			men.click();
			List<WebElement> options = driver.findElements(By.xpath("//div[contains(@class,'izctWL')]"));
			for(WebElement option:options){
				String tab =option.getText();
				System.out.println("The Tab values are "+tab);
			}
				
			}
		
		@Test
		public void Method3(){
			WebElement tshirt=driver.findElement(By.xpath("//p[text()='Tshirts']"));
			tshirt.click();

		}
		@Test
		public void Method4(){
			WebElement selectoneT = driver.findElement(By.xpath("//img[@src='https://images.meesho.com/images/products/470985043/ull8m_400.webp']"));
			selectoneT.click();
		}
		@Test
		public void Method5(){
			WebElement selectSize = driver.findElement(By.xpath("//span[text()='XL']"));
			selectSize.click();
		}
		@Test
		public void Method6(){
			List<WebElement> pageVerify = driver.findElements(By.xpath("//button[contains(@class,'ProductCard')]"));
			for(WebElement button :pageVerify){
				String bt=button.getText();
				System.out.println(bt);
			}
		
		}
		@AfterClass
			public static void Method7(){
			driver.close();


}
	}
	
			
			
			
			
		
	





