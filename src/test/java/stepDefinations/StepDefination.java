package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gherkin.formatter.model.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.ByteString.Output;
import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
import pageObject.AddNewCustomer;
import pageObject.AdminPage;
import utilities.ReadConfigu;

public class StepDefination extends BaseClass {

	@Before
	public void setUp() throws Exception {

		readConfigu = new ReadConfigu(); // Create object of ReadConfigu java class
		System.out.println("setUp method executed");

		String browser = readConfigu.getBrowser();

		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			Thread.sleep(2000);
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
			Thread.sleep(2000);
		}

	}

	@Given("User Lanch Chrome Browser")
	public void user_lanch_chrome_browser() {

		// Write executable code

		// driver = new ChromeDriver();
		admin = new AdminPage(driver);// To create object of Admin class

	}

	@When("User open url {string}")
	public void user_open_url(String Url) throws Exception {
		driver.get(Url);
		Thread.sleep(2000);
	}

	@When("User enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) throws Exception {
		admin.SetUSername(email);
		Thread.sleep(2000);
		admin.SetPassword(password);
		Thread.sleep(2000);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() throws Exception {
		admin.ClickOnLogIn();
		Thread.sleep(2000);
	}

	@Then("USer Verify page title is {string}")
	public void u_ser_verify_page_title_is(String title) throws Exception {
		Assert.assertEquals(title, driver.getTitle());
		Thread.sleep(2000);

	}

	//@After
	//public void teardown(Scenario sc) throws Exception {

		//System.out.println("Teardown method is executed");
		
				
		//if (sc.isFailed()==true) {
		//String filewithpath = "C:\\Users\\user\\Desktop\\IT Training\\Selenium training\\Cucumber_Maven\\Screenshot\\failedsc.png";
		
		
		//Convert WebDriver object into screenshot
		

		//TakesScreenshot scrshot = ((TakesScreenshot)driver);
		//Call screenshots to store as image file
		//File scrFile=scrshot.getScreenshotAs(OutputType.FILE);
		//File destFile = new File (filewithpath);
		//}
		
		//}
	
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() throws Exception {
		
		NewCustomer = new AddNewCustomer (driver);// To create object of AddNewCustomer class
		Assert.assertEquals("Dashboard / nopCommerce administration", NewCustomer.getPageTitle());
		Thread.sleep(2000);
		
	}

	@When("User click on customer menu")
	public void user_click_on_customer_menu() throws Exception {
		
		NewCustomer.selectCustomermain();
		Thread.sleep(2000);
	}

	@When("User click on customer menu item")
	public void user_click_on_customer_menu_item() throws Exception {
	    
		NewCustomer.selectCustomer();
		Thread.sleep(2000);
	}

	@When("User click on new add button")
	public void user_click_on_new_add_button() throws Exception {
		
		NewCustomer.clickAddNewButton();
		Thread.sleep(2000);
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() throws Exception {
	
		Assert.assertEquals("Add a new customer / nopCommerce administration", NewCustomer.getPageTitle());
		Thread.sleep(2000);
		
	}

	@When("User enter customer info as {string} and {string} and {string} and {string} and {string} and {string} and {string}")
	public void user_enter_customer_info_as_(String newemail, String newpass, String fname, String lname, String gender,String comname, String admincomment ) throws Exception {
		
		NewCustomer.enterEmail(newemail);
		Thread.sleep(2000);
		NewCustomer.enterpassword(newpass);
		Thread.sleep(2000);
		NewCustomer.enterFirstName(fname);
		Thread.sleep(2000);
		NewCustomer.enterLastName(lname);
		Thread.sleep(2000);
		NewCustomer.selectGender(lname);
		Thread.sleep(2000);
		NewCustomer.selectCompany(comname);
		Thread.sleep(2000);
		NewCustomer.addComment(admincomment);	
		Thread.sleep(2000);
	}

	@When("User click on save button")
	public void user_click_on_save_button() throws Exception {
	
		NewCustomer.savedata();
		Thread.sleep(2000);
	
	}

	@Then("User can see confirmation message {string}")
	public void user_can_see_confirmation_message(String string) throws Exception {
		
	NewCustomer.successmessage();
	Thread.sleep(2000);
	
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();

	}

}
