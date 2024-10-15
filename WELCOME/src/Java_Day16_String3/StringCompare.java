package Java_Day16_String3;

public class StringCompare {

	public static void main(String[] args) {
		
		String s1 = "name";
		String s2 = "name";
		String s3 = new String("name");
		String s4 = "test";

		// .equals method -> check content/Value of string is equal or not

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));

		System.out.println("-----------------------");

		// == method -> check the reference in memory

		System.out.println((s1 == s2));
		System.out.println((s1 == s3));

		System.out.println("-----------------------");

		// .comparedTo -> check the string dictionary wise , Output  negative , 0 , Positive number
		
		String a1="abc";
		String a2="aabc";
		String a3="xyz";
		String a4="abc";
		
		System.out.println(a1.compareTo(a2));       // if right side string comes first in dictonary -> Positive number
		System.out.println(a2.compareTo(a1));		// if left side string comes first in dictonary -> Negative number
		System.out.println(a4.compareTo(a1));
	}
	

}
