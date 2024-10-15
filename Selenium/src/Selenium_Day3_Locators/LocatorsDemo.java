package Selenium_Day3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // it will open your broweser
		driver.manage().window().maximize();
		
		driver.get("C:\\Selenium\\OfflineWebsiteForSelenium-\\OfflineWebsiteForSelenium\\OfflineWebsite/index.html");
		
		Thread.sleep(2000);
		WebElement emailTextBox=driver.findElement(By.id("email"));   // similar if name attribute is available
		emailTextBox.sendKeys("kiran@gmail.com");
		WebElement passwordTextbox=driver.findElement(By.id("password"));
		passwordTextbox.sendKeys("123456");
		// driver.findElements(By.name("Nagesh"))
		WebElement submitBtn=driver.findElement(By.tagName("button"));
		submitBtn.click();
		
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement registerLink=driver.findElement(By.linkText("Register a new membership"));
		registerLink.click();
		Thread.sleep(2000);
		WebElement haveAmembership=driver.findElement(By.partialLinkText("have a membership"));
		haveAmembership.click();
	}
	
  }
