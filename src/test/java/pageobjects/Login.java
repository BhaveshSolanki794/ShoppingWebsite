package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver ldriver;
	
	public Login(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver , this);
		
	}
	
	@FindBy(xpath = "//header/div[1]/div[1]/ul[1]/li[2]/a[1]")
	WebElement signinlink;
	
	@FindBy(name = "login[username]")
	WebElement username;
	
	@FindBy(name = "login[password]")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='action login primary']")
	WebElement signin;
	
	public void Username(String name) {
		username.sendKeys(name);
	}
	
	public void Password(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void Signin() {
		signin.click();
	}
	
	public void SigninLink() {
		signinlink.click();
	}
	
	

}
