package Selenium_Day10_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

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
		 
		 Actions act=new Actions(driver);
	   //
		 act.contextClick().build().perform();     // right click on the web element
		 act.contextClick(driver.findElement(By.xpath("//input[@id='Male']"))).build().perform();
//		 
//		 act.click(); // to click on webElement
//		 act.contextClick().build().perform(); //right click
//		 act.doubleClick(); // double click
//		 act.clickAndHold();     // click and hold element;
//		 
//		 act.moveToElement(null); // to move cursor to selected element
//		 act.dragAndDrop(null, null); //to perform drag and drop element
//		 
		 
		 // keyboard commond
		 
        // act.sendKeys("uytfc");
        // act.keyDown(Keys.CONTROL);
		// act.KeyUp(Keys.CONTROL);
//		 
		 
	}

}
