package Selenium_Day18_TestNG_RetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer {
    int retrylimit=3;
    int counter=0;
	
	@Override
	public boolean retry(ITestResult arg0) {
		if (retrylimit > counter) 
	{
			counter++;
			return true;
	}
		return false;
	}



}
