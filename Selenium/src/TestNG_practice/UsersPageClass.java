package TestNG_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPageClass {
	WebDriver driver;
	
	@FindBy(xpath="//*[text()='Users']")
	WebElement User;
	
	UsersPageClass(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	public void user() 
	{
	User.click();	
	}
	
	
   
}
