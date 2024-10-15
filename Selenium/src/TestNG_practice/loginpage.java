package TestNG_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends BaseClass {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id='email']")
	WebElement Email;
	@FindBy(xpath="//*[@id='password']")
	WebElement Password;
	@FindBy(xpath="//*[text()='Sign In']")
	WebElement Submit;
	
	loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String email, String password) 
	{
	Email.sendKeys(email);
	Password.sendKeys(password);
	Submit.click();
	}
				
		
	
}
