package Jawa_Day17_Inheritance;

public class CountOfCharInString {

	public static void main(String[] args) {
		
		String input = "testers";
		String uniqueString = "";

		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);
			String x = Character.toString(c);

			if ((uniqueString.contains(x)) == false) 
			{
				uniqueString = uniqueString + x; // tesr
			}
		}
		
		// uniqueString = tesr     input=testers
		System.out.println(uniqueString);

		System.out.println("----------------------------");

		for (int p = 0; p < uniqueString.length(); p++) {

			char n = uniqueString.charAt(p);
			String s = Character.toString(n);   //t
			int counter = 0;

			for (int q = 0; q < input.length(); q++) {

				char m = input.charAt(q);   
				String t = Character.toString(m);   //t,e

				if (s.equals(t)) {
					counter++;
				}
			}

			System.out.println("count of " + s + " is : " + counter);

		}

}

}