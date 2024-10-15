package Selenium_Day25_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageClass extends BaseClass{

	public WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	public WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	public WebElement submit=driver.findElement(By.xpath("//*[text()='Sign In']"));
	 
	 public void login(String emailid, String userpassword)
	 {
		email.sendKeys(emailid);
		password.sendKeys(userpassword);
		submit.click();
	 }
	 
	
}
