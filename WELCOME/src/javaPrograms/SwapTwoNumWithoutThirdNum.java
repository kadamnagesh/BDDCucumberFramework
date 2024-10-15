package javaPrograms;

public class SwapTwoNumWithoutThirdNum {

	public static void main(String[] args) {
		
		// swapping of two num without using third number
		
		//a=10,  b=20  --> b=10, a=20
		
		int a=10;
		int b=20;
		
		System.out.println("a before swapping="+a);
		
		System.out.println("b before swapping is="+b);
		
		a=a+b;   // a=30
		
		b=a-b;   // b=10
		
		a=a-b;   // a=20
		
		System.out.println("a after swapping is="+a);
		
		System.out.println("b after  swapping is="+b);
	}
}
