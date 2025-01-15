package sample;

import java.util.List;

import javax.swing.text.html.Option;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class aler {
	public static void main(String[] args) throws InterruptedException
	{
		
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
		driver.manage().window().maximize();
		WebElement drop=driver.findElement(By.xpath("//select[@id='cars']"));
		Select s = new Select(drop);
		s.selectByValue("volvo");
		s.selectByValue("saab");
		s.selectByValue("opel");
		s.selectByValue("audi");

		List<WebElement>options= s.getAllSelectedOptions();

		for(int i=options.size()-1;i>=0;i--)
		{
		String text=options.get(i).getText();
		System.out.println(text);
		
		}
	}
}




	


