package Java_Day8_static;

import java.util.Scanner;

public class PrimeNumberProgramImp {

	public static void main(String[] args) {
			
		// Problem statement : check the provided number is prime or not
         
		Scanner sc=new Scanner (System.in);
		
		System.out.println("give the number to check");
		
		int number =sc.nextInt();
		
		boolean flag=false;
		
		for (int i=2; i<=(number/2); i++) 
		{
			if(number%i==0) {
				
				flag=true;
				break;
			}
		}
		
		if (flag!=true) 
		{
		System.out.println("provided number is  prime");	
		}
		else 
		{
		System.out.println("provided number is not prime");	
		}
	}
}
