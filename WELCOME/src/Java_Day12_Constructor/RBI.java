package Java_Day12_Constructor;

public class RBI {
	
	int r ;
	
	
	RBI(){
		
		// it is a default constructor
		}
	
	
	RBI(int rate){
		
		r=rate;
		// it is a parameterised constructor
		
	}
	
	public int calculateintrest(int p, int t) {
		
	int	intrest = (p*r*t)/100;
		
		return intrest;
		
	}
	
	public static void costomerinfo() {
		
		System.out.println(" i am the costomer information method");
		
	}
	
}


