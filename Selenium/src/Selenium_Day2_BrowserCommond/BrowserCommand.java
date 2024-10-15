package Selenium_Day2_BrowserCommond;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommand {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();  // it will open url
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		
		
	   // WebDriver driver=new WebDriver()  -> not possible as WebDriver is interface
		// ChromeDriver driver=new ChromeDriver(); -> possible as chromedriver having all implemented methods

		driver.get("https://www.google.com");   // this will open url
		String pageTitle=driver.getTitle();     // this will fetch page title
		System.out.println("page title is :"+pageTitle);
		
		System.out.println(driver.getCurrentUrl());  // this will fetch current URL of your webpage
		
		//System.out.println(driver.getPageSource());   // this will give the page source
		
		driver.manage().window().maximize(); // will maximize the browser window
		Thread.sleep(3000);
		//driver.manage().window().fullscreen();
		
		driver.get("https://www.yahoo.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.javatpoint.com");
		Thread.sleep(2000);

		driver.close(); // closes current/active window
		//driver.quit() ; // closes all browser windows
		
	}

 }
