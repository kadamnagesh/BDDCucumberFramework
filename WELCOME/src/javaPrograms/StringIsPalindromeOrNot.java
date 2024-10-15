package javaPrograms;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {

		String input="bob";
		String output="";
		
		for (int i=(input.length()-1); i>=0; i--)
		{
			char c=input.charAt(i);
			output=output+c;
		}
		if(output.equals(input))
		{
			System.out.println("string is pallindrome");
		}
		else {
			System.out.println("string is not pallindrome");
		}
	  }
   }
 
