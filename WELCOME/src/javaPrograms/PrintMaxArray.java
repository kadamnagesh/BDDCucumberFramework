package javaPrograms;

public class PrintMaxArray {
	
	public static void main(String[] args) {
		
		   int [] numbers = {1,7,2,8,3,34,5};
			    
			    int max = numbers[0];
			    
			    for(int i=0; i<numbers.length; i++) 
			    {
			    	if(numbers[i]>max) 
			    	{
			    		max = numbers[i];
			    	}
			    }
			    
			    System.out.println(max);
	        }
	        
	}


