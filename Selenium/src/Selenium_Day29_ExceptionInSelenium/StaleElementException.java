package Selenium_Day29_ExceptionInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaleElementException {
	
	static WebDriver driver;
	
	@Test
	public void loginuser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	    WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		WebElement submit=driver.findElement(By.xpath("//*[text()='Sign In']"));
	    email.sendKeys("kiran@123");
	  //  driver.navigate().refresh();    when page is refreshing at runtime then it will give staleElementReferenceException
	    password.sendKeys("123456");
	    submit.click();
	}

}
