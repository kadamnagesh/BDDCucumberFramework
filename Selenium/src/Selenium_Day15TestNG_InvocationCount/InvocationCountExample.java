package Selenium_Day15TestNG_InvocationCount;

import org.testng.annotations.Test;

public class InvocationCountExample {
	
	  @Test(invocationCount = 3, threadPoolSize = 3)
	  
	   public void testmethod1()
	     {
		  System.out.println("I am in TC 1");
		  try {
			Thread.sleep(2000);
		      }
		  catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	  }
		 }
	  
	     
	  
	 
  
 }
