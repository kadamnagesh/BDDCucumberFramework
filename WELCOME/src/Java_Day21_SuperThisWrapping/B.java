package Java_Day21_SuperThisWrapping;

public class B extends A {

	B(){
		super(4);
		System.out.println("i am in child constructor");
		
	}
	
	public static void main(String[] args) {
		
		B c=new B();
		c.display();
		
	}
	
	int x=20;
	
	public void m1() {
		
		System.out.println("i am in child m1");
	}


	
	public void display() {
		
		System.out.println(x);
		m1();
		System.out.println("--------");
		System.out.println(super.x);
		super.m1();
		System.out.println("--------");
		System.out.println(this.x);
		this.m1();

	}
  }
