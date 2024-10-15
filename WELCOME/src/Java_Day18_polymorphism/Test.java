package Java_Day18_polymorphism;

public class Test {
	
		public static void main(String[] args) {
			
			
			Parent p=new Parent();
			p.m10();

			
			Child c=new Child();
			c.m10();
			
			Parent pc=new Child();
			
			pc.m10();
			
			pc.m11();
		}



}
