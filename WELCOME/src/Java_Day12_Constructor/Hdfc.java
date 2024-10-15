package Java_Day12_Constructor;

public class Hdfc {

	public static void main(String[] args) {
		
		 RBI hh = new RBI (9);
		
		int hdfcintrest = hh.calculateintrest(100, 1);
		
		System.out.println("your intrest is "+hdfcintrest);
		
	       RBI.costomerinfo();
				
	}
}
