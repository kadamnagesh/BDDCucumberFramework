package TestNG_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Listners {
	
	@Test
	public void login()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.xpath("//button[text()='Add Textbox1']")).click();
//	   WebDriverWait wait=new WebDriverWait(driver,10);
//	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("input[@id='txt1']/parent::h3//input")));
//	   
        
	   
	   
		driver.findElement(By.xpath("//input[@id='txt1']/parent::h3//input")).sendKeys("testers");

	}
}
