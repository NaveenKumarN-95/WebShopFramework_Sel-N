package objectRepository;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.FileUtility;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	@FindBy(name = "Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginInput;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginInput() {
		return loginInput;
	}
	
	public void login(WebDriver driver) throws IOException {
		
		HomePage homePage=new HomePage(driver);
		LoginPage loginPage=new LoginPage(driver);
		
		homePage.getLoginLink().click();
		
		loginPage.getEmail().sendKeys(FileUtility.getproperty("email"));
		loginPage.getPassword().sendKeys(FileUtility.getproperty("password"));
		
		loginPage.getLoginInput().click();
	}
	
	/**
	 * used to logout from the application
	 */
	public void logOut(WebDriver driver) {
		
		HomePage homePage=new HomePage(driver);
		
		homePage.getLogOutLink().click();
	}
}
