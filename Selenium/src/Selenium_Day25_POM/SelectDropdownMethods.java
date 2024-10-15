package Selenium_Day25_POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownMethods extends BaseClass {
	
	
	public static Select se;
	
	public static void SelectByVisible(WebElement wb,String text) 
	{
		se=new Select(wb);
		se.selectByVisibleText(text);
	}
	
	
}
