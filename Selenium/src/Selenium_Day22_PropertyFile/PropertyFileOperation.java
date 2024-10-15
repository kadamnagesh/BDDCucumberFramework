

package Selenium_Day22_PropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileOperation {
	public static Properties prop;
	public static String readpropertyfile(String key)
	{
		File file=new File("C:\\core java\\Selenium\\config.properties");
		
	    prop=new Properties();	
	    
	     try 
	     {
	    	FileInputStream fis=new FileInputStream(file);
	    	prop.load(fis);
	     }
	     
	    catch(IOException e)
	    {
	    	e.printStackTrace();
	    }
	    
	    String value=prop.getProperty(key);
	    return value;
	}
	
	public static void writeproperty(String key, String value)
	
	{
		File file=new File("C:\\core java\\Selenium\\config.properties");
		FileOutputStream fos=null;
		
		try
		    {
			fos=new FileOutputStream(file);
			
			// set properties
			prop.put(key, value);
			
			// store properties to the opened file
			prop.store(fos, "FileUpdated");
		    } 
		catch (IOException io) 
		{
		io.printStackTrace();
		} finally 
		{
		try
		{
			if (fos != null) {
				fos.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
		
	}
	
  }
