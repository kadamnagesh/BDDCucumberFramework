
package javaPrograms;

public class FindUniqueCharString {

	public static void main(String[] args) {

		// input=testers.    output=tesr
		
		String input="testers";
		String output="";
		
		for(int i=0; i<input.length(); i++)
		{
			char c=input.charAt(i);
			String s=Character.toString(c);
			
		if(output.contains(s)==false) 
			{
				output=output+s;
			}
		}
		System.out.println(output);
}
}