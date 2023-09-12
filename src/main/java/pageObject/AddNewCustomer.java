package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomer {

	
	public WebDriver ldriver ;
	public AddNewCustomer (WebDriver rdriver) {
	ldriver = rdriver;
	PageFactory.initElements(rdriver,this);
	}
	
	
	//@FindBy (xpath = "//a[@href='#']/p[contains(text(),'Customers')]")
	//WebElement CustomersMainTab;
	
	By CustomersMainTab = By.xpath("//a[@href='#']/p[contains(text(),'Customers')]");
	
	By CustomerTab = By.xpath("//p[(text()=' Customers')]");
	
	By Addnewbutton = By.xpath("//a[(@class='btn btn-primary')]");
	
	By enteremail = By.xpath("//input[@id='Email']"); 
	
	By enterpassword = By.xpath("//input[@id='Password']"); 
	
	By firstname = By.xpath("//input[@id='FirstName']");
	
	By lastname = By.xpath("//input[@id='LastName']");
	
	By genderMale = By.xpath("//input[@id='Gender_Male']");
	
	By genderFemale = By.xpath("//input[@id='Gender_Female']");

	By Company = By.xpath("//input[@id='Company']");
	
	By AdminComment = By.xpath("//textarea[@id='AdminComment']");
	
	By savebutton = By.xpath("//button[@name='save']");

	public String getPageTitle () {
		return ldriver.getTitle();
	}
	
	
	public void selectCustomermain () {
	
		ldriver.findElement(CustomersMainTab).click();
	}

	public void selectCustomer() {
		ldriver.findElement(CustomerTab).click();
		}
	
	public void clickAddNewButton () {
		ldriver.findElement(Addnewbutton).click();
	}
	
	public void enterEmail(String newemail) throws Exception {
		ldriver.findElement(enteremail).sendKeys(newemail);
		Thread.sleep(2000);
	}
	
	public void enterpassword (String newpass) throws Exception {
		ldriver.findElement(enterpassword).sendKeys(newpass);
		Thread.sleep(2000);
	}

	public void enterFirstName(String fname) throws Exception {
		ldriver.findElement(firstname).sendKeys(fname);
		Thread.sleep(2000);
	}
	
	public void enterLastName(String lname) throws Exception {
		ldriver.findElement(lastname).sendKeys(lname);
		Thread.sleep(2000);
	}
	
	public void selectGender (String gender) {
		if (gender.equals("male")) {
			ldriver.findElement(genderMale).click();
		}else ldriver.findElement(genderFemale).click();
	}

	public void selectCompany (String comname) {
		ldriver.findElement(Company).sendKeys(comname);
	}
	
	public void addComment (String admincomment) {
		ldriver.findElement(AdminComment).sendKeys(admincomment);
		
	}

	public void savedata () {
		ldriver.findElement(savebutton).click();
	}

	
}
