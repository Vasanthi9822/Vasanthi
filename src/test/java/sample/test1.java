package sample;

import java.awt.Robot;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class test1 {
	public static void main(String[] args) throws Exception
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
driver.manage().window().maximize();
		
    WebElement drag=driver.findElement(By.xpath("//option[@value='audi']"));
   WebElement drop=driver.findElement(By.xpath("//option[@value='volvo']"));
    //WebElement drag1=driver.findElement(By.xpath("//option[@value='opel']"));
    //WebElement drop1=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
    //WebElement drag2=driver.findElement(By.xpath("//option[@value='saab']"));
   // WebElement drop2=driver.findElement(By.xpath("//li[@class='placeholder'][1]"));
    //WebElement drag3=driver.findElement(By.xpath("//option[@value='volvo']"));
    //WebElement drop3=driver.findElement(By.xpath("//li[@class='placeholder'][1]"));

    Method s=new Method(drop);
    //s.drag().build().perform();
    s.dragAndDrop(drag,drop).build().perform();
    //s.dragAndDrop(drag2,drop2).build().perform();
    //s.dragAndDrop(drag3,drop3).build().perform();
    //s.dragAndDrop(drag,drop).build().perform();

    TakesScreenshot ts=(TakesScreenshot)driver;
    File src=ts.getScreenshotAs(OutputType.FILE);
 File des=new File("C:\\Users\\ANAND\\eclipse-workspace\\vasanthi\\ExcelRead\\target\\draganddrop.png");
 FileUtils.copyFile(src,des);
 Robot s1=new Robot();
		
			
	}

	}

	
{
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
driver.manage().window().maximize();
WebElement drop=driver.findElement(By.xpath("//select[@id='cars']"));
Select s = new Select(drop);
s.selectByIndex(0);
s.selectByIndex(1);
s.selectByIndex(2);
s.selectByIndex(3);

List<WebElement>Options=(List<WebElement>) s.getFirstSelectedOption();

for(int i=0;i<Options.size();i++)
{
WebElement option=Options.get(i);
String text=option.getText();
System.out.println(text);
}
}
}


