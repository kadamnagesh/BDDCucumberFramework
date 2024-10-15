package Selenium_Day7_FindelementsVsFindelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFindElementsVsFindelement {

	public static void main(String[] args) {
	
    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();        // it will open the driver
		
   driver.manage().window().maximize();
   driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
   driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
   driver.findElement(By.id("password")).sendKeys("123456");
   driver.findElement(By.xpath("//button[@type='submit']")).click();
  
   List<WebElement> li=driver.findElements(By.tagName("a"));
   int linkCounts = li.size();
   System.out.print(linkCounts);
   
   for (WebElement list:li) 
   {
	System.out.println(list);   
   }
   
	}

}

