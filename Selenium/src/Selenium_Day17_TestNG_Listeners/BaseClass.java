package Selenium_Day17_TestNG_Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseClass  {
	static WebDriver driver;
	@BeforeSuite
	public void openBrowser() 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	 driver=new ChromeDriver ();
	 driver.manage().window().maximize();
		
	}

}
