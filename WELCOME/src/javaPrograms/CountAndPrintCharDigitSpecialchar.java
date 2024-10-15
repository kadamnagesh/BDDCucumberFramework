package javaPrograms;

public class CountAndPrintCharDigitSpecialchar {

	public static void main(String[] args) {
	
		// input a1b%$av1 -> alphabates-4 , digit/number->2 specialchar ->2

		String input = "a1b%$av2";
		int alphabates = 0;
		String allAlphabates = "";

		int digit = 0;
		String allDigits = "";

		int specialchar = 0;
		String allspecialchar = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (Character.isAlphabetic(c)) {
				alphabates = alphabates + 1;
				allAlphabates = allAlphabates + c;
			} else if (Character.isDigit(c)) {
				digit = digit + 1;
				allDigits = allDigits + c;
			} else {
				specialchar = specialchar + 1;
				allspecialchar = allspecialchar + c;

			}
		}

		System.out.println("count of alphabates : " + alphabates + ", list : " + allAlphabates);
		System.out.println("count of digits : " + digit + ", list : " + allDigits);
		System.out.println("count of specialchar : " + specialchar + ", list : " + allspecialchar);
	
	}
}
