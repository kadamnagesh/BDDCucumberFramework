
package Selenium_Day9_WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();    // Run-time polymorphism
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

	String mainwindow=driver.getWindowHandle();
	WebElement button3=	driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",button3);  //scroll up button3
	button3.click();
	
	Set<String> allwindow=driver.getWindowHandles();
	
	for (String windowid:allwindow)
		{		
		driver.switchTo().window(windowid);
		
		if (driver.getCurrentUrl().equals("https://www.hyrtutorials.com/p/basic-controls.html")) 
		{
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("ignisyst");
			Thread.sleep(5000);
		}
		if ((driver.getWindowHandle().equals(mainwindow))==false) 
		{
			 driver.close();
		}
	}
	
	driver.switchTo().window(mainwindow);
	
	// driver.quit();
	
	}
}

