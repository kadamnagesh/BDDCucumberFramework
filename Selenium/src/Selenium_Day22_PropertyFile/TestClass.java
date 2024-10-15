package Selenium_Day22_PropertyFile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void useradditiontest()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();        // it will open the driver
		
   driver.manage().window().maximize();
   driver.get(PropertyFileOperation.readpropertyfile("url"));
   driver.findElement(By.id("email")).sendKeys(PropertyFileOperation.readpropertyfile("username"));
   driver.findElement(By.id("password")).sendKeys(PropertyFileOperation.readpropertyfile("password"));
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   driver.findElement(By.xpath("//a[@href='users.html']")).click();
   driver.findElement(By.xpath("//button[text()='Add User']")).click();
   driver.findElement(By.id("username")).sendKeys("ignisyst");
 driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("12345234");
 driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ignisyst@gmail.com");
 driver.findElement(By.xpath("//input[@id='Male']")).click();
 Select se = new Select(driver.findElement(By.tagName("select")));

	se.selectByValue("Punjab");

	driver.findElement(By.id("password")).sendKeys("112211");

	driver.findElement(By.id("submit")).submit();

	Alert al = driver.switchTo().alert();

	String alrtMsg = al.getText();
	
	PropertyFileOperation.writeproperty("massage", alrtMsg);
	}

}

