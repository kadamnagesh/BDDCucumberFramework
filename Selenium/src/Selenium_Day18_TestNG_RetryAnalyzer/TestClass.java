package Selenium_Day18_TestNG_RetryAnalyzer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestClass {
	
	static WebDriver driver;
    @Test(retryAnalyzer = Selenium_Day18_TestNG_RetryAnalyzer.RetryAnalyzerImplementation.class)
	public void HomePageRedirecting() {
		System.out.println("i am in test case success");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("kiran@gmail.com"); // to enter the Text in textBox
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		driver.quit();

	}

	@Test(retryAnalyzer = Selenium_Day18_TestNG_RetryAnalyzer.RetryAnalyzerImplementation.class)
	public void login() {
		System.out.println("i am in test case fail ");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("kiran@gmail.com"); // to enter the Text in textBox
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		Assert.assertEquals(driver.getCurrentUrl(),
				"file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/pages/examples.html");
	}

}
	
