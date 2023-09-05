package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class AdminPage {

	public WebDriver ldriver;
	

	public AdminPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
		
	}

	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement TxtEmail;

	@FindBy(xpath = "//input[@id='Password']")
	WebElement TxtPassword;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement Btnlogin;
	

//Create user defined method to perform operation on above mentioned element

	public void SetUSername(String Username) throws Exception {
		TxtEmail.clear();
		Thread.sleep(2000);
		TxtEmail.sendKeys(Username);

	}

	public void SetPassword(String Password) throws Exception {
		TxtPassword.clear();
		Thread.sleep(2000);
		TxtPassword.sendKeys(Password);
		
		
	}

	public void ClickOnLogIn() {
		Btnlogin.click();
	}
}
