package Selenium_Day19_TestNG_Parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseClass {
	static WebDriver driver;
	@BeforeSuite
	@Parameters({"browser"})
	public void openbrowser(String browser)
	{
		if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if (browser.equals("firefox")) 
		{
		driver=new FirefoxDriver();	
		}
	}
	
	
	
}