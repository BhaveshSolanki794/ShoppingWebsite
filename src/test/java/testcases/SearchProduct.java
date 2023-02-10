package testcases;

import org.apache.commons.logging.Log;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.CheckoutDetails;
import pageobjects.Dashboard;
import pageobjects.Login;
import pageobjects.Payments;

public class SearchProduct extends Baseclass {
	
	@Test(priority = 1)
	public void ValidUser() {

		Login login = new Login(driver);

		login.SigninLink();

		login.Username("Bhavesh02111121@gmail.com");

		login.Password("Bhavesh@21");

		login.Signin();

//		String expectedurl = "https://magento.softwaretestingboard.com/";
//
//		String currenturl = driver.getCurrentUrl();
//		
//		Assert.assertEquals(expectedurl, currenturl);

	}
	
	@Test(priority = 2)
	public void AddtoCart() throws InterruptedException {
		
		Dashboard db = new Dashboard(driver);
		
		db.Searchbar("tshirt for men");
		
		db.Productimg();
		
		Thread.sleep(5000);
		
		db.Productsize();
		
		db.Productcolor();
		
		db.AddToCart();
		
		Thread.sleep(9000);
		
		db.Cartsymbol();
		
	}
	
	@Test(priority = 3)
	public void ValidateProduct() throws InterruptedException {
		
		Dashboard db = new Dashboard(driver);
		
		Thread.sleep(9000);
		
		String productBefore = "Chloe Compete Tank";
		
		String productAfter = db.CartProduct();
		
		Assert.assertEquals(productBefore, productAfter);
		
		
	}
	
	@Test(priority = 4)
	public void ValidatePrice() throws InterruptedException {
		
		Dashboard db = new Dashboard(driver);
		
		Thread.sleep(9000);
		
		String productBeforeprice = "$39.00";
		
		String productAfterprice = db.Productprice();
		
		Assert.assertEquals(productBeforeprice, productAfterprice);
		
		db.Checkout();
		
		Thread.sleep(9000);
		
		
	}
	
	@Test(priority = 5)
	public void Checkout() throws InterruptedException {
		
		CheckoutDetails cd = new CheckoutDetails(driver);
		
		Thread.sleep(9000);
		
//		cd.Firstname("Bhavesh");
//		
//		cd.Lastname("Solanki");
		
		cd.Address("Viva college road");
		
		cd.City("Mumbai");
		
		cd.State("California");
		
		cd.postalcode("401303");
		
		cd.Country("United States");
		
		cd.Phone("7894561235");
		
		cd.Checkbox();
		
		cd.Nextbutton();
		
		Thread.sleep(9000);
		
	}
	
	@Test(priority = 6)
	public void Placeorder() throws InterruptedException {
		
		Payments pay = new Payments(driver);
		
	//	driver.get("https://magento.softwaretestingboard.com/checkout/#payment");
	//	pay.AddCheckbox();
		
		String expectedprice = "$44.00";
		
		String Totalprice = pay.Totalprice();
		
		Assert.assertEquals(expectedprice, Totalprice);
		
		pay.Placeorder();
		
		Thread.sleep(9000);
		
	}
	
	@Test(priority = 7)
	public void VerifyResponse() {
		
		Payments pay = new Payments(driver);
		
		String expectedtext = "Thank you for your purchase!";
		
		String actualtext = pay.Thankyou();
		
		Assert.assertEquals(expectedtext, actualtext);
		
	}
	
}
