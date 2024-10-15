package Selenium_Day9_WindowHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://selenium/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("www.google.com");

		driver.findElement(By.xpath("//a[text()='windows'")).click();

		String mainWindow = driver.getWindowHandle();

		Set<String> allWindow = driver.getWindowHandles();
		
		List<String> list = new ArrayList<>();
		
		driver.switchTo().window(list.get(2));

		for (String addressWin : allWindow) {
			
			if (!addressWin.equals(mainWindow)) {
				
				driver.switchTo().window(addressWin);
				
			}
		}
	}
}