package Selenium_Day10_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteUsingActionClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
   driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
	
   driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   driver.findElement(By.xpath("//a[@href='users.html']")).click();
   driver.findElement(By.xpath("//*[text()='Add User']")).click();


     Actions al=new Actions(driver);
   al.moveToElement(driver.findElement(By.xpath("//*[text()='Username']")));
   al.doubleClick().build().perform();
   al.keyDown(Keys.CONTROL).build().perform();
   al.sendKeys("c").build().perform();
   al.keyUp(Keys.CONTROL).build().perform();
   al.sendKeys(Keys.TAB).build().perform();
   al.keyDown(Keys.CONTROL).build().perform();
   al.sendKeys("v").build().perform();
   al.keyUp(Keys.CONTROL).build().perform();
   
   
   
	}

}
