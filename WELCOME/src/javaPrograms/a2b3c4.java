package javaPrograms;

public class a2b3c4 {

	public static void main(String[] args) {
		

	    String s = "a2b3c4";
	    
	    StringBuilder sb = new StringBuilder();
	    
	    
	    for(int i=0; i<s.length(); i++)
	    {
	    	char c = s.charAt(i);
	    	
	    	if(Character.isLetter(c))
	    	{
	    		int count = Character.getNumericValue(s.charAt(i+1));
	    		
	    		for(int j=0; j<count; j++)
	    		{
	    			sb.append(c);
	    		}
	    	}
	    }
	    
	    System.out.println(sb);

	}

}
