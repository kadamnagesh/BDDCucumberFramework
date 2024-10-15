package Java_Day21_SuperThisWrapping;

public class A {
	
        int x=10;
        
        public void m1() 
        {
        System.out.println("i am in parent m1");	
        }
	A()
	{
		System.out.println("i am in default constructor");
	}
	
	A(int x)
	{
		System.out.println("i am parametrised constructor");
	}

     }
