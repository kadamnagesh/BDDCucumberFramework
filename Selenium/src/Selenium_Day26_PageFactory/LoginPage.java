package Selenium_Day26_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	@FindBy(xpath="//*[text()='Sign In']")
	WebElement Submit;
	
	LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginData(String email, String password)
	{
		Email.sendKeys(email);
		Password.sendKeys(password);
		Submit.click();
	}
}