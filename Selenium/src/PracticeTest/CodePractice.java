package PracticeTest;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodePractice {
	
	public static void main(String[] args) {

		   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://example.com"); // Example URL with multiple windows

	        // Get the main window handle (the first window)
	        String mainWindow = driver.getWindowHandle();

	        // Perform an action that opens a new window (e.g., clicking a link)
	        driver.findElement(By.id("openNewWindow")).click();

	        // Get all window handles (main and new window)
	        Set<String> li = driver.getWindowHandles();
	      List<String> handlers = new ArrayList<>(li);
	      driver.switchTo().window(handlers.get(1));
	        	       
//	      Iterator it = handlers.iterator();
//	      
//	      while(it.hasNext()) 
//	      {
//	    	  driver.switchTo().window(handlers.get(0));
//	      }
	      
	      Iterator it = handlers.iterator();
	      
	      while(it.hasNext())
	      {
	    	  driver.switchTo().window(handlers.get(0));
	      }

	        // Iterate through the window handles and switch to the new window  orr
	        for (String windowHandle : handlers) {
	            if (!windowHandle.equals(mainWindow)) {
	                driver.switchTo().window(windowHandle); // Switch to the new window
	                System.out.println("Switched to new window: " + driver.getTitle());
	                // Perform actions in the new window
	                driver.findElement(By.id("someElementInNewWindow")).click();
	                // Close the new window
	                driver.close();
	            }
	        }

	        // Switch back to the main window
	        driver.switchTo().window(mainWindow);
	        System.out.println("Switched back to main window: " + driver.getTitle());

	        // Close the browser
	        driver.quit();
	    }
	}
