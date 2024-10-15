package PracticeTest;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBoxes {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver ();
			driver.manage().window().maximize();
			
			driver.get("https://testautomationpractice.blogspot.com/");
			
			List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
			
			/*for(WebElement checkbox : checkboxes) 
			{
				checkbox.click();
			}*/
			
			for(int i=0; i<3; i++)
			{
				checkboxes.get(i).click();				
			}
			
			Thread.sleep(5000);
			
			for(int i=0; i<checkboxes.size(); i++)
			{
				if(checkboxes.get(i).isSelected())
				{
					checkboxes.get(i).click();
				}
			}
						
	}

}
