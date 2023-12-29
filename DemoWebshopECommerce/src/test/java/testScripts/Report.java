package testScripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Report {

	ExtentReports report=new ExtentReports("./Reports/report.html");
	ExtentTest test=report.startTest("loginTest");
	
	@Test
	public void reportTest() {
		
		WebDriver driver=new ChromeDriver();
		
		test.log(LogStatus.INFO, "chrome browser launched");
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("manitkt@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("mani123");
		
		driver.findElement(By.cssSelector("[value='Log in']")).click();

		assertEquals(driver.findElement(By.linkText("Log out")).isDisplayed(),true,"logout not displayed");
		
		test.log(LogStatus.PASS, "log in successful");
		report.endTest(test);
		
		report.flush();
		driver.quit();
	}
}
