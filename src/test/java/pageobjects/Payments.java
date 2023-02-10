package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payments {
	
	WebDriver ldriver;
	
	public Payments(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver , this);
		
	}
	
	@FindBy(xpath = "//tbody/tr[3]/td[1]/strong[1]/span[1]")
	WebElement totalprice;
	
	@FindBy(xpath = "//span[contains(text(),'Place Order')]")
	WebElement placeorder;
	
	@FindBy(name = "billing-address-same-as-shipping")
	WebElement checkbox;
	
	@FindBy(xpath = "//span[contains(text(),'Thank you for your purchase!')]")
	WebElement thanktext;
	
	public String Totalprice() {
		String price = totalprice.getText();
		return price;
	}
	
	public void Placeorder() {
		placeorder.click();
	}
	
	public void AddCheckbox() {
		checkbox.click();
	}
	
	public String Thankyou() {
		String text = thanktext.getText();
		return text;
		
	}

	
}
