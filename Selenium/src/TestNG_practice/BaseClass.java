package TestNG_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BaseClass  {
    public static WebDriver driver;
    public static SoftAssert soft;

		@BeforeSuite()
		@Parameters("browser")
		public void openBrowser(String browser)
		{
			if(browser.equals("Chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				SoftAssert soft=new SoftAssert();
			}
		}
		
		@AfterSuite()
		public void closeBrowser()
		{
			driver.close();
		}
		
		
	
	}
