package Java_Day20_Encapsulation;

public class ExpandString {

	public static void main(String[] args) {

		// input 3a2b1c output aaabbc

		String input="3a2b1c";
	    String output="";
      
	    for (int i=0; i<input.length(); i=i+2)
	    {
	    	char num =input.charAt(i);
	    	
	    	int number=Character.getNumericValue(num);
	    	
	    	for (int j=1; j<=number; j++)
	    	{
	    		output=output+input.charAt(i+1); //  aaa,   aaabb, aaabbcc
	    	}
	    }
	       System.out.println(output);
 }
}