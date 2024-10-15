package RestAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

	public static String getFirstName() {
		String genratedString=RandomStringUtils.randomAlphabetic(1);
		return("john"+genratedString);
	}

	public static String getLastName() {
		String genratedString=RandomStringUtils.randomAlphabetic(6);
		return("kenedy"+genratedString);
	}

	public static String getUserName() {
		String genratedString=RandomStringUtils.randomAlphabetic(3);
		return("john"+genratedString);
	}

	public static String getPassword() {
		String genratedString=RandomStringUtils.randomAlphabetic(3);
		return("john"+genratedString);
	}

	public static String getEmail() {
		String genratedString=RandomStringUtils.randomAlphabetic(5);
		return(genratedString+"gmail.com");
	}
	public static String empName() {
		String genratedString=RandomStringUtils.randomAlphabetic(5);
		return(genratedString+"gmail.com");
	}
	public static String empSal() {
		String genratedString=RandomStringUtils.randomAlphabetic(5);
		return(genratedString+"gmail.com");
	}
	public static String empAge() {
		String genratedString=RandomStringUtils.randomAlphabetic(5);
		return(genratedString+"gmail.com");
	}
}
