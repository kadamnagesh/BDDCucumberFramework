package java_Day14_String;

public class StringMethod {

	public static void main(String[] args) {
	

		String s="myname";
		String emptyString="";
		String blankString=" ";
		String str="sumit";
		String neeta="neeta";
		
		String upparCase=s.toUpperCase();
		System.out.println(upparCase);
		System.out.println(s.toUpperCase());
		System.out.println(s);
		System.out.println("------------------");
		System.out.println(s.toLowerCase());  // convert string to lower case
		
		System.out.println(s.isEmpty());
		System.out.println(emptyString.isEmpty());  // check string is empty or not
		System.out.println(blankString.isEmpty());
		
		System.out.println(blankString.isBlank());   // check string is blank or not

		System.out.println((s.concat(neeta)).concat(str));   // join two strings

		System.out.println(s.length());   // give the count of character+spaces
		
		System.out.println(s.charAt(4));
		
		System.out.println(s.startsWith("mya"));
		
		System.out.println(s.endsWith("name"));
		System.out.println("-----------------");
		System.out.println(s.contains("yna"));
		System.out.println(s.contains("ya"));
	}

}
