package RestAssuredTests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
//given() set cookies, add autho, add param, set headers info etc;
//when() get , put , post , delete
// then() validate status code, extract response, extract header cookies and header body 
public class Demo1_GET_Request {

	@Test
	public void getValidation() {
		
		given()
		  .contentType(ContentType.JSON)
	    .when()
	    .get("https://reqres.in/api/users")
       .then()
       .statusCode(200)
       .statusLine("HTTP/1.1 200 OK")
       .assertThat().body("page", equalTo(1))
       .header("Content-Type","application/json; charset=utf-8");
       
       
	

	
	}      
	
}