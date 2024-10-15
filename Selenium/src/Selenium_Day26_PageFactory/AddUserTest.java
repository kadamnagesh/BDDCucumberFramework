package Selenium_Day26_PageFactory;

import org.testng.annotations.Test;

public class AddUserTest extends BaseClass {
	
	@Test
	public void AddUsertest() 
	{
		driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");	
		
		LoginPage lp=new LoginPage(driver);
		lp.loginData("kiran@gmail.com", "123456");
		
		soft.assertEquals(driver.getCurrentUrl(), "file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboard.html");
		soft.assertAll();
		
		Userpage up=new Userpage(driver);
		up.ClickOnUser();
		
		AddUserPage aup=new AddUserPage(driver);
			aup.ClickOnAddUser();	
			      
			RegistrationPageClass rp=new RegistrationPageClass(driver);
			rp.FillForm("ignisyst", "1111111", "email@email.com", "HP", "1111");
	}

}
