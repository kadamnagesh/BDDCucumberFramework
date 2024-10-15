package Selenium_Day13_Auto_IT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UploadUsingAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("https://blueimp.github.io/jQuery-File-Upload/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
		
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Selenium\\AutoItUpload\\autoitfile.exe");
		
	
	}

}
