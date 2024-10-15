package Selenium_Day24_FrameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.testng.annotations.Test;

public class FrameHandlingDemo {
	
	@Test

	public void framedemo() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1600)", "");
		
		// driver.switchTo().frame(2);
		// driver.switchTo().frame(driver.findElement(By.id("frm2")));     // driver.switchTo().frame(name/id)
		driver.switchTo().frame("frm2");
		
		driver.findElement(By.xpath("//input[@id='firstName'and@name='fName']/parent::div//input")).sendKeys("testers");
        Thread.sleep(1000);
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.switchTo().defaultContent(); // we can switch back from a frame to default in selenium webdriver using the driver.switchTo().defaultContent() method
        
	}
}
