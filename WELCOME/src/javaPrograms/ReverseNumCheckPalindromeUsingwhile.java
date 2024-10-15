package javaPrograms;

public class ReverseNumCheckPalindromeUsingwhile {

	public static void main(String[] args) {
	    
		int input=454;
		int output=0;
		
		while(input > 0)
		{
			int reminder = input%10;
			input = input/10;
			output = output*10+reminder;
		}
		
		System.out.println(output);
	}	
}
