package sample;

import java.io.IOException;
import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tab {
	public static void main(String[] args) throws InterruptedException
	{	

WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
String url="https://demo.guru99.com/test/web-table-element.php";
driver.navigate().to(url);
driver.manage().window().maximize();
WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
WebElement tbody = table.findElement(By.tagName("tbody"));
List<WebElement>trows =tbody.findElements(By.tagName("tr"));
for(int i=0;i<trows.size();i++)
{
	WebElement trow=trows.get(i);
	List<WebElement>tdatas =tbody.findElements(By.tagName("td"));
//for(int j=0;j<tdatas.size();j++){
	WebElement name=tdatas.get(0);
	String comp=name.getText();
	System.out.println(comp);
	if(comp.equals("Hero MotoCorp"))
	{
     WebElement data=tdatas.get(2);
	String text=data.getText();
	System.out.println(text);
	}
	else
	{
		System.out.println("company name is not available" +comp);	}
	
}
	
}
	
}
