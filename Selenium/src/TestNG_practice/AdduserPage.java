package TestNG_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Selenium_Day22_PropertyFile.PropertyFileOperation;

public class AdduserPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[text()='Add User']")
	WebElement adduser;
	
	AdduserPage(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void addUser() {
		adduser.click();
	}
	
 }