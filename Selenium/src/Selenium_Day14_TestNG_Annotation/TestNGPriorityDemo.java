package Selenium_Day14_TestNG_Annotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGPriorityDemo {
	
	//  default priority is 'zero'
   //   when we have same priority TC then sort alphabetically and execute
   //   we can give priority like, -1,1,2,3,
	
       @Test(priority=1)
          public void atestmethod1() 
       {
	      System.out.println("I am in TC 1");
       }
            @Test(priority=1)
                 public void testmethod2() 
            {
	             System.out.println("I am in TC 2");
            }
             @Test(priority=-1)
                  public void testmethod3() 
             {
	               System.out.println("I am in TC 3");
              }
 

  }
