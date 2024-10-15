package Java_Day12_Constructor;

public class ICIC {

	public static void main(String[] args) {
	
		RBI r=new RBI(10);
		
		int iciciInterest=r.calculateintrest(200, 2);
		
		System.out.println("your interest is :"+iciciInterest);
	}
}
