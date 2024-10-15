package Java_Day9_AccessModifier;

public class IncrementNumberPyramid {

	public static void main(String[] args) {
  
		int a=1;
		
		for(int r=1; r<=4; r++) 
			
		{
			for(int c=1; c<=r; c++)
				
			{
				System.out.print(a+" ");
				a++;
			}
			
			System.out.println();
		}
	}
}