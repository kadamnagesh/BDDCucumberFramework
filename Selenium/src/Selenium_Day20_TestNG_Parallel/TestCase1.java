package Selenium_Day20_TestNG_Parallel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass {
  @Test
  public void login() throws InterruptedException 
  {
		driver.manage().window().maximize();
		
		   driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
			
		   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(1000);
  }
}
