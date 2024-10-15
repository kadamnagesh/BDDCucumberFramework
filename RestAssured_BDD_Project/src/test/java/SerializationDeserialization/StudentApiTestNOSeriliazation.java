package SerializationDeserialization;

import java.util.ArrayList;
import java.util.HashMap;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class StudentApiTestNOSeriliazation {

	public HashMap map=new HashMap();

   @Test(priority = 1)
	public void createNewStudent() 
	{
	  map.put("id", "101");
	  map.put("firstName", "pavan");
	  map.put("lastName", "kumar");
	  map.put("email", "abcxyz@gmail.com");
	  map.put("programme","Manger");
	  
	  ArrayList coursesList=new ArrayList();
	  coursesList.add("java");
	  coursesList.add("Selenium");
	  
	  map.put("courses",coursesList );
	  
	  given()
	    .contentType(ContentType.JSON)
	    .body(map)
	    
	  .when()
	    .post("http://localhost:8085/student")
	  
	  .then()
	     .statusCode(201)
	     .assertThat()
	     .body("msg", equalTo("Student added"));
		
	}
   @Test(priority = 2)
   void getStudentData() {
	   
	   given()
	   
	   .when()
	      .get("http://localhost:8085/student/101")
	      
	   .then()
	     .statusCode(200)
	     .assertThat()
	     .body("Id", equalTo(101));
   }
	
}
