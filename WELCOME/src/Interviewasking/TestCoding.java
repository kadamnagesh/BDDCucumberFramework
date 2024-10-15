package Interviewasking;

public class TestCoding {

	public static void main(String[] args) 
	  {
		
		int year = 2001;
		
		if((year%4==0)||(year%100!=100) &&(year%400==0))
		{
			System.out.println("Year is leap");
		}
		else 
		{
			System.out.println("year is not leap");
		}
	  }
 }

                    