
package Seleniun_Day20_TestNG_DataProvider;

import org.testng.annotations.DataProvider;

public class AllDataProvider {

	 @DataProvider  (name="loginData")
	 
	  public static Object[][] testdata()
	  {
		  Object [][] obj= {{"","",1},{"kiran@123","",2},{"","123456",3},{"kiran123","567890",4}};
		  return obj;
	  }
	 
	 // to take data from excel sheet
	 
//	 @DataProvider(name="data")
//	  public static Object[][] testdata()
//	  {
//		  Object [][] obj= ExcelRead.readExcel("location of file", sheet1);
//		  return obj;
//	  }
}
