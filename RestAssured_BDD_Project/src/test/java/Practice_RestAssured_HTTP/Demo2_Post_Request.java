package Practice_RestAssured_HTTP;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Demo2_Post_Request { 

	public HashMap map=new HashMap();
	
	  @BeforeTest
	    public void postData()
         { 
	    	map.put("id", 7);
	         map.put("email","tracey.ignisyst@reqres.in");
	          map.put("first_name", "john");
	           map.put("last_name", "abrahim");
	          map.put("avatar","https://reqres.in/img/faces/7-image.jpg");
	          
	       RestAssured.baseURI="https://reqres.in/api";
	       RestAssured.basePath="/users";
	      
	       
         }
	  @Test(priority=1)
	public void createUser() 
	{
		given()
		  .contentType("application/json")
		  .body(map)
		  
		.when()
		   .post()
		   
		.then()
		 .statusCode(201);
	}
	
}



