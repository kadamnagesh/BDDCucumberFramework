package Selenium_Day25_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class BaseClass {

	public static WebDriver driver;
	SoftAssert softAssert=new SoftAssert();
	@BeforeSuite
	@Parameters("browser")
	public void openbrowser(String browser)
	{
		if(browser.equals("Chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
		}
	}
	  @AfterSuite
	    public void closebrowser()
     	{
		driver.quit();
       	}
  }
