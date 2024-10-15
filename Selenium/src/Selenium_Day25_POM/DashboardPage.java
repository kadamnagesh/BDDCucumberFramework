package Selenium_Day25_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BaseClass {
	
	public WebElement user=driver.findElement(By.xpath("//a[@href='users.html']"));
	
	public void clickonuser()
	{
		user.click();
	}


}
