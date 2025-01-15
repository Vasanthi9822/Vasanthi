package sample;

//import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	public static void main(String[] args) throws InterruptedException
	{	

WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
String url="https://www.amazon.in";
driver.navigate().to(url);
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung",Keys.ENTER);
driver.findElement(By.xpath("//div[@class='a-size-large product-title-word-break']"));

	String Parent=driver.getWindowHandle();
	System.out.println(Parent);
	
	String Parent1 =driver.getWindowHandle();
	System.out.println(Parent1);
}

	
	}
	

