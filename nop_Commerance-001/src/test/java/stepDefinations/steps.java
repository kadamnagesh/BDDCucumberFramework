
package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AddUserPage;
import pageObject.Loginpage;

public class steps extends BaseClass {
 
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    lp=new Loginpage(driver);
	}
	@When("User open URL {string}")
	public void user_open_url(String URL) {
	   driver.get(URL);
	}
	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	   lp.email(email);
	   lp.password(password);
	}
	@When("Click on login")
	public void click_on_login() {
	    lp.click();
	}
	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
	    if(driver.getPageSource().contains("Login was unsuccessful.")) {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }
	    else {
	    	Assert.assertEquals(title, driver.getTitle());
	    }
	}
	@When("User click on logout link")
	public void user_click_on_logout_link() {
	   lp.logout();
	}
	@Then("close browser")
	public void close_browser() {
	    
	}
	// new customer added page ....................
	
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
	    addcust=new AddUserPage(driver);
	    Assert.assertEquals("Dashboard / nopCommerce administration", addcust.getPageTitle());
	}
	@When("User click on customers menu")
	public void user_click_on_customers_menu() {
	    addcust.ClickOnCustomerMenu();
	}
	@When("Click on customer menu item")
	public void click_on_customer_menu_item() {
	  addcust.ClickOnCustomerMenuItem();
	}
	@When("click on add new button")
	public void click_on_add_new_button() {
	    addcust.ClickOnAddButton();
	}
	@Then("User can view add new customer page")
	public void user_can_view_add_new_customer_page() {
	   Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.getPageTitle());
	}
	@When("User enter customer info")
	public void user_enter_customer_info() throws InterruptedException
	{
		String email=randomString()+"@gmail.com";
		addcust.setEmail(email);
		addcust.setPassword("test123");
		Thread.sleep(2000);
		// Registered customer default
		// Customer cannot be in both 'Register' and 'Guest' customer role
		// Add the customer to 'Guest' or 'Register' customer role 
		
		addcust.setCustomerRoles("Guests");
		Thread.sleep(2000);
		
		addcust.setMangerOfVendor("Vendor 2");
		
	    addcust.setGender("Male");
	    addcust.setFirstName("pavan");
	    addcust.setLastName("kumar");
	    addcust.setDob("7/05/1985");
	    addcust.setCompanyName("bysyQA");
	    addcust.setAdminContent("this is for testing........");
	}
	 @Then("User can view confirmation message {string}")
	    public void user_can_view_confirmation_message_something(String strArg1) throws Throwable {
	       Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully."));
	    }

	    @When("^Click on save button$")
	    public void click_on_save_button() throws Throwable {
	      addcust.clickOnSave();
	      Thread.sleep(2000);
	    }

}
