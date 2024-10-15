package Java_Day3;


    public class LocalAndGlobleVariables {
	
	int a=10;   // global variable : defined at class level
	

	public static void main(String[] args) {
		
    int  b=20;   // local variable: defined at method level
		 
  	}
	
	public void test()
	
	{
		int c=a;
		
		System.out.println(a);
		
		// int d=b; - will give error as b is local variable in method main
		

	}

}
