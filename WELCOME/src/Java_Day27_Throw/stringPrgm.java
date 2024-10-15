package Java_Day27_Throw;

public class stringPrgm {

	public static void main(String[] args) {
		
		// input="56057200232380";                   output=56572232380000;
		                                             //  56572232380000

		String input="56057200232380";
	    String output = "";
	    
	    int counter =0;
	    
	    for(int i=0; i<input.length(); i++)
	    {
	    	char c = input.charAt(i);
	    	String s = Character.toString(c);
	    	
	    	if(s.equals("0")) 
	    	{
	    		counter++;
	    	}
	    	else {
	    		output = output + s;
	    	}
	    }
	    
	    for(int p=0; p<counter; p++) 
	    {
	    output = output + "0";	
	    }
	    
	    System.out.println(output);
	}

}
