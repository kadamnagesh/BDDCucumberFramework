package Java_Day15_String2;

public class StringReverseUsingtocharindexmethod {

	public static void main(String[] args) {
		
		String input =" my name ";
		String output="";
		
		// char arr []=(input.trim()).toCharArray();
		char arr [] = (input.trim().toCharArray());		
		
		for (int i=(arr.length-1); i>=0; i--)
		{
			output=output+arr[i];
		}
         System.out.println(output);
	}

}
