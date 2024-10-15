package Selenium_Day17_TestNG_Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestClass1 extends BaseClass{

	@Test
	public void HomePageRedirecting()
	{
		 driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
	    	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
			email.sendKeys("kiran@gmail.com");     // to enter the Text in textBox
			 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			Assert.assertEquals(driver.getCurrentUrl(), "file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples.html");
	
	}
}
