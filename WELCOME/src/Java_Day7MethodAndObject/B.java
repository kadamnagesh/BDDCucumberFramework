package Java_Day7MethodAndObject;

public class B {
          
	
	public static void main(String[] args) {
		
		// class name object referance = new class name () ----> syntax for boject creation
		
		A obj = new A ();
		
	    int add = obj.addition(22,22);
	    
	    System.out.println(add);
		
		System.out.println(obj.value);
		
	}
	
    public void name () {
    	
    	A test = new A();
    	
    	int x = test.number;
    	
    
    }
}
