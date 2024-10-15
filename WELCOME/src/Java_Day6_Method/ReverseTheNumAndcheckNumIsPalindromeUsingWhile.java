package Java_Day6_Method;

public class ReverseTheNumAndcheckNumIsPalindromeUsingWhile {

	public static void main(String[] args) {
		
		int input = 123;
		int temp=input;
		 int output = 0;
		 
		 while (input>0) {
			 
			 int reminder=input % 10;
			 
			 input = input / 10;
			 
			 output= output*10+reminder;
			 
			 }
		 
			System.out.println("reverse number is " +output);
			
           if (temp==output) {
        	   
        	   System.out.println("number is palindrome");
        	   
           }
           else {
        	   System.out.println("number is not palindrome");
        	   
           }
	}

}
