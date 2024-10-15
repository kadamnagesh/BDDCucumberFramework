package Selenium_Day1_Intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PracticeClass { 
	
	public static void main(String[] args) {
	
	String input []={"mon","tue","wed","thr","fri","sat","sun"};
	String output="";
	//int counter=0;
	
	for(int i=0; i<input.length; i++) {
		
		output=input[i];
		int counter=0;
	for(int j=1; j<=30; j++) {
		
		if(output.equals("tue")) 
		{
			counter++;
		}
	}
	System.out.println(counter);
	}
  //	System.out.println(counter);
	}
}
