package Java_Day10_Arrey;

public class CheckMissingNumInArrey {

	public static void main(String[] args) {
		
		  // check missing number
		
		int [] input = { 1, 2, 3, 5 };
		 
		 int addition = 0;
		 
		 for (int i=1; i<=5; i++) 
		   {
			  addition = addition+i;  // 1, 3, 6, 10, 15
		   }
		 
		 int alladdition = 0;
		 
		 for (int j=0; j<input.length; j++) {
			 
			 alladdition=alladdition+input[j];  // 1, 3, 6, 11
			 
			 }
		 
	         addition= addition-alladdition;
	         
	         System.out.println(addition);
	}
	
}