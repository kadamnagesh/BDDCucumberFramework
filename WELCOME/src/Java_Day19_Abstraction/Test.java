package Java_Day19_Abstraction;

public class Test {

	public static void main(String[] args) {
	
		AbstractChild aa=new AbstractChild();
           
		aa.m1();
		
		aa.m2();
		
		AbstractDemoClass cc = new AbstractChild();
		
		cc.m1() ;
		
		cc.m2() ;
		
}
}