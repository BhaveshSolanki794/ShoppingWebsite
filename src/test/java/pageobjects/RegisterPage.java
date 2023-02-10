package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver ldriver;

	public RegisterPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver , this);
		
	}
	
	@FindBy(linkText = "Create an Account")
	WebElement signup;
	
	@FindBy(id = "firstname")
	WebElement fname;
	
	@FindBy(id = "lastname")
	WebElement lname;
	
	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "password")
	WebElement pwd;
	
	@FindBy(name = "password_confirmation")
	WebElement pwdcnf;
	
	@FindBy(xpath = "//button[@class='action submit primary']")
	WebElement button;
	
	public void SignupLink() {
		signup.click();
	}
	
	public void Firstname(String name) {
		fname.sendKeys(name);
	}
	
	public void Lastname(String name) {
		lname.sendKeys(name);
	}
	
	public void Email(String mail) {
		email.sendKeys(mail);
	}
	
	public void Password(String pass) {
		pwd.sendKeys(pass);
	}
	
	public void Confirmpass(String cnfpass) {
		pwdcnf.sendKeys(cnfpass);
	}
	
	public void SignupButton() {
		button.click();
	}
	
	

}
