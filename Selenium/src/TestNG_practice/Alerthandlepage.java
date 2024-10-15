package TestNG_practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Alerthandlepage extends BaseClass {
	
	public void alert() 
	{
	driver.switchTo().alert().accept();	
	}
	
}
