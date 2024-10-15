package Selenium_Day12_JsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

  public class PracticeJsExe {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.seleniumeasy.com/");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	//1. scrolling by using by pixle
	
	     js.executeScript("window.scrollBy(0,1000)", "");   //scroll vertically down
	
	//2. scrolling page till we find element
	     
	     WebElement element=driver.findElement(By.xpath("//a[text()='Log4j Tutorials']"));
	     js.executeScript("arguments[0].scrollIntoView()", element);
	     
	//3. scroll page till bottom
	     
	     
	     js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	     
	      }
	
    }
