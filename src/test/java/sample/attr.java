package sample;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class attr {
	public static void main(String[] args) throws IOException, InterruptedException
	{	

WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
String url="https://www.flipkart.com/";
driver.navigate().to(url);
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("redmi",Keys.ENTER);
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='REDMI 12 (Pastel Blue, 128 GB)'])[1]"))).click();












//WebElement shadow=driver.findElement(By.xpath("//div[@id='userName']"));
//JavascriptExecutor j=(JavascriptExecutor)driver;
//j.executeScript("arguments[0].shadowRoot.querySelector('a').click()",shadow);














//WebElement email=driver.findElement(By.id("email"));
//WebElement Terms=driver.findElement(By.xpath("//a[text()='Terms']"));
//JavascriptExecutor j=(JavascriptExecutor)driver;
//j.executeScript("arguments[0].setAttribute('value','selenium')",email);
//j.executeScript("arguments[0].setAttribute('style','background:violet;border:3px solid blue')",email);





}
}