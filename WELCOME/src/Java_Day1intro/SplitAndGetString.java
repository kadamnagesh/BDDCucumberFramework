package Java_Day1intro;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitAndGetString {
	
	public static void main (String [] arg) {
		
	
    String inputString = "Correct On 1st Attempt (1)";

    // Define a regular expression pattern to match the text in parentheses
    Pattern pattern = Pattern.compile("\\((.*?)\\)");

    // Use a Matcher to find the pattern in the input string
    Matcher matcher = pattern.matcher(inputString);

    // Check if a match is found
    if (matcher.find()) {
        String extractedText = matcher.group(1); // Group 1 contains the text
        System.out.println(extractedText);
    }
	}
    	 }
    

















