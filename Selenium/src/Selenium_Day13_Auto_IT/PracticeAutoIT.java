package Selenium_Day13_Auto_IT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		driver.findElement(By.xpath("//span[@class='btn btn-success fileinput-button']")).click();
		
		
		Thread.sleep(2000);
	   
		Runtime.getRuntime().exec("C:\\Selenium\\AutoItUpload\\Genericsdemo.exe");
	}
}
