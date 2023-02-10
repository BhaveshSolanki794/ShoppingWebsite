package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutDetails {
	
	WebDriver ldriver;
	
	public CheckoutDetails(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "MJG3SKK")
	WebElement firstname;
	
	@FindBy(id = "PLEFT4Q")
	WebElement lastname;
	
	@FindBy(name = "street[0]")
	WebElement address;
	
	@FindBy(name = "city")
	WebElement city;
	
	@FindBy(name = "region_id")
	WebElement state;
	
	@FindBy(name = "postcode")
	WebElement postalcode;
	
	@FindBy(name = "country_id")
	WebElement country;
	
	@FindBy(name = "telephone")
	WebElement phone;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/input[1]")
	WebElement checkbox;
	
	@FindBy(xpath = "//button[@class='button action continue primary']")
	WebElement nextbutton;
	
	public void Firstname(String name) {
		firstname.sendKeys(name);
	}
	
	public void Lastname(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void Address(String add) {
		address.sendKeys(add);
	}
	
	public void City(String cityname) {
		city.sendKeys(cityname);
	}
	
	public void State(String statename) {
		Select select = new Select(state);
		select.selectByVisibleText(statename);
	}
	
	public void postalcode(String code) {
		postalcode.sendKeys(code);
	}
	
	public void Country(String countryname) {
		Select select = new Select(country);
		select.selectByVisibleText(countryname);
	}
	
	public void Phone(String number) {
		phone.sendKeys(number);
	}
	
	public void Checkbox() {
		checkbox.click();
	}
	
	public void Nextbutton() {
		nextbutton.click();
	}
	
	
	
	
	
	

}
