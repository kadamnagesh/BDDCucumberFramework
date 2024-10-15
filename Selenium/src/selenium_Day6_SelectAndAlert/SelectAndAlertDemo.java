
package selenium_Day6_SelectAndAlert;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndAlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // it will open the driver

		driver.manage().window().maximize();
		driver.get("file://C:/Selenium/OfflineWebsiteForSelenium-/OfflineWebsiteForSelenium/OfflineWebsite/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@href='users.html']")).click();
		driver.findElement(By.xpath("//button[text()='Add User']")).click();
		driver.findElement(By.id("username")).sendKeys("ignisyst");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("12345234");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ignisyst@gmail.com");
		driver.findElement(By.xpath("//input[@id='Male']")).click();

        //Select se=new Select(SelectDropdown webelement) 

		Select se = new Select(driver.findElement(By.tagName("select")));
		// se.selectByIndex(3);
		// se.selectByVisibleText("HP");
		   se.selectByValue("Punjab");
		System.out.println(se.isMultiple()); // to check is the dropdown is type of multiSelect
    
		// De-Select can be only used when the dropdown is type of MultiSelect

		/*
		 * se.deselectByIndex(0); se.deselectByValue(null);
		 * se.deselectByVisibleText(null); se.deselectAll();
		 */

		List<WebElement> li = se.getAllSelectedOptions();
		System.out.println(li.get(0).getText());

		// se.getFirstSelectedOption();
		// se.getOptions();

		// ============================================

		driver.findElement(By.id("password")).sendKeys("112211");

		driver.findElement(By.id("submit")).submit();

		Thread.sleep(3000);
		// driver.switchTo().alert();
		Alert al = driver.switchTo().alert();
        
		// al.accept();
		// al.dismiss();
		// al.sendKeys("1234");

		System.out.println(al.getText());
		al.accept();
	 }
   }
