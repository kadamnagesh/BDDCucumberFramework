package RestAssuredTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

public class Demo4_Delete_Request {

	
	public void deleteEmployeeRecord() {
		
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/11500";
		
	/*	Response response=
		
		given()
		
		.when()
           	.delete()	
           	
		.then()
		   .statusCode(200)
		   .statusLine("HTTP/1.1 200OK")
		   .log().all()   
		
		   String jsonString=response.asString();
		Assert.assertEquals(jsonString.contains("Successfully! deleted Record"), true);  */
		
	}
}
