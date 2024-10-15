package javaPrograms;

import java.util.ArrayList;

public class PrintUniqueCharList {

	public static void main(String[] args) {
		
           String input="testers";
		
		   ArrayList UniqueCharList=new ArrayList();
		
		    for (int i=0; i<input.length(); i++)
	     {
			char x=input.charAt(i);
			
			if (UniqueCharList.contains(x)==false) 
	     {
				UniqueCharList.add(x);
				
			}
		}
		System.out.println(UniqueCharList);
		
}
}