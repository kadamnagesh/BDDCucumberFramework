package Selenium_Day20_TestNG_Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	static WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	
	public void openbrowser(String browser)
	{
		if (browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
	}
		else if (browser.equals("firefox")) 
		{
		driver=new FirefoxDriver();	
		}
	}
	
	
}
