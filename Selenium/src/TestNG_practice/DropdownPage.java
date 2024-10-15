package TestNG_practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;


public class DropdownPage {
	public static Select se;
	public static void SelectDropdown(WebElement wb, String text)
	{
		se=new Select(wb);
		se.selectByVisibleText(text);
	}
 
	
}
