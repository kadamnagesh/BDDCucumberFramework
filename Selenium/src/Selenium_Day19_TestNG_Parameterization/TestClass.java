package Selenium_Day19_TestNG_Parameterization;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestClass extends BaseClass {
	
	@Test
	@Parameters({"username","password","url"})
	public void login(String username, String Password,String url)
	{
	   driver.manage().window().maximize();
	   driver.get(url);
	   driver.findElement(By.id("email")).sendKeys(username)   ;
	   driver.findElement(By.id("password")).sendKeys(Password);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   driver.close();
	}	  
  
}