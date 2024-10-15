package Selenium_Day16_TestNG_Grouping;

import org.testng.annotations.Test;

public class ClassTwo {
  @Test(groups= {"smoke"})
  public void TC4 () 
  {
	  System.out.println("iam in TC 4");
  }
 
}
