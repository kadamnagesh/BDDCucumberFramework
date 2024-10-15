package Selenium_Day10_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeFlipkartdemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.flipkart.com");
		
		Actions act=new Actions(driver);
       act.sendKeys(Keys.ESCAPE).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Fashion']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Men Footwear']"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[text()='Shoe Care']"))).build().perform();
		act.click().build().perform();
	}

}
