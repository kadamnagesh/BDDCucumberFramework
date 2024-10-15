package javaPrograms;

public class PrintFabonacciSeries {

	public static void main(String[] args) {
		
		// Print fabonacci series till first 10 numbers
				int n1 = 0;
				int n2 = 1;
				int n3 = 0;
				int i = 0;
				
				int count = 10;
				
				System.out.print(n1 + " " + n2);// printing 0 and 1

				for (i = 2; i < count; i++)// loop starts from 2 because 0 and 1 are already printed
				{
					n3 = n1 + n2;     // 1, 2, 3
					
					System.out.print(" " + n3);   // 1, 2, 3
					
					
					n1 = n2;  // 1, 1
					
					n2 = n3;  // 1,2
				}

	}

}
