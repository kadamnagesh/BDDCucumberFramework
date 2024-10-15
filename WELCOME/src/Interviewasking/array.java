package Interviewasking;

import java.util.Arrays;
import java.util.Collections;

public class array {

	public static void main(String[] args) {
		
		String []a= {"y","u","i","o"};
		String []b= {"y","u","i","o"};
		
	Arrays.sort(a);
	String s=Arrays.toString(a);
	Arrays.sort(b);
	String t=Arrays.toString(b);
	
	if(s.equals(t)) {
		System.out.println("array are equal");
	}
	else {
		System.out.println("Array are not equal");
	}

}
}