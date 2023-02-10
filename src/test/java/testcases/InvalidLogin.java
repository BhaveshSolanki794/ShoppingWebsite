package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.Login;

public class InvalidLogin extends Baseclass {

	Login login = new Login(driver);

	@Test(enabled = false)
	public void InvalidUser() {

		Login login = new Login(driver);

		login.SigninLink();

		login.Username("B@gmail.com");

		login.Password("123456");

		login.Signin();

		String expectedurl = "https://magento.softwaretestingboard.com/";

		String currenturl = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedurl, currenturl);

	}

	@Test(enabled = true)
	public void ValidUser() {

		Login login = new Login(driver);

		login.SigninLink();

		login.Username("Bhavesh02@gmail.com");

		login.Password("Bhavesh@21");

		login.Signin();

		String expectedurl = "https://magento.softwaretestingboard.com/";

		String currenturl = driver.getCurrentUrl();
		
		Assert.assertEquals(expectedurl, currenturl);

	}

}
