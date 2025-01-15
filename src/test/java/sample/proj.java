package sample;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class proj {
	public static void main(String[] args)

	{
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		WebDriver driver= new EdgeDriver(options);
		driver.get("https://www.amazon.in");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     java.util.List<WebElement> links =  driver.findElements(By.tagName("link"));
         java.util.Iterator<WebElement> iterator=links.iterator();
         while(iterator.hasNext())
         {
        	 WebElement link=iterator.next();
        	 String href=link.getAttribute("href");
        	 if(href==null||href.isEmpty()) {
        		 System.out.println("link is empty");
        	 }
        	 else
        	 {
        	 try
        	 {
        	 HttpURLConnection http=(HttpURLConnection)(new URL(href).openConnection());
        	 http.setRequestMethod("HEAD");
        	 http.connect();
        	int responseCode =http.getResponseCode();
        	if(responseCode==200)
        	{
        		System.out.println("given link is not a broken: "+href);
        	}
        	 }
        	 catch(Exception e)
        	 {
        		 e.printStackTrace();
        	 }
         }
         
         
         
         
         
	}
	}
}

