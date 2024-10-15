package Java_Day7MethodAndObject;

public class CalculatorIntoAndDivide {

	public static void main(String[] args) {
		
		System.out.println(into (10,20));
		
		System.out.println(divide (20,5));
	}
    
	public static int into (int x, int y) {
		
		int z=(x*y);
		return z;
	}
	
	public static int divide (int a, int b) {
		
		int c=a/b;
		return c;
		
	}
}
