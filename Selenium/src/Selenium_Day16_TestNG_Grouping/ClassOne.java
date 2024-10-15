package Selenium_Day16_TestNG_Grouping;

import org.testng.annotations.Test;

public class ClassOne {

	@Test(groups = {"smoke","regression"})
	public void TC1 () 
	{
	System.out.println("i am in TC 1");	
	}
	@Test(groups= {"sanity", "regression"})
	public void TC2 () 
	{
	System.out.println("i am in TC 2");	
	}
	@Test(groups= {"regression"})
	public void TC3 () 
	{
	System.out.println("i am in TC 3");	
	}
}
