package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
     WebDriver driver;
	@FindBy(xpath="//input[@class='email']")
	WebElement email;
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	@FindBy(xpath="//*[text()='Log in']")
	WebElement submit;
	@FindBy(xpath="//*[text()='Logout']")
	WebElement logout;
	
 	public Loginpage(WebDriver driver)
 	{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	public void email(String Email) {
		email.clear();
		email.sendKeys(Email);
	}
	public void password(String Password) {
		password.clear();
		password.sendKeys(Password);
	}
	public void click() {
		submit.click();
	}
	public void logout() {
		logout.click();
	}
}
