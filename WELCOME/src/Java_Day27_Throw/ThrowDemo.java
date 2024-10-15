package Java_Day27_Throw;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("provide your age");
	
		int age=sc.nextInt();
		
		if (age < 18) 
		{
		  throw new UserDefinedExeption();	
		}
		else 
		{
			System.out.println("you are eligible");
		}
	}

}
