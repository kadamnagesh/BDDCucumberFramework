package Selenium_Day25_POM;

public class AlertPage extends BaseClass {

	public void alert() {
		
		driver.switchTo().alert().accept();
	}
}
