package genericLibrary;
import java.lang.reflect.Method;
// 20-12-23
import java.time.Duration;

import org.openqa.selenium.By;
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

import objectRepository.HomePage;
import objectRepository.LoginPage;

public class BaseClass extends WebdriverUtility{
public WebDriver driver;
	@BeforeSuite
	public void beforeSuite()
	{
		report=new ExtentReports(REPORT_PATH+getSystemDate()+".html");
//		Reporter.log("connection to database",true);
	}
	@AfterSuite
	public void afterSuite()
	{
		report.flush();
		Reporter.log("Close connection to database",true);
	}
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("Before test",true);
	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("After test",true);
	}
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("Before class",true);
	/*	driver = new ChromeDriver(); */ 
		//  OR  //
		String browser=FileUtility.getProperty("browser");
		String url=FileUtility.getProperty("url");
		
		if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("After class",true);
	}
	
	@BeforeMethod
//	public void beforeMethod() {
	public void beforeMethod(Method method) {
		String methodName = method.getName();
		test=report.startTest(methodName);
		Reporter.log("Login",true);
//		driver.findElement(By.linkText("Log in")).click();
//		driver.findElement(By.id("Email")).sendKeys("nandanms@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("nandan@1234");
//		driver.findElement(By.cssSelector("[value='Log in']")).click();
		/*
		HomePage homePage = new HomePage(driver);		
		LoginPage loginPage = new LoginPage(driver);
		
		//Click on Login link
		homePage.getLoginLink().click();
		
		//Enter email
		loginPage.getEmailTextField().sendKeys(FileUtility.getProperty("email"));
		
		//Enter Password
		loginPage.getPasswordTextField().sendKeys(FileUtility.getProperty("password"));
		
		//Click on Remember me check box
		loginPage.getRememberMeCheckbox().click();
		
		//Click on Login button
		loginPage.getLoginButton().click();
			*/
		LoginPage loginpage = new LoginPage(driver);
		loginpage.login(driver);
	}
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("Log out",true);
	//	driver.findElement(By.linkText("Log out")).click();
		report.endTest(test);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.logOut(driver);
	}
}
