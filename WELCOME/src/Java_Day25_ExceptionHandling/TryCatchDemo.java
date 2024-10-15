package Java_Day25_ExceptionHandling;

import java.io.FileInputStream;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try 
		{
		  int c= a/b ;   // unchecked exception                    // arithmetic Exception
		  
		  System.out.println(c);
	    }
		
		  catch(ArithmeticException e)
		
		  {
			System.out.println(e.getMessage());
		  }
		
		String s=null;   // NullPointetException
		
		try
		{
			System.out.println(s.length());                      //NullPointerException
		}
		catch (NullPointerException e)
		{
		System.out.println(e.getMessage());	
		}
	
     
		String x="abcefh";
		try {
		int i=Integer.parseInt(x);                             //NumberFormatException
       System.out.println(i);
		}
		catch(NumberFormatException e) 
		{
			System.out.println(e.getMessage());
		}
		
		int arr[]=new int[4];
		try {
		arr[4]=100;                                             //ArrayIndexOutOfBoundsException
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("program complete");
	}

    }
