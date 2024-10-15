package Selenium_Day12_JsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorDemo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;         //narrowing
		js.executeScript("window.scrollBy(0,1000)", "") ;           // scroll by vertically down
		Thread.sleep(2000);                              
		js.executeScript("window.scrollBy(0,-1000)", "") ;          // scroll by vertically up
        Thread.sleep(2000);
        
      //   js.executeScript("window.scrollBy(1000,0)", "");          //  scroll by horizantally right
        
     //    js.executeScript("window.scrollBy(-1000,0)", "");        //  scroll by horizontally left
        WebElement submitbutton=driver.findElement(By.xpath("//input[@type='submit']"));
        js.executeScript("arguments[0].scrollIntoView(true)", submitbutton);
        
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-1500)", "");
        
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");  // scroll to bottom[footer] of webpage
        
        // below is to set a value
        WebElement email=driver.findElement(By.xpath("//input[@id='mce-EMAIL']"));
        js.executeScript("arguments[0].value='hibuddy1@gmail.com'", email);
        
        // below is click on the submit button
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()", submitbutton);
         
        }

}
