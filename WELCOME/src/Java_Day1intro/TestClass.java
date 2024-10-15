package Java_Day1intro;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClass {
	
	public static void main(String[] args) {

	
		  Date currentDate = new Date();

	        // Define the desired date format
	        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");

	        // Format the current date using the specified format
	        String formattedDate = dateFormat.format(currentDate);

	        // Print the formatted date
	        System.out.println("Formatted Date: " + formattedDate);
	    }
}
