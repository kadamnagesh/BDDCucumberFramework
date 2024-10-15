package javaPrograms;

public class FindSecondLargestNumber {
	
	public static void main(String[] args) 
	{
		int [] input = {10,23,45,67,98,45,99,90};
         
		if(input.length < 3) 
		{
		System.out.println("Array length is less than three");
		}
		Integer first = null, second = null;
		
		for(int num : input)
		{
			if(first == null || num > first)
			{
			second = first;
			first = num;
			}
			else if((second == null || num > second)&&(second < num)) 
			{
			second = num;
			}
			
		}
		
		System.out.println(second);
	}
}


