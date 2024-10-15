package Selenium_Day26_PageFactory;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	@Test
	public void logintest()
	{
		driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		
		LoginPage lp=new LoginPage(driver);
		lp.loginData("kiran@gmail.com", "123456");
		
		soft.assertEquals(driver.getCurrentUrl(), "file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboard.html");
		soft.assertAll();
	}
}