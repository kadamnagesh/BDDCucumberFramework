package Selenium_Day26_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPageClass {
	WebDriver driver;
	@FindBy(xpath="//input[@id='username']")
	WebElement Username;
	@FindBy(xpath="//input[@id='mobile']")
	WebElement Mobile;
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	@FindBy(xpath="//input[@id='Male']")
	WebElement Male;
	@FindBy(tagName="select")
	WebElement State;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(id="submit")
	WebElement Submit;
	
	RegistrationPageClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void FillForm(String username, String mobile, String email,String text,String password)
	{
		Username.sendKeys(username);
		Mobile.sendKeys(mobile);
		Email.sendKeys(email);
		Male.click();
		SelectStatePage.SelectDropdown(State, text);
		Password.sendKeys(password);
		Submit.click();
	}

}
