package Java_Day6_Method;

public class ReverseNumCheckPalindromeUsingwhile {

	public static void main(String[] args) {
	
		int input=454;
		int output=0;
		
		int temp=input;
		
		while(input>0) 
		{
		int reminder=input%10; // 4, 5, 4
		
		input=input/10;  // 45, 4, 0
		
		output=output*10+reminder;  // 4, 45, 454
		}
		
		System.out.println("reverse number is "+output);
		
		if (temp==output)
		{
			System.out.println("number is pallindrome");
		}
		else 
		{
		System.out.println("number is not pallindrome");	
		}
		
	}
	
}
