package RestAssuredTests;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class Demo3_Put_Request {

	public HashMap map=new HashMap();
	
	String empName=RestUtils.empName();
	String empSal=RestUtils.empSal();
	String empAge=RestUtils.empAge();
	
	int emp_id=11252;
	
	public void putData() {
		
		map.put("Name",empName);
	    map.put("Salary", empSal);
	    map.put("Age", empAge);
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
	RestAssured.basePath="/update/"+emp_id;
	}
	public void testPut() {
		
		given()
		.contentType("application/json")
		.body(map)
		
		.when()
		.put()
		
		.then()
		.statusCode(200);
		  
	}
}
