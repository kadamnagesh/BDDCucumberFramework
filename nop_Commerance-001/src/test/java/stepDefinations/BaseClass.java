package stepDefinations;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import pageObject.AddUserPage;
import pageObject.Loginpage;

public class BaseClass {

	public WebDriver driver;
	 public Loginpage lp;
	 public AddUserPage addcust;
	 
	 //created for genratring random string
	 
	 public static String randomString() {
		 String genratedString1=RandomStringUtils.randomAlphabetic(5);
		 return (genratedString1);
	 }
}
