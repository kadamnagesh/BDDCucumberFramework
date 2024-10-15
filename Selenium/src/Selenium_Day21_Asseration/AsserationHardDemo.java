package Selenium_Day21_Asseration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Selenium_Day22_PropertyFile.PropertyFileOperation;

public class AsserationHardDemo extends BaseClass {
	@Test
	public void UserAdded()
	{
		 driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		   driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		   driver.findElement(By.id("password")).sendKeys("123456");
		   driver.findElement(By.xpath("//button[@type='submit']")).click();

  //  Assert.assertEquals(driver.getCurrentUrl(), "file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboardpage.html");
   
   driver.findElement(By.xpath("//a[@href='users.html']")).click();
   driver.findElement(By.xpath("//button[text()='Add User']")).click();
   driver.findElement(By.id("username")).sendKeys("ignisyst");
 driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("12345234");
 driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ignisyst@gmail.com");
 
//   Assert.assertTrue(driver.findElement(By.xpath("//input[@id='Male']")).isSelected());
 //   Assert.assertFalse(driver.findElement(By.xpath("//input[@id='Male']")).isSelected());
 driver.findElement(By.xpath("//input[@id='Male']")).click();
 Select se = new Select(driver.findElement(By.tagName("select")));

	se.selectByValue("Punjab");

	driver.findElement(By.id("password")).sendKeys("112211");

	driver.findElement(By.id("submit")).submit();

	Alert al = driver.switchTo().alert();

	String alrtMsg = al.getText();
	// Assert.assertEquals(alrtMsg, "usser added successfully", "usser added fail by default");
	al.accept();	
	Assert.assertEquals(alrtMsg, "User Added Successfully. You can not see added user]","Nagesh message incorrect");
  // Assert.assertEquals(alrtMsg, "User Added Successfully. You can not see added user.");
	}
	
	@Test(priority = 1)
	public void print()
	{
		System.out.println("i am in print");
	}

}
