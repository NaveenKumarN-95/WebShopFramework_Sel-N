package genericLibrary;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;

import objectRepository.BookPage;
import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass extends FileUtility {

	public WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		
		report=new ExtentReports(Report_Path+getSystemDate()+".html");
		Reporter.log("before suite executing",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		
		Reporter.log("before test executing",true);
	}
	
	@BeforeClass
	public void beforeClass() throws IOException {
		
		Reporter.log("before class executing",true);
		String browser=FileUtility.getProperty("browser");
		String url=FileUtility.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else
			driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	
	@BeforeMethod
	public void beforeMethod(Method method) throws IOException {
		
		String methodName=method.getName();
		
		test=report.startTest(methodName);
		
		Reporter.log("before method executing",true);
		
//		LoginPage loginPage=new LoginPage(driver);
//		
//		loginPage.login(driver);
		
		HomePage homepage=new HomePage(driver);
		
		LoginPage loginPage=new LoginPage(driver);
		
		homepage.getLoginLink().click();
		
		loginPage.getEmail().sendKeys(FileUtility.getProperty("email"));
		
		loginPage.getPassword().sendKeys(FileUtility.getProperty("password"));
		
		loginPage.getLoginInput().click();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		
		Reporter.log("after method executing",true);
	 HomePage homePage=new HomePage(driver);
	 homePage.getLogOutLink().click();;
	 report.endTest(test);
	}
	
	@AfterClass
	public void afterClass() {
		
		Reporter.log("after class executing",true);
		driver.quit();
	}
	
	@AfterTest
	public void afterTest() {
		
		Reporter.log("after test executing",true);
	}
	@AfterSuite
	public void afterSuite() {
		
		report.flush();
		Reporter.log("after suite executing",true);
	}
	
	
}
