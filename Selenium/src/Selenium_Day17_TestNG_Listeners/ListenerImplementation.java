package Selenium_Day17_TestNG_Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends BaseClass implements ITestListener{

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("i am on finish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("i am on start");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("i am on test failure");
		
		String methodname=arg0.getMethod().getMethodName();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Selenium\\screenshot\\"+methodname+".jpeg");
		
		try {
			FileUtils.copyFile(source, dest);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("i am test start");
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("i am on test success");
		
	}

}
