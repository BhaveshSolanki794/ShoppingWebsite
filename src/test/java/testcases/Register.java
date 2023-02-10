package testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.Login;
import pageobjects.RegisterPage;

public class Register extends Baseclass {
	
	@Test
	public void createAcc() throws FileNotFoundException, IOException {
	
	RegisterPage register = new RegisterPage(driver);
	
	register.SignupLink();
	
	String expectedUrl = "https://magento.softwaretestingboard.com/customer/account/";
	
	XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("C:\\Users\\bhave\\Downloads\\signup.xlsx"));
	
	XSSFSheet sheet = workbook.getSheet("Sheet1");
	
	int rowLength = sheet.getLastRowNum();
	
	for (int i = 0; i <= rowLength; i++) {
		
		String firstname = sheet.getRow(i).getCell(0).toString();
		String lastname = sheet.getRow(i).getCell(1).toString();
		String email = sheet.getRow(i).getCell(2).toString();
		String password = sheet.getRow(i).getCell(3).toString();
		String confirmpassword = sheet.getRow(i).getCell(4).toString();
		
		register.Firstname(firstname);
		register.Lastname(lastname);
		register.Email(email);
		register.Password(password);
		register.Confirmpass(confirmpassword);
		register.SignupButton();
		
	}
	
	String currentUrl = driver.getCurrentUrl();
	
	Assert.assertEquals(expectedUrl, currentUrl);
	
	
	}
	
	
}
