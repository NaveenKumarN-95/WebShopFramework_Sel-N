package testScripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import objectRepository.HomePage;
import objectRepository.JewelryPage;

public class JewelryTest extends BaseClass{
	
	@Test
	public void diamondHeartTest_001() {
		HomePage homePage = new HomePage(driver);
		JewelryPage jewelryPage = new JewelryPage(driver);
		
		//Takes ScreenShot of Web Page
		getScreenshotOfWebPage(driver);
		
		//Click on Jewelry
		clickElement(homePage.getJewelryLink());
		
		//Takes Screenshot on Diamond Heart
		getScreenshotOfWebElement(jewelryPage.getBlackAndWhiteDiamondHeartImage());
		
	//	String str = "hi";
		
	}

}
