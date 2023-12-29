package objectRepository;
//20-11-23
//21-11-23
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibrary.FileUtility;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckbox;
	
	@FindBy(linkText = "Forgot password?")
	private WebElement forgotPasswordLink;
	
	@FindBy(css = "[value='Log in']")
	private WebElement loginButton;
	
//	@FindBy(linkText = "Log out")
//	private WebElement logoutLink;

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getRememberMeCheckbox() {
		return rememberMeCheckbox;
	}
	
	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
//	public WebElement getLogoutLink() {
//		return logoutLink;
//	}

	/**
	 * Used to login to application by using valid email and password
	 * 
	 */
	
	public void login(WebDriver driver) {
		
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
	}
	
	/**
	 * Used to logout from application
	 * @param driver
	 */
	public void logOut(WebDriver driver) {
		HomePage homePage = new HomePage(driver);		
		//LoginPage loginPage = new LoginPage(driver);
		//Click on Log out link
		homePage.getLogoutLink().click();
	}
}
