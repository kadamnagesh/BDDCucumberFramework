package Java_Day_13;

public class BlockDemo {

      int a=10;
	
	    BlockDemo(){
	    	
		System.out.println("i am in constructor");
		
	}
	
	public void m1() {
		System.out.println("i am in method");
	}
	
	{
		System.out.println("i am in normal block");
	}
	
	{
		System.out.println("i am in second normal block");
	}
	
	static {
		System.out.println("i am in static block");
	}
	
	
	
}
