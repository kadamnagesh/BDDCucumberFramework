package TestNG_practice;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass  {
	@Test
	public void login() {
		  driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");  
		
	      	loginpage lp=new loginpage(driver);
	      	lp.login("kiran@gmail.com", "123456");
	      	 UsersPageClass up = new  UsersPageClass(driver);
	      	 up.user();
	      	AdduserPage ap=new AdduserPage(driver);
	      	ap.addUser();
	      	RegistrationpageClass rpc=new RegistrationpageClass (driver);
	      	rpc.resgistrationform("ignisyst", "1234567890", "ignisyst@gmail.com", "HP", "123456");
	      	Alerthandlepage al=new Alerthandlepage();
	      	al.alert();
	      
	}
}
