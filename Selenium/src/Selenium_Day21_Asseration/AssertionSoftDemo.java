package Selenium_Day21_Asseration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertionSoftDemo extends BaseClass {
	
	@Test
	public void AddedUser1()
	{
		    
		 driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		 WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
			email.sendKeys("kiran@gmail.com"); // to enter the Text in textBox

			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");

			driver.findElement(By.xpath("//button[text()='Sign In']")).click();

			// check if the login is successful or not
			
	    	
			
		 softAssert.assertEquals(driver.getCurrentUrl(), "file:///C:/Users/Dhiraj/Desktop/TestB6/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboard.html");

			driver.findElement(By.xpath("//a[@href='users.html']")).click();
			driver.findElement(By.xpath("//button[text()='Add User']")).click();

			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ignisyst");
			driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("112233");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");
			
			softAssert.assertTrue(driver.findElement(By.xpath("//input[@id='Male']")).isSelected(),"Male is not selected by default");

			driver.findElement(By.xpath("//input[@id='Male']")).click();
			
			Select se = new Select(driver.findElement(By.tagName("select")));

			se.selectByValue("Punjab");

			driver.findElement(By.id("password")).sendKeys("112211");

			driver.findElement(By.id("submit")).submit();

			Alert al = driver.switchTo().alert();

			String alrtMsg = al.getText();
			//System.out.println(alrtMsg);
			softAssert.assertEquals(alrtMsg, "user add sucessfully");
			al.accept();
			
			softAssert.assertAll();

		}

		@Test(priority = 2)

		public void print() {
			System.out.println("i am in print");
		}
	}


