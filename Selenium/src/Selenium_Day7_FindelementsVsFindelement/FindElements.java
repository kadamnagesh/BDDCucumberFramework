package Selenium_Day7_FindelementsVsFindelement;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("C:\\Selenium\\OfflineWebsiteForSelenium-\\OfflineWebsiteForSelenium\\OfflineWebsite\\index.html");
	
	List<WebElement> li=driver.findElements(By.xpath("//a[text()='Register a new membership1']"));
	
	for (WebElement wb:li) 
	{
	   wb.click();	
	}
	
	}

}
