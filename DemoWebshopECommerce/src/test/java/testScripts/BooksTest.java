package testScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import genericLibrary.BaseClass;
import objectRepository.BookPage;
import objectRepository.HomePage;

public class BooksTest extends BaseClass {
	
	@Test
	public void verifyBookPage_001() {
		
		HomePage homepage=new HomePage(driver);
		BookPage bookPage=new BookPage(driver);
		
		Reporter.log("verify book page is displayed",true);
		
		//click on books link
		homepage.getBooksLink().click();
		
		String pageHeading = bookPage.getBooksPageHeading().getText();
		
		Assert.assertEquals(pageHeading, "Books","books heading is not equal");
		
		Reporter.log("test case executed",true);
	}
	
	@Test
	public void sortBooksByNameAndPrice() throws InterruptedException {
		
		HomePage homepage=new HomePage(driver);
		BookPage bookPage=new BookPage(driver);
		
		homepage.getBooksLink().click();
		
		selectOptionByIndex(bookPage.getSortByDropDown(),3);
		Thread.sleep(2000);
		selectOptionByVisibleText(bookPage.getSortByDropDown(), "Created on");
	}
	
	public void sortBooksByPageSize() throws InterruptedException {
		
		HomePage homepage=new HomePage(driver);
		BookPage bookPage=new BookPage(driver);
		
		homepage.getBooksLink().click();
		
		selectOptionByIndex(bookPage.getDisplayDropdown(), 2);
		Thread.sleep(2000);
		
		selectOptionByIndex(bookPage.getDisplayDropdown(), 1);
		Thread.sleep(2000);
	}
	
	public void sortBooksByView() {
		
		HomePage homepage=new HomePage(driver);
		BookPage bookPage=new BookPage(driver);
		
		homepage.getBooksLink().click();
		
		selectOptionByVisibleText(bookPage.getViewasDropdown(), "List");
		
	}
	
	
}
