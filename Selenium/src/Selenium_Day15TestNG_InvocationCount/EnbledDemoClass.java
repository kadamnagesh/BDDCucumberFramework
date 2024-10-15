package Selenium_Day15TestNG_InvocationCount;

import org.testng.annotations.Test;

public class EnbledDemoClass {
	
  @Test(enabled=false)
  public void testMethod1() 
  {
	  System.out.println("i am in Tc 1");
  }
  @Test (enabled=true)
  public void testMethod2() 
  {
	  System.out.println("I am in TC 2");
  }
  
  @Test
  public void testMethod3() 
  {
	  System.out.println("I am in TC 3");
  }
  
  @Test
  public void testMethod4() 
  {
	  System.out.println("I am in TC 4");
  }
}
