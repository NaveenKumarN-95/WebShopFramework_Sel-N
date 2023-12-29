package objectRepository;
//20-11-23
//21-11-23
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(partialLinkText = "Shopping")
	private WebElement shoppingCartLink;
	
	@FindBy(partialLinkText = "Wishlist")
	private WebElement wishlistLink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchTextField;
	
	@FindBy(css = "[value='Search']")
	private WebElement searchButton;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelryLink;

	public WebElement getBooksLink() {
		return booksLink;
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

	public WebElement getJewelryLink() {
		return jewelryLink;
	}
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	// ---------------------------Extra-------------------------------------------
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(.,'Computers')]")
	private WebElement ComputersLink;

	public WebElement getComputersLink() {
		return ComputersLink;
		
	}
	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(.,'Notebooks')]")
	private WebElement NotebooksLink;

	public WebElement getNotebooksLink() {
		return NotebooksLink;
	}
	
	
}
