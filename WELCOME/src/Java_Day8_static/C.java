package Java_Day8_static;

public class C {

	public static void main(String[] args) {
	
	     A x = new A();

		System.out.println(x.age);
		System.out.println(x.b);

		x.age = 44;
		x.b = 55;

		System.out.println(x.age);
		System.out.println(x.b);
		
		System.out.println("------------------------");
		
		A y = new A();
		
		System.out.println(y.age);
		
           int age=66;
		
		System.out.println(y.b);
		
		System.out.println(y.age);
	}

}
