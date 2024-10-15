package Java_Day25_ExceptionHandling;

public class Exceptiontrycatch {

	public static void main(String[] args) {
	
		int a=10;
		int b=0;
	   try {	
	 //  int  c=a/b;
	    
	    int x []= new int [2];  // unchecked exception
	    
	    x[2]=10;
	}
	catch (ArithmeticException e)
	{
		e.printStackTrace();
		System.out.println("dividation is not correct");
	}
	   catch(ArrayIndexOutOfBoundsException e) 
	   {
		   e.printStackTrace();            //to show where is exception
		   System.out.println("index mismatch");
	   }
	catch (Exception e)
	{
		System.out.println("i am handling all exception");
	}
	System.out.println("program completed");
	}

}
