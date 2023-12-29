package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JewelryPage extends BasePage{

	public JewelryPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(id="products-pagesize")
	private WebElement displayPerPageDropdown;
	
	public WebElement getDisplayPerPageDropdown() {
		return displayPerPageDropdown;
	}

	@FindBy(xpath="//div[@class='picture']//img[@title='Show details for Black & White Diamond Heart']")
	private WebElement blackAndWhiteDiamondRing;

	public WebElement getBlackAndWhiteDiamondRing() {
		return blackAndWhiteDiamondRing;
	}
	
	
	public WebElement getbAndWChain() {
		return bAndWChain;
	}

	@FindBy(xpath = "//a[contains(.,'Heart')]")
	private WebElement bAndWChain;
	@FindBy(id="add-to-cart-button-14")
	private WebElement addToCartBtn;

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}
	
	@FindBy(id = "products-orderby")
	private WebElement sortbyDropdown;

	public WebElement getSortbyDropdown() {
		return sortbyDropdown;
	}
	
	
	
	
}
