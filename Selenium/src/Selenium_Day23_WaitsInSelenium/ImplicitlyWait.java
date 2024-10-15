package Selenium_Day23_WaitsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitlyWait {

	@Test
	public void implicitlywaittest()
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.xpath("//button[text()='Add Textbox1']")).click();
		
		// driver wait for 10 sec
		
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//button[text()='Add Textbox1']/following-sibling::h3/input")).sendKeys("ignisyst");
	  
	  }
   }
