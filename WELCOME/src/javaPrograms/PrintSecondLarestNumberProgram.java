package javaPrograms;

public class PrintSecondLarestNumberProgram {

	public static void main(String[] args) {
		
		int [] input = {12,14,16,47,69,78,12,12};	
	    
		int largest = 0;
		int secondLargest = 0;
		
		for(int number : input) 
		{
		if(number>largest)
		{
			secondLargest = largest;
			largest = number;
		}
		
		if(number > secondLargest && number != largest)
		{
			secondLargest = number;
		}
		
		}
		
		System.out.println(secondLargest);
	}

}
