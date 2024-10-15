package Java_Day15_String2;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		// input- my name is ram output= ym eman si mar

		String input="my name is ram";
		String  output="";
		
		String arr[]=input.split(" ");
		
		for (String s:arr) 
		{
		String reversed=reverse(s);
		output=output+reversed+" ";
		}
		System.out.println(output);
	}
	
	public static String reverse(String word)
	{
		String reword="";
		
		for (int i=(word.length()-1); i>=0; i--) 
		{
		char x=word.charAt(i);	
		reword=reword+x;
		}
		return reword;
	}
}
