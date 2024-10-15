package TestNG_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationpageClass {
  WebDriver driver;
	@FindBy(xpath="//input[@id='username']")
	WebElement Username;
	@FindBy(xpath="//input[@id='mobile']")
	WebElement Mobile;
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	@FindBy(xpath="//input[@id='Male']")
	WebElement Male;
	@FindBy(xpath="//select")
	WebElement State;
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	@FindBy(xpath="//*[@id='submit']")
	WebElement Submit;
	
	RegistrationpageClass(WebDriver driver){
		this.driver=driver;
       PageFactory.initElements(driver, this);
	}
	public void resgistrationform(String username,String mobile, String email, String text, String password) 
	{
		Username.sendKeys(username);
		Mobile.sendKeys(mobile);
		Email.sendKeys(email);
		Male.click();
		DropdownPage.SelectDropdown(State, text);
		Password.sendKeys(password);
		Submit.click();
	}
	
}
