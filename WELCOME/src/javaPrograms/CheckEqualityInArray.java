package javaPrograms;

public class CheckEqualityInArray {

	public static void main(String[] args) {
		
		int[] arrayOne = { 2, 5, 1, 7, 4 };
		int[] arrayTwo = { 2, 5, 1, 7, 4 };
			
		boolean flag=false;

     if (arrayOne.length==arrayTwo.length) {
			
			for (int i=0; i<arrayOne.length; i++) {
				
				if(arrayOne[i]!=arrayTwo[i]) 
				{
				flag=true;
				break;
				}
			}
			if (flag==true) 
			{
			System.out.println("array is not equal");	
			}
			else 
			{
				System.out.println("array are equal");
			}
		  }
		else 
		  {
		System.out.println("array are not equal");	
		  }

			}
		}


