
package Selenium_Day8_WebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintCountryFromTable {

	 public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
       driver.get("https://www.w3schools.com/html/html_tables.asp");
     
      List<WebElement> row=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
       
       for (int i=2;  i<=row.size(); i++) 
       {
    	 String colx="//table[@id='customers']/tbody/tr["+i+"]/td[1]";  
         WebElement colxm=driver.findElement(By.xpath(colx));
    
     if (colxm.getText().equals("Island Trading")) 
     {
    	String xpath="//table[@id='customers']/tbody/tr["+i+"]/td[3]";
    	System.out.println(driver.findElement(By.xpath(xpath)).getText());
     }
       }
    
     
     
	

	}
}
