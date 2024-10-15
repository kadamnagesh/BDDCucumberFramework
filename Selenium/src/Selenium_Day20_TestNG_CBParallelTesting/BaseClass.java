package Selenium_Day20_TestNG_CBParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass {
	
	static WebDriver driver;
	@BeforeSuite
	@Parameters("browser")
	public void openBrowser(String browser) 
	
	{
		if(browser.equals("chrome")) 
		{
			System.out.println("code run for chrome browser");
			// driver=new ChromeDriver();
		}
		else if (browser.equals("firefox")) 
		{
		System.out.println("code run for firefox");	
		// driver=new FireFox();
		}
	}

}
