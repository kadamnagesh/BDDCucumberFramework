package Practice_RestAssured_HTTP;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Demo1_GET_Request {

	@Test(priority=1)
	public void getRequest() {
		
		given()
		   .contentType(ContentType.JSON)
		   
		.when()
		    .get("https://reqres.in/api/users")
		    
		.then()
		  .statusCode(200)
		  .statusLine("HTTP/1.1 200 OK")
		    .body("page", equalTo(1));
	}
}
