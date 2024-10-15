package Jawa_Day17_Inheritance;

public class C {
	
	public static void main(String[] args) {
	
		B b=new B();
		System.out.println(b.x);
		
		System.out.println(b.y);
		
		// System.out.println(b.z); compile time error as z is private
		b.m3();
		
		A a=new A();
		
		B bb=new B();
		
		A ab=new B();
		
		// Parent obj=new Child();
		
		
		ab.m3();
		
		System.out.println(ab.p);
}
	
}