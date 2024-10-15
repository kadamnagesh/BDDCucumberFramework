package RestAssuredTests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
/* 1) Verifying Single content in XML response
 * 2) verifying Multiple content in XML response
 * 3) Verifying all content in XML response in one go
 * 4) find value Using XML path in XML response
 * 5) Xpath with text() function
 */
  public class Demo6_BasicValidation_XML {

	// 1) Verifying Single content in XML response
	  
	  @Test (priority = 1)
	   void testSingleContent() 
	  {
		given()
		
		.when()
		   .get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		   
	    .then()
		    .statusCode(200)
		    .body("CUSTOMER.ID", equalTo("15"))
		    .log().all();
		}
	  
	  //  2) verifying Multiple content in XML response
	  
	  @Test(priority = 2)
	  
	  void testingMultipleContent() 
	  {
		 given()
		  
		 .when()
		      .get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		     
		 .then()
		    .statusCode(200)
		      .body("CUSTOMER.ID", equalTo("15"))
		      .body("CUSTOMER.FIRSTNAME", equalTo("Bill"))
		      .body("CUSTOMER.LASTNAME", equalTo("Clancy"))
		      .body("CUSTOMER.STREET", equalTo("319 Upland Pl."))
		      .body("CUSTOMER.CITY", equalTo("Seattle"));
	  }
	  
	  // 3) Verifying all content in XML response in one go
	  
	  @Test(priority = 3)
	    void verifyAllContent() 
	   {
		  given()
		  
		  .when()
		    .get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		    
		  .then()
		     .body("CUSTOMER.text()", equalTo("15BillClancy319 Upland Pl.Seattle"));
		  
	   }
	  
	// 4) find value Using XML path in XML response
	  
	   @Test(priority = 4)
	    void testUsingXpath1() 
	    {
	     given()
	     
	     .when()
	       .get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
	     .then()
	    	.body(hasXPath("/CUSTOMER/FIRSTNAME", containsString("Bill")));
	   }
	   
	// 5) Xpath with text() function
	   
	  @Test(priority = 5)
	    void testUsingXpath() 
	    {
	     given()
	     
	     .when()
	       .get("http://thomas-bayer.com/sqlrest/INVOICE/")
	       
	     .then()
	    	.body(hasXPath("/INVOICEList/INVOICE[text()='30']"));
	    	
	    }
	  
    }
