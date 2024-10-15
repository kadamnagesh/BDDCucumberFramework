package Selenium_Day8_WebTableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printw3schooltable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> row=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		
		for (int i=2; i<=row.size(); i++) 
		{
		String xpath="//table[@id='customers']/tbody/tr["+i+"]/td"	;
		List<WebElement> colx=driver.findElements(By.xpath(xpath));
		
		for (int j=1; j<=colx.size(); j++) 
		{
		String column="//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]";
		String value=driver.findElement(By.xpath(column)).getText();
		System.out.print(value+" | ");
		}
		System.out.println();
		}
		
	}

}
