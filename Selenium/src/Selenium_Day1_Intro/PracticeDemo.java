package Selenium_Day1_Intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeDemo {
	
	public static void main(String[] args) {
	
	   System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
	   driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	   driver.findElement(By.id("password")).sendKeys("123456");
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	   List<WebElement> li=driver.findElements(By.tagName("a"));
	   System.out.println(li.size());
	   Assert.assertEquals(24, li.size());
	  String dtr = li.toString();
	  System.out.println(dtr);  
	  driver.close();
	 
}
}
