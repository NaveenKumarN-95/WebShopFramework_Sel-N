package testScripts;
//26-12-23
//27-12-23
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass;
import objectRepository.HomePage;

//public class ReportTest {
public class ReportTest extends BaseClass {

	@Test
	public void reportTest() {
	//	test = report.startTest("loginTest");

		test.log(LogStatus.INFO, "Chrome browser launched");

		test.log(LogStatus.INFO, "Chrome browser maximized");
		
		Assert.assertEquals(driver.findElement(By.linkText("Log out")).isDisplayed(), true,"Log out not displayed");
		test.log(LogStatus.FAIL, "Log in successful");
		//driver.quit();
	}
	
	@Test
	public void reportTest2() {
//		test = report.startTest("loginTest0"); 
//		test = report.startTest("loginTest2"); //Causes Previous One --> Unknown

		test.log(LogStatus.INFO, "Chrome 2 launched");

		test.log(LogStatus.INFO, "Chrome 2 maximized");
		
		Assert.assertEquals(driver.findElement(By.linkText("Log out")).isDisplayed(), true,"Log out not displayed");
		test.log(LogStatus.PASS, "Log in successful"); 
		//driver.quit();
	}
}
