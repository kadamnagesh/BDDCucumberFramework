package Java_Day_13;

public class ForEachDemo {

	public static void main(String[] args) {
		
		int aa [] = {1, 2, 3, 4, 5 };
		
		for (int i=0; i<aa.length; i++) 
		{
	//	 System.out.println(aa[i]);	
			
		}
		
		for (int nagesh : aa) 
		{
		System.out.println(nagesh);	
		}
		
		
		String str [] = {"ss","pp","tt"};
		
		for (String kadam : str) {
			
			System.out.print(kadam+" ");
		}
		
	}
}
