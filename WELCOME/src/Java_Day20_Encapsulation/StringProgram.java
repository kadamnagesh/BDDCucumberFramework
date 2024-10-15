package Java_Day20_Encapsulation;

public class StringProgram {

	public static void main(String[] args) {
		
		// input abcd   output abacadbcbdcd
		
		String input ="abcd";
		
		String output="";
		
		for (int i=0; i<input.length(); i++) {
			
			char c=input.charAt(i);
			
			for (int j=i+1; j<input.length(); j++) {
				
		output=output+input.charAt(i) + input.charAt(j); //    abacad,       abacadbcbd,    abacadbcbdcd
				
			}
			
		}
		
		System.out.println(output);
		
	  }

   }
