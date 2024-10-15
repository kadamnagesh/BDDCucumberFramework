
package Selenium_Day11_Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
		
  //  StringSelection stringSelection = new StringSelection("C:\\Users\\Dhiraj\\Desktop\\InterviewFAQ.txt");
  //  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		rb.mouseWheel(200);
	}

}
