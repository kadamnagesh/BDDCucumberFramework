package Selenium_Day26_PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectStatePage {
	
	public static Select se;
	
	public static void SelectDropdown(WebElement wb,String text)
	{
		se=new Select(wb);
		se.selectByVisibleText(text);
	}
}
