package RestAssuredTests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
// 1) Test status code
// 2) Log Response
// 3) Verifying single content in response body
// 4) Verifying multiple contents in response body
// 5) Setting parameter and header

    public class Demo5_BasicValoidation_Json {

	// 1) Test status code
	
	@Test(priority = 1)
	public void testStatusCode() {
		
		given()
		.when()
		  .get("http://jsonplaceholder.typicode.com/posts/5")
		.then() 
		.statusCode(200);
		//.log().all();
	}
	
	// 2) Log Response

	@Test (priority = 2)
	    public void testLogging() 
	 {
	    given()
	
	   .when()
	     .get("http://services.groupkt.com/country/get/iso2code/IN")
	
	   .then()
	   
	    .statusCode(200)
	    
	    .log().all();
	   
	}
	
	// 3) Verifying single content in response body
	
	@Test (priority = 3)
          public void verifyingSingleContent() 
        {
           given()

          .when()
           
            .get("http://services.groupkt.com/country/get/iso2code/IN")

           .then()
   
             .statusCode(200)
              
             .body("RestResponse.result.name", equalTo("India"));
}
	//  4) Verifying multiple content in response body 
	
	  @Test (priority = 4)
        
	  public void verifyingMultipleContent() 
       {
                given()

                 .when()
                  .get("http://services.groupkt.com/country/get/all")

                  .then()

                 .body("RestResponse.result.name", hasItems("India","Australia","United States Of America"));
}
	  
	 // 5) Setting parameter and header
	  
	  @Test
	  public void verifyParamAndHeader() 
	  {
		given()
		  .param("myName","Nagesh")
		  .header("myHeader","Indian")
		.when()
		   .get("http://services.groupkt.com/country/get/iso2code/IN")
		   
		 .then()
		   .statusCode(200)
		   .log().all();
	        
	  }
}
