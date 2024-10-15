package Selenium_Day1_Intro;

import java.awt.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b {

    public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); // it will open the driver

	driver.manage().window().maximize();
	driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//a[@href='users.html']")).click();
	driver.findElement(By.xpath("//button[text()='Add User']")).click();
	driver.findElement(By.id("username")).sendKeys("ignisyst");
	driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("12345234");
	driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ignisyst@gmail.com");
	driver.findElement(By.xpath("//input[@id='Male']")).click();
	
//    List <WebElement> drop = driver.findElements(By.xpath("//option"));
//	 
//	Iterator<E> itr=li.Iterator();

	}
	
 }
   
