package RestAssuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class Demo2_Post_Request {

	
	public static HashMap map=new HashMap();
	
	@BeforeClass
	public void testData() {
		
		map.put("FirstName", RestUtils.getFirstName());
		map.put("LastName", RestUtils.getLastName());
		map.put("UserName", RestUtils.getUserName());
		map.put("Password", RestUtils.getPassword());
		map.put("Email", RestUtils.getEmail());
		
		RestAssured.baseURI="https://reqres.in/api/users";
		RestAssured.basePath="/register";
		
		}   
	
	@Test
	public void testPost() {
		
		given()
		.contentType("application/json")
		.body(map)
		
		.when()
		   .post()
		   
		.then()
		  .statusCode(201)
		  .and()
		  .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
		  .and()
		  .body("Message", equalTo("Operation Completed Successfully"));
		
	}
}
