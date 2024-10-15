package Selenium_Day25_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UsersPage extends BaseClass {
	
	public WebElement adduser=driver.findElement(By.xpath("//*[text()='Add User']"));
	
    public void clickOnAddUser()
    {
    	adduser.click();
    }
}
