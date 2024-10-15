package Java_Day6_Method;

public class Calculator {

	public static void main(String[] args) {
		int add=addition(9,3);
		System.out.println(add);
		
		System.out.println(substraction(10,5));
		
		System.out.println(verifyAge(33));

	}

	public static int addition(int x,int y)  // method signature
	{
		int c=x+y;
		return c; 
		
	}
	
	public static int substraction(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public static boolean verifyAge(int age)
	{
		if(age<18)
		{
			return true;
		}
		else
		{
			return false;
		}	
		
	}
	
	
	
		
	}
	

