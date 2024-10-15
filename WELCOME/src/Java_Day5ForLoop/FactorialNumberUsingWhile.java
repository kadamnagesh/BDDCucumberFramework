package Java_Day5ForLoop;

public class FactorialNumberUsingWhile {

	public static void main(String[] args) {
		
	// to find the factorial of 5
		 
		int factorial=1;
		
		int number=5;
		
		
		while (number>=1) 
		{
		factorial=factorial*number;
		number--;
		}
		System.out.println(factorial);
		
		}

}
