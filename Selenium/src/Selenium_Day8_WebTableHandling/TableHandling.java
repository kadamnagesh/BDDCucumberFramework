package Selenium_Day8_WebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();        // it will open the driver
				
		driver.manage().window().maximize();

	driver.get("https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/");
	
	 WebElement table=driver.findElement(By.tagName("table"));
	 JavascriptExecutor js=(JavascriptExecutor)driver;  // narrowing
	 js.executeScript("arguments[0].scrollIntoView(true)", table);
	 
       List<WebElement> row=driver.findElements(By.xpath("//table / tbody/tr"));
       System.out.println(row.size());
       for (int i=1; i<=row.size(); i++) 
        {
    	String clox="//table / tbody/tr["+i+"]/td";
    	List <WebElement> column=driver.findElements(By.xpath(clox));
    	
    	for (int j=1; j<=column.size(); j++) 
    	{
    	String xpath ="//table / tbody/tr["+i+"]/td["+j+"]";
    	String value =driver.findElement(By.xpath(xpath)).getText();
    	
    	System.out.print(value+" | ");
    	}
    	System.out.println();
       }
   }
  
	}



