package Selenium_Day1_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver ();
			driver.manage().window().maximize();
			driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
			Thread.sleep(2000);

			WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
			email.sendKeys("kiran@gmail.com");     // to enter the Text in textBox
			Thread.sleep(2000);
			email.clear();						   // to clear the Text in textBox
			
			email.sendKeys("kiran@gmail.com");     // to enter the Text in textBox
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			
			driver.manage().deleteAllCookies();
			driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
			Thread.sleep(2000);

		
			email.sendKeys("kiran@gmail.com");     // to enter the Text in textBox
			Thread.sleep(2000);
			email.clear();						   // to clear the Text in textBox
			
			email.sendKeys("kiran@gmail.com");     // to enter the Text in textBox
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
			
			driver.findElement(By.xpath("//button[text()='Sign In']")).click();
			
}
}
