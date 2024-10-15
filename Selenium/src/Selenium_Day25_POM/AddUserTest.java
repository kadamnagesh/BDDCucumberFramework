package Selenium_Day25_POM;

import org.testng.annotations.Test;

public class AddUserTest extends BaseClass {
	
      @Test()
      public void Adduser()
      {
    	  driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
  		
    		LoginPageClass lpc=new LoginPageClass();
    		lpc.login("kiran@gmail.com", "123456");
    		
    		softAssert.assertEquals(driver.getCurrentUrl(), "file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboard.html");
    		
    		softAssert.assertAll();
    		
    		DashboardPage db=new DashboardPage();
    		db.clickonuser();
    		
    		UsersPage up=new UsersPage();
    		up.clickOnAddUser();
    		
    		RegisterationForm rf=new RegisterationForm();
    		rf.FillForm("ignisyst", "1111111", "abc@email.com", "HP", "87695");
    		
    		
    		
      }
	

}
