package Selenium_Day7_FindelementsVsFindelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SdetFindElementVsFindElements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); // it will open ur browser
       driver.get("https:\\demo.nopcommerce.com");
       
    //    findElement() -> return the single Element
       
       //  1  -> in that scenario we locate a single webelement
    
      
    /*   WebElement links=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
       links.sendKeys("xyz");  */
       
       //  2  --> in that scenario we locate multiple webelement by 
       
     //  WebElement wele=driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
   //    System.out.println(wele.getText());   
     // this is give u single value instead of multiple--> By findElement   
     
       // 3 -->  when element are not present on the webpage
       
    //   WebElement searchbutton=driver.findElement(By.xpath("button[@type='login']"));
      
       // this will give you a exeption no such element
       
       //findWebElements()----> return multiple web element 
       
   // 1 
       
     /* List <WebElement>list=driver.findElements(By.xpath("/html/body/div[6]/div[4]/div[1]//a"));
       System.out.println("number of element captured="+ list.size());   
       
       for(WebElement ele:list)
       {
    	   System.out.println(ele.getAttribute("href"));  // it will give a all link
       }      */
       
   // 2
       
   /* List<WebElement> logo=driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
      System.out.println(logo.size());         */
       
       
    // 3
    //   List<WebElement> element=driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
       
  //     System.out.println(element.size());
       // it give a zero  
       
	}

}
