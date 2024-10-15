package Selenium_Day25_POM;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
	
	@Test
	public void loginTest()
	{
		driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		
	LoginPageClass lpc=new LoginPageClass();
	lpc.login("kiran@gmail.com", "123456");
	
	softAssert.assertEquals(driver.getCurrentUrl(), "file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboard.html");
	
	softAssert.assertAll();
	
	}
}
