package Practice_RestAssured_HTTP;

import java.util.HashMap;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Demo3_Put_Request {

	public HashMap map=new HashMap();
	
	int emp_id=7;
	@BeforeSuite
	public void putData() 
	{
	map.put("Age", 60)	;
	map.put("Salary", 25000);
	
	RestAssured.baseURI="https://reqres.in/api";
    RestAssured.basePath="/users/"+emp_id;
    }
	@Test(priority=1)
	public void updateUser()
	{
		given()
		 .contentType("application/json")
		 .body(map)
		 
		 .when()
		   .put()
		   
		   .then()
		    .statusCode(200)
		    .log().all();
		    
	}
	
	
	
	
}
