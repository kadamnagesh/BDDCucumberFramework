package Selenium_Day23_WaitsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitlyWait {

	@Test
	public void explicitlytestdemo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
       driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
       driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
	   driver.findElement(By.xpath("//*[text()='Add Textbox2']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Add Textbox2']/following-sibling::h3/input")));
			
		driver.findElement(By.xpath("//*[text()='Add Textbox2']/following-sibling::h3/input")).sendKeys("tester");

	//	wait.until(ExpectedConditions.
	 }
  }
