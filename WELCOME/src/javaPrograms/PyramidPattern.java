package javaPrograms;

public class PyramidPattern {

	public static void main(String[] args) {
	
		int input = 121;
		
		int output = 0;
		int temp = input;
		
		while(input > 0)
		{
			int reminder = input % 10;
			input = input / 10;
			output = output*10+reminder;
		}
		
           System.out.println(output);
           
           if(output==temp) 
           {
        	   System.out.println("Number is pallindrome"); 
           }
           else 
           {
        	System.out.println("Number is not pallindrome");   
           }
   }

	}
 