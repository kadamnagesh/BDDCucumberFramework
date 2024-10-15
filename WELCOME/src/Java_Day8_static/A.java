package Java_Day8_static;


public class A {
	
	
	 static int age = 20;
	
	  int b= 30;

	   public void m1()
	  {
		
		System.out.println("i am in non static m1");
		}
	 
	 public static void m2()
	
	{
		
		System.out.println("i am in static m2");
	}

        public static void main(String[] args) {

         System.out.println(age);

      //	m1();   // not print because m1 is non static

             m2();      // m2 is static

      //			System.out.println(b); 

    }
    }
