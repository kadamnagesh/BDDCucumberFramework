package Selenium_Day28_POM2.Log4j;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;

public class TestClass extends BaseClass {
	@Test
	
	public void LoginTest()
	{
		log = Logger.getLogger(TestClass.class);
		log.info("running test case : loginTest");
		driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		log.info("url opened");
		LoginPagelog4j lp = new LoginPagelog4j(driver);

		lp.loginData("kiran@gmail.com", "123456");
		log.info("email and password entered");

		soft.assertEquals(driver.getCurrentUrl(),
				"file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples/dashboard.html");

		soft.assertAll();
		log.info("loginTest Pass");

	}

}
