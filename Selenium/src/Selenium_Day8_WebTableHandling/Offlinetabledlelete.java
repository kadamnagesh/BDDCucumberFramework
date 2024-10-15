package Selenium_Day8_WebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Offlinetabledlelete {

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
		driver.findElement(By.xpath("//a[@href='users.html']")).click();
		List<WebElement> row=driver.findElements(By.xpath("//table/tbody/tr"));
		
		for(int i=2; i<=row.size(); i++) 
		{
			String colx ="//table/tbody/tr["+i+"]/td[1]";
			WebElement column=driver.findElement(By.xpath(colx));
			
			if (column.getText().equals("1")) 
			{
 	      driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[8]")).click();
				
			}
		}
	}

}
