package SerializationDeserialization;

import java.util.List;

public class Student {

	public Integer id;
	public String firstName;
	public String lastName;
	public String email;
	public String programme;
	
	 List<String> courses;
	 
	 public int getSID() {
		 return id;
	 }
	 public void setSID(Integer id) {
		 this.id=id;
	 }
	 public String getfirstName() {
		 return firstName;
	 }
	 public void setfirstName(String firstName) {
		 this.firstName=firstName;
	 }
	 public String getlastName() {
		 return lastName;
	 }
	 public void setlastName(String lastName) {
		 this.lastName=lastName;
	 }
	 public String getemail() {
		 return email;
	 }
	 public void setemail(String email) {
		 this.email=email;
	 }
	 public String getprogramme() {
		 return programme;
	 }
	 public void setprogramme(String programme) {
		 this.programme=programme;
	 }
	 public List<String> getCourses() 
	 {
		 return courses;
	 }
	 public void setCourses(List<String> courses)
	 {
		 this.courses=courses;
	 }
	 public String getStudentRecord()
	 {
		 return(this.id+" "+this.firstName+" "+this.lastName+" "+this.email+" "+this.programme+" "+this.courses);
	 }
}
