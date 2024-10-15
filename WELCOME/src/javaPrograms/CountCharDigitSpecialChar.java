
package javaPrograms;

public class CountCharDigitSpecialChar {

	public static void main(String[] args) {
	
         
         int a = 132;
         int output = 0;
         
        while(a>0)
        {
        	int reminder = a%10;
        	
        	a = a/10;
        	
        	output = output*10+reminder;
        }
        
        System.out.println(output);
	}

}
