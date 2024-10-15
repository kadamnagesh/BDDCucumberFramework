package Selenium_Day5_WebElementCommondDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandPractice {

	public static void main(String[] args) throws InterruptedException {
		
          System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("file:///C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		Thread.sleep(2000);

		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("kiran@gmail.com");     // to enter the Text in textBox
		Thread.sleep(2000);
		email.clear();						   // to clear the Text in textBox
		
		email.sendKeys("kiran@gmail.com");     // to enter the Text in textBox
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		driver.findElement(By.xpath("//a[@href='users.html']")).click();
		driver.findElement(By.xpath("//button[text()='Add User']")).click();
		
		String attributeValue=driver.findElement(By.xpath("//input[@id='username']")).getAttribute("placeholder");
		System.out.println("attributeValue is : "+ attributeValue);
		
		String userNameTag=driver.findElement(By.xpath("//input[@id='username']")).getTagName();
		System.out.println("Tag Name is : "+userNameTag);
		
		
		Thread.sleep(2000);
		String UiText=driver.findElement(By.xpath("//span[text()='Cancel']")).getText();
		System.out.println("UI text is : "+UiText);
		
	}

}
