package Selenium_Day25_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterationForm extends BaseClass {
	
	public WebElement Username=driver.findElement(By.xpath("//input[@id='username']"));
	public WebElement Mobile=driver.findElement(By.xpath("//input[@id='mobile']"));
	public WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	public WebElement Male=driver.findElement(By.xpath("//input[@id='Male']"));
	public WebElement State=driver.findElement(By.tagName("Select"));
	public WebElement Password = driver.findElement(By.id("password"));
	public WebElement Submit=driver.findElement(By.id("submit"));
	
	public void FillForm(String username, String mobile,String email, String text, String password)
	{
       Username.sendKeys(username);
       Mobile.sendKeys(mobile);
       Email.sendKeys(email);
       Male.click();
       SelectDropdownMethods.SelectByVisible(State, text);
       Password.sendKeys(password);
       Submit.click();
	}
		
	}


