package Selenium_Day5_WebElementCommondDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementCommonddemo {

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
		
		
		
		String UiText=driver.findElement(By.xpath("//span[text()='Cancel']")).getText();
		System.out.println("UI text is : "+UiText);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ignisyst");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("112233");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@gmail.com");

		System.out.println(driver.findElement(By.xpath("//input[@id='Male']")).isSelected());
		driver.findElement(By.xpath("//input[@id='Male']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='Male']")).isSelected());
		
		
		Thread.sleep(4000);
		driver.quit();
	}

}
