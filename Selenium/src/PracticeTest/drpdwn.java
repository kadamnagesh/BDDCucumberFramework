package PracticeTest;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drpdwn {
	
	public static void main(String[] args) {
		
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//ul//label[@class='checkbox']"));
		
		for(WebElement option : options)
		{
			String op = option.getText();
			
			if(op.equals("Java") || op.equals("C#") || op.equals("Python") || op.equals("MySQL")) 
			{
				option.click();
			}
		}
		
		//driver.switchTo().alert().accept();

	}

}
