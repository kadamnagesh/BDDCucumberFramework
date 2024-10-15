package Selenium_Day21_Asseration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;


public class BaseClass {
	

	static WebDriver driver;
	static SoftAssert softAssert;
	@BeforeSuite
	public static void openbrowser()
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	      driver=new ChromeDriver();          // it will open the driver
		    driver.manage().window().maximize();
		    
          softAssert=new SoftAssert();
		    
         

	}


}
