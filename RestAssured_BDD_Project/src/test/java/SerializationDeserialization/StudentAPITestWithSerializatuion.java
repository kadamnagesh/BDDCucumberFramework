package SerializationDeserialization;

import java.util.ArrayList;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class StudentAPITestWithSerializatuion {

	@Test(priority=1)
	public void createNewSerialization() 
	{
	  ArrayList<String> arraylist=new ArrayList<String>();
	  arraylist.add("Java");
	  arraylist.add("selenium");
		
	    Student stu=new Student();
	     stu.setSID(101) ;
	     stu.setfirstName("John") ;
	     stu.setlastName("Deo") ;
	     stu.setemail("abc@gmail.com") ;
	     stu.setprogramme("Computer science") ;
	     stu.setCourses(arraylist) ;
	     
	     given()
	        .contentType(ContentType.JSON)
	        
	     .when()
	         .post("http://localhost:8085/student/101")
	     .then()
	        .statusCode(201)
	        .assertThat()
	        .body("msg", equalTo("Student added"));
	    
	}
	
	@Test(priority=2)
	
	  public void getStudentRecordDeseliarization() 
	 {
	 	
	  Student stu=get("http://localhost:8085/student/101").as(Student.class);
	 	System.out.println(stu.getStudentRecord());
	 	Assert.assertEquals(stu.getSID(), 101);
	 	
	 }
	
}
