package Java_Day26_FinallyThrowws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

	public static void main(String[] args) {
      try
      {
		  readfile();
	  } 
      catch (FileNotFoundException e) 
      {
	       e.printStackTrace();
	  }

	}
	public static void readfile() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("location of file");
	}

}
