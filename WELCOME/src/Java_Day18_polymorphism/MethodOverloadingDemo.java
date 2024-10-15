package Java_Day18_polymorphism;

          public class MethodOverloadingDemo {
        	  
        	  MethodOverloadingDemo(){
        			
        		}
        		
        		MethodOverloadingDemo(int a)
        		{
        			
        		}

        		public static void main(String[] args) {

        			add(1, 3);
        			add(1, 1, 1);
        			add('c', 1);
        		}
        		
        		public static void main(int[] args) {
        			System.out.println("hello guys");
        		}

        		// Method overloading -> multiple methods with same method name in class
        		// by changing number of parameters
        		// by changing data type of paramater
        		// It is not possible by changing return type of method and access modifier
        		// method overloading applies to static and non-static methods
        		// main method can be overLoaded , but JVM will execute main method with String[] arguments
        		// Constructor can be Overloaded
        		

        		public static void add(int a, int b) {
        			System.out.println(a + b);
        		}

        		public static void add(int c, int d, int e) {
        			System.out.println("hi");
        		}

        		public static void add(char c, int d) {
        			System.out.println("hello");
        		}

//        		public static int add(char c,int d) {
//        			System.out.println("hello");
//        			return 1;
//        		}

        		public void substraction() {

        		}

        		public void substraction(int a) {

        		}

   }
  