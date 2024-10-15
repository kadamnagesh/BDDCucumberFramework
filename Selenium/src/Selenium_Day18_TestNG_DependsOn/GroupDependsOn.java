package Selenium_Day18_TestNG_DependsOn;

import org.testng.annotations.Test;

public class GroupDependsOn {
	
	 @Test(dependsOnGroups = { "SignIn" })
	    public void ViewAcc() {
	        System.out.println("SignIn Successful");
	    }
	 
	    @Test(groups = { "SignIn" })
	    public void LogIn() {
	        System.out.println("Logging  Successful");
	    }

}
