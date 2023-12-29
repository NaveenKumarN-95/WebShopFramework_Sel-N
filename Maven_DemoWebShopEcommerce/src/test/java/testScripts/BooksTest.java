package testScripts;
// Pre 21-12-23
//26-12-23 : ExtentReport - test
//27-12-23 -- Screenshot method added
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass;
import objectRepository.BookPage;
import objectRepository.HomePage;

public class BooksTest extends BaseClass{
	@Test
	public void verifyBookPage_001() {
		HomePage homePage = new HomePage(driver);
		BookPage bookPage = new BookPage(driver);
		Reporter.log("Verify Books page is displayed");

		//Click on Books Link
		homePage.getBooksLink().click();
		
		test.log(LogStatus.INFO, "Click On Books Link");
		
		String pageheading = bookPage.getBooksPageHeading().getText();
		
		try {
//			Assert.assertEquals(pageheading, "Books", "Books is not displayed");
			Assert.assertEquals(pageheading, "Computers", "Books is not displayed");
			test.log(LogStatus.PASS, "Test case completed");
		}
		catch (AssertionError e) {
			String path = getScreenshotOfWebPage(driver);
			test.log(LogStatus.FAIL, test.addScreenCapture(path));
		}
//		test.log(LogStatus.PASS,"Test Case Completed");

		Reporter.log("Test case completed and It passed",true);
	}

	@Test
	public void sortBooksByNameAndPrice_002() throws InterruptedException{
		HomePage homePage = new HomePage(driver);
		BookPage bookPage = new BookPage(driver);

		//Click on BooksLink
		homePage.getBooksLink().click();
		
		test.log(LogStatus.INFO, "option selected");

		//Sort the books from Z to A
		selectOptionByIndex(bookPage.getSortByDropDown(),2);
		Thread.sleep(2000);

		selectOptionByVisibleText(bookPage.getSortByDropDown(), "Created on");
		Thread.sleep(2000);
		
		test.log(LogStatus.FAIL, "Test Case 2 failed");
	}

	@Test
	public void sortBooksByPageSize_003() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		BookPage bookPage = new BookPage(driver);

		//Click on BooksLink
		homePage.getBooksLink().click();

		//Sort the books from Z to A
		selectOptionByIndex(bookPage.getPageSizeDropDown(),2);
		Thread.sleep(2000);
	}
}
// First change
// Secondus change
// Third change
