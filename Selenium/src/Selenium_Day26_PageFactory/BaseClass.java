package Selenium_Day26_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class BaseClass {
	
	SoftAssert soft=new SoftAssert();
   static  WebDriver driver;
    
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
    
//    @AfterSuite
//    public void closebrowser()
//    {
//    	driver.close();
//    }
}
