package Selenium_Day28_POM2.Log4j;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class BaseClass {

	public static WebDriver driver;
	SoftAssert soft=new SoftAssert();
	static Logger log;
	@BeforeSuite
	@Parameters("openbrowser")
	
	public void openbrowser(String browsername) 
	{
		PropertyConfigurator.configure("C:\\core java\\Selenium\\Log4jConfig.properties");
		if(browsername.equals("Chrome")) 
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
