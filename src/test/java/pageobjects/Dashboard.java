package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	WebDriver ldriver;
	
	public Dashboard(WebDriver rdriver) {
		
		ldriver = rdriver;
		
		PageFactory.initElements(rdriver , this);
		
	}
	
	@FindBy(id = "search")
	WebElement searchbar;
	
	@FindBy(xpath = "//img[@class='product-image-photo']")
	WebElement productimg;
	
	@FindBy(xpath = "//div[@id='option-label-size-143-item-169']")
	WebElement size;
	
	@FindBy(xpath = "//div[@id='option-label-color-93-item-58']")
	WebElement colour;
	
	@FindBy(xpath = "//button[@title='Add to Cart']")
	WebElement cart;
	
	@FindBy(xpath = "//span[contains(text(),'Chloe Compete Tank')]")
	WebElement product;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/div[1]/strong[1]/a[1]")
	WebElement cartproduct;
	
	@FindBy(xpath = "//a[contains(text(),'shopping cart')]")
	WebElement cartlink;
	
	@FindBy(xpath = "//tbody/tr[3]/td[1]/strong[1]/span[1]")
	WebElement price;
	
	@FindBy(xpath = "//span[contains(text(),'Proceed to Checkout')]")
	WebElement checkout;
	
	public void Searchbar(String product) {
		searchbar.sendKeys(product);
		searchbar.sendKeys(Keys.ENTER);
	}
	
	public void Productimg() {
		productimg.click();
	}
	
	public void Productsize() {
		size.click();
	}
	
	public void Productcolor() {
		colour.click();
	}
	
	public void AddToCart() {
		cart.click();
	}
	
	public void Cartsymbol() {
		cartlink.click();
	}
	
	public void Checkout() {
		checkout.click();
	}

	
	public String Productprice() {
		String cartprice = price.getText();
		return cartprice;
	
	}
	
	public String CartProduct() {
		String aftercart = cartproduct.getText();
		return aftercart;
	}
	
	
}
