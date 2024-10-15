package Java_Day26_FinallyThrowws;

public class FinallyDemo {

	public static void main(String[] args) {
		
		try 
		{
		int x=10/0;  // int x=10/2;
		
		System.out.println(x);
		System.out.println("done with dividation");
		}
		catch (ArithmeticException e)
		{
			System.out.println("i am in exception");
		}
      finally 
      {
    	System.out.println("i am in finally");  
    	                                   // Exception occures, catch block handle, finally block also execute 
    	                                  //Exception occure , catch block not handle finally block can execute 
      }                                  //Exception occure, catch block will ignore, finally block execute
	}

}
