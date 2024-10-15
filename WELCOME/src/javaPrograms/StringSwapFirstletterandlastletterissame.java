package javaPrograms;

public class StringSwapFirstletterandlastletterissame {

	public static void main(String[] args) 
	{
		
	String input = "Nagesh";
	
	char [] chars = input.toCharArray();
	
	// swap the second and fifth character
	
	char temp = chars[1];
	chars[1] = chars[4];
	chars[4] = temp;
	
	// swap the third and fourth character
	
	temp = chars[2];
	chars[2] = chars[3];
	chars[3] = temp;
	
	System.out.println(chars);
	
	}

}
