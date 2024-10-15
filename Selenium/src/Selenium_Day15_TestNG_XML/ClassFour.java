package Selenium_Day15_TestNG_XML;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClassFour {
	@BeforeSuite
	  public void beforeSuite() {
		  System.out.println("this is beforeSuite");
	  }
	
	 @BeforeTest
	  public void beforeTest() {
		  System.out.println("this is beforeTest");
	  }
	 
	 @BeforeClass
	  public void beforeClass() {
		  System.out.println("this is beforeClass");
	  }

	 @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("this is before method");
	  }

	
    @Test
    public void testMethod1()
   {
	  System.out.println("I am in TC 4");
    }

   @AfterMethod
   public void afterMethod() {
	  System.out.println("this is afterMethod");
   }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is afterClass");
  }

     @AfterTest
      public void afterTest() {
	  System.out.println("this is afterTest");
     }
       
     @AfterSuite
       public void afterSuite() {
	     System.out.println("this is afterSuite");
 }

}
