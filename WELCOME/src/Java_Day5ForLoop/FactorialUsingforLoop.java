package Java_Day5ForLoop;

public class FactorialUsingforLoop {

	public static void main(String[] args) {
		
        int factorial=1;
        
        for (int i=4; i>=1; i--)
        {
        	factorial=factorial*i;
        }
        System.out.println(factorial);
	}

}
