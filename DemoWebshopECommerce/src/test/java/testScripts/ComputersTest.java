package testScripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import genericLibrary.BaseClass;
import objectRepository.ComputersPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class ComputersTest extends BaseClass {
Actions a;
	@Test
	public void addToCart() {
		
		HomePage homePage=new HomePage(driver);
		LoginPage loginPage=new LoginPage(driver);
		ComputersPage computersPage=new ComputersPage(driver);
		
		homePage.getComputersLink().click();
		
		computersPage.getDesktopsLink().click();
		
		computersPage.getCheapComputerLink().click();
		
		computersPage.getAddToCartInput().click();
	}
	
	@Test
	public void verifyPageHeading() {
		
		HomePage homePage=new HomePage(driver);
		ComputersPage computersPage=new ComputersPage(driver);

		homePage.getComputersLink().click();
		
		String exp_Result=verifyPageHeading(driver);
		
		assertTrue(true, exp_Result);
			
	}	
	
	@Test
	public void purchaseComputer() {
		
		HomePage homePage=new HomePage(driver);
		ComputersPage computersPage=new ComputersPage(driver);
		
		homePage.getComputersLink().click();
		
		computersPage.getDesktopsLink().click();
		
		selectOptionByVisibleText(computersPage.getSortByDropdown(),"Price: High to Low");
		
		computersPage.getBuildYourOwnExpensiveComputer().click();
		
		//mouseHover(driver, computersPage.getAddToCartButton());
		Actions a=new Actions(driver);
		
		a.moveToElement(computersPage.getAddToCartButton());
		
		computersPage.getAddToCartButton().click();
		
		mouseClick(driver, computersPage.getShoppingCart());
		
		computersPage.getShoppingCart().click();
		
		selectOptionByValue(computersPage.getCountryDropdown(),"33");
		
		enterText(computersPage.getZipCodeTextfield(), "614906");
		
		computersPage.getTermsOfServiceCheckBox().click();
		
		computersPage.getCheckOutButton().click();
		
		
	}
}
