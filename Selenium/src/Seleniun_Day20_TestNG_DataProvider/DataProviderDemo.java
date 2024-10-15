package Seleniun_Day20_TestNG_DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
  @Test (dataProviderClass = Seleniun_Day20_TestNG_DataProvider.AllDataProvider.class,dataProvider = "loginData" )
  
  public void login(String username , String password,int age) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();        // it will open the driver
		
   driver.manage().window().maximize();
   driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
   driver.findElement(By.id("email")).sendKeys(username)   ;
   driver.findElement(By.id("password")).sendKeys(password);
   driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(1000);
    System.out.println(age);
    driver.close();
  }
 
  
}
