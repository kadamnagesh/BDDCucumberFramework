package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage 
    {
    public  WebDriver ldriver;
	 
	public AddUserPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}
	By lnkCustomers_menu=By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a");
	By lnkCustomers_menuitem=By.xpath("//a[@href='/Admin/Customer/List']");
	By addbutn=By.xpath("//a[@class='btn btn-primary']");
	By txtemail=By.xpath("//input[@id='Email']");
	By txtpassword=By.xpath("//input[@id='Password']");
	By txtCustomerRoles=By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]");
	
	By lstitemAddministrator = By.xpath("//li[contains(text(),'Administrators')]");
	By lstitemRegistered = By.xpath("//li[contains(text(),'Registered')]");
	By lstitemGuests = By.xpath("//li[text()='Guests']");
	By lstitemVendors = By.xpath("//li[contains(text(),'Vendors')]");
	
	By drpmgrOfVendors=By.xpath("//*[@id='VendorId']");
	By rdmalegender=By.id("Gender_Male");
	By rdfemaleGender=By.id("Gender_Female");
	
	By txtFirstName=By.xpath("//input[@id='FirstName']");
	By txtLastName=By.xpath("//input[@id='LastName']");
	
	By txtDob=By.xpath("//input[@id='DateOfBirth']");
	By txtcompanyname = By.xpath("//input[@id='Company']");
	By txtAdminContent=By.xpath("//textarea[@id='AdminComment']");
	By btnsave=By.xpath("//button[@name='save']");
	
	// action method 
	public String getPageTitle() 
	{
		return ldriver.getTitle();
	}
	public void ClickOnCustomerMenu() 
	{
		ldriver.findElement(lnkCustomers_menu).click();
	}
	public void ClickOnCustomerMenuItem() 
	{
		ldriver.findElement(lnkCustomers_menuitem).click();
	}
	public void ClickOnAddButton() 
	{
		ldriver.findElement(addbutn).click();
	}
	public void setEmail(String email) 
	{
		ldriver.findElement(txtemail).sendKeys(email);
	}
	public void setPassword(String password)
	{
		ldriver.findElement(txtpassword).sendKeys(password);
	}
	public void setCustomerRoles(String role) throws InterruptedException 
	{
		if(!role.equals("Vendors")) {
			Thread.sleep(2000);
			ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[2]")).click();
		}
		ldriver.findElement(txtCustomerRoles).click();
		WebElement listitem;
		
		Thread.sleep(3000);
		if(role.equals("Administrators"))
		{
			listitem=ldriver.findElement(lstitemAddministrator);
		}
		else if(role.equals("Guests")) {
			listitem=	ldriver.findElement(lstitemGuests);
		}
		else if(role.equals("Registered")) {
			listitem=ldriver.findElement(lstitemRegistered);
		}
		else if(role.equals("Vendors")) {
			listitem=ldriver.findElement(lstitemVendors);
		}
		else {
			listitem=ldriver.findElement(lstitemGuests);
		}
		listitem.click();
		
		JavascriptExecutor js=(JavascriptExecutor)ldriver;
		js.executeScript("arguments[0].click();", listitem);
	}
	public void setMangerOfVendor(String value)
	{
		Select drp=new Select(ldriver.findElement(drpmgrOfVendors));
		drp.selectByVisibleText(value);
	
	}
	public void setGender(String gender) 
	{
	if(gender.equals("Male"))
	{
		ldriver.findElement(rdmalegender).click();
	}
	else if(gender.equals("Female")) {
		ldriver.findElement(rdfemaleGender).click();
	}
	else {
		ldriver.findElement(rdmalegender).click(); // Default
	}
	}
	public void setFirstName(String fname) {
		ldriver.findElement(txtFirstName).sendKeys(fname);
	}
	public void setLastName(String lname) {
	ldriver.findElement(txtLastName).sendKeys(lname);
	}
	public void setDob(String dob) {
		ldriver.findElement(txtDob).sendKeys(dob);
	}
	public void setCompanyName(String coname)
	{
		ldriver.findElement(txtcompanyname).sendKeys(coname);
	}
	public void setAdminContent(String content)
	{
		ldriver.findElement(txtAdminContent).sendKeys(content);
	}
	public void clickOnSave() 
	{
	ldriver.findElement(btnsave).click();	
	}
}
