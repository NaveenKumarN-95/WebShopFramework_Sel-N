package testScripts;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import objectRepository.HomePage;
import objectRepository.JewelryPage;

public class jewelryTest extends BaseClass{

	@Test(enabled = false)
	public void getScreenshotOfBlackAndWhiteChain() {
		
		HomePage homePage=new HomePage(driver);
		JewelryPage jewelryPage=new JewelryPage(driver);
		
		homePage.getJewelryLink().click();
		
		//getScreenshotOfWebElement(driver, jewelryPage.getbAndWChain());
		
		
	}
	
	@Test
public void sortByPriceHighToLow() {
		
		HomePage homePage=new HomePage(driver);
		JewelryPage jewelryPage=new JewelryPage(driver);
		
		homePage.getJewelryLink().click();
		
		selectOptionByVisibleText(jewelryPage.getSortbyDropdown(),"Price: High to Low");
		
}
	@Test
	
	public void displayPerPageDropDown() {
		
		HomePage homePage=new HomePage(driver);
		JewelryPage jewelryPage=new JewelryPage(driver);
		
		homePage.getJewelryLink().click();
		selectOptionByIndex(jewelryPage.getDisplayPerPageDropdown(),2);
	}	
	
	@Test
	public void gitMethod(){
		//new method added
	}
}
