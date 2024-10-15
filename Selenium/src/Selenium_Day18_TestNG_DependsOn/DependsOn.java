package Selenium_Day18_TestNG_DependsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {
 @Test
 public void signin()
 {
	 System.out.println("this is sign up");
 }
 @Test(dependsOnMethods = {"signin"})
 public void login()
 {
	 System.out.println("this is login");
 }
 @Test(dependsOnMethods= {"login"})
 public void searchorder()
 {
	 System.out.println("this is searchorder"); // if method fail then stop the excecution flow
//	 Assert.assertEquals(true, false);
 }
 @Test(dependsOnMethods= {"searchorder"})
 public void addtocart()
 {
	 System.out.println("this is add to cart");
 }
 @Test(dependsOnMethods="addtocart")
 public void checkout()
 {
	 System.out.println("this is checkout");
 }
 @Test(dependsOnMethods= {"checkout"})
 public void payment()
 {
	 System.out.println("this is payment");
 }
  }
