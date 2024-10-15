package selenium_Day6_SelectAndAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultiDropDowns {

	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
   driver.findElement(By.xpath("//input[contains(@name,'name')and@maxlength='61']")).sendKeys("ignisyst test");
 
 // use select class to handle dropdown
   
  Select se = new Select(driver.findElement(By.xpath("//select[@id='country']")));
   
   // there are three method to select dropdwon
 // se.selectByIndex(3);
 //   se.selectByValue("11");
 //  se.selectByVisibleText("India");
  // if we want to check dropdown is mupltiple or not then we can use isMultiple(); 
   System.out.println(se.isMultiple());
   
   // if dropdown is multiple then we have another 3 method
   se.deselectAll();  // this will be deselect all dropdown
   se.deselectByIndex(0);  // this will be deselect by given index dropdown
   se.deselectByValue(null); // this will be deselect by give value dropdown
   se.selectByVisibleText(null); // this will be deselect by given visible text dropdown
   
	}
	

}
