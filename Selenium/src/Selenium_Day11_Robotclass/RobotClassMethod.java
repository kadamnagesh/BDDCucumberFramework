package Selenium_Day11_Robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class RobotClassMethod {

	public static void main(String[] args) throws AWTException {

       // it is used to handle the keybopard and mouse event
		
		   Robot rob=new Robot ();
		   
       // various method of keyboard
		
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		
     // various method of mouse
		
		rob.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		rob.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

}
