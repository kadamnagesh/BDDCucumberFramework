
package Java_Day20_Encapsulation;

public class CountCharDigitSpecialChar {

	public static void main(String[] args) {
	
		// input a1b%$av1 -> alphabates-4 , digit/number->2 specialchar ->2

		String input="a1b%$av1";
		
		int alphabate=0;
		int digit=0;
		int specialchar=0;
		
		for(int i=0; i<input.length(); i++)
		{
			char c=input.charAt(i);
			
			if(Character.isAlphabetic(c)) 
			{
			alphabate=alphabate+1;	
			}
			else if (Character.isDigit(c)) 
			{
			digit=digit+1;	
			}
			else 
			{
			specialchar=specialchar+1;	
			}
	   	}
		
		System.out.println("count of alphabate is="+ alphabate);
		System.out.println("count of digit is="+ digit);
		System.out.println("count of specialchar is="+ specialchar);
	}

}
