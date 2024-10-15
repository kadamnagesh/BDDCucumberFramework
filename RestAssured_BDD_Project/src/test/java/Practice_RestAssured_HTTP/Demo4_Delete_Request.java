package Practice_RestAssured_HTTP;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class Demo4_Delete_Request {

	@Test()
	public void deleteEmployeeRecord()
	{
		RestAssured.baseURI="https://reqres.in/api";
	    RestAssured.basePath="/users/7";
	    
	    given()
	    
	    .when()
	      .delete()
        
	      .then()
	       .statusCode(200);
	    
	}
}
