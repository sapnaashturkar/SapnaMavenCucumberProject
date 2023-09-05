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
import pageObject.AdminPage;
import utilities.ReadConfigu;

public class Admin_StepDefination extends BaseClass {

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

	@After
	public void teardown(Scenario sc) throws Exception {

		System.out.println("Teardown method is executed");
		
				
		//if (sc.isFailed()==true) {
		//String filewithpath = "C:\\Users\\user\\Desktop\\IT Training\\Selenium training\\Cucumber_Maven\\Screenshot\\failedsc.png";
		
		
		//Convert WebDriver object into screenshot
		

		//TakesScreenshot scrshot = ((TakesScreenshot)driver);
		//Call screenshots to store as image file
		//File scrFile=scrshot.getScreenshotAs(OutputType.FILE);
		//File destFile = new File (filewithpath);
		//}
		
		}


	@Then("close browser")
	public void close_browser() {
		driver.close();

	}

}
