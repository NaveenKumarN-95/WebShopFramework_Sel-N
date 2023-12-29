package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		
		super(driver);
		
	}
	
	@FindBy(linkText = "Jewelry")
	private WebElement jewelryLink;
	
	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	@FindBy(xpath="//a[.='Log out']")
	private WebElement logOutLink;
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(xpath = "//a[.='Log in']")
	private WebElement loginLink;
	
	@FindBy(className = "ico-cart")
	private WebElement shoppingCartLink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlistLink;
	
	@FindBy(id="small-searchterms")
	private WebElement searchTextField;
	
	@FindBy(css = "[value='Search']")
	private WebElement searchButton;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;
	
	@FindBy(xpath = "//ul[@class='top-menu']//a[@href='/computers']")
	private WebElement ComputersLink;
	
	public WebElement getComputersLink() {
		return ComputersLink;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}
	
	public WebElement getLogOutLink() {
		return logOutLink;
	}
}
