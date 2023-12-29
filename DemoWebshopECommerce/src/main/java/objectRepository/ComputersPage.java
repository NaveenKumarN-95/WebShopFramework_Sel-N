package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage extends BasePage {
	
	public ComputersPage(WebDriver driver) {
		
		super(driver);
	}

	@FindBy(xpath = "//ul[@class='top-menu']//a[@href='/computers']")
	private WebElement ComputersLink;
	
	@FindBy(linkText = "Desktops")
	private WebElement desktopsLink;
	
	@FindBy(linkText = "Build your own cheap computer")
	private WebElement cheapComputerLink;
	
	@FindBy(xpath = "//div[@class='add-to-cart-panel']//input[@value='Add to cart']")
	private WebElement addToCartInput;
	
	@FindBy(id="products-orderby")
	private WebElement sortByDropdown;
	
	@FindBy(id="products-pagesize")
	private WebElement displayPerPageDropdown;
	
	@FindBy(id="products-viewmode")
	private WebElement viewAsDropdown;
	
	@FindBy(linkText = "Build your own expensive computer")
	private WebElement buildYourOwnExpensiveComputer;
	
	@FindBy(css = "[value='80']")
	private WebElement slowOption;
	
	@FindBy(css = "[value='81']")
	private WebElement mediumOption;
	
	@FindBy(css = "[value='82']")
	private WebElement fastOption;
	
	@FindBy(id = "product_attribute_74_6_27_83")
	private WebElement Ram2GbOption;
	
	@FindBy(id = "product_attribute_74_6_27_84")
	private WebElement Ram4GbOption;
	
	@FindBy(id = "product_attribute_74_6_27_85")
	private WebElement Ram8GbOption;
	
	@FindBy(id="product_attribute_74_3_28_86")
	private WebElement Hdd320GbOption;
	
	@FindBy(id="product_attribute_74_3_28_87")
	private WebElement Hdd400GbOption;
	
	@FindBy(id="product_attribute_74_3_28_88")
	private WebElement imageViewerSoftware;
	
	@FindBy(id="product_attribute_74_3_28_89")
	private WebElement officeSuiteOption;
	
	@FindBy(id="product_attribute_74_3_28_90")
	private WebElement otherOfficeSuiteOption;
	
	@FindBy(xpath = "//input[@id='add-to-cart-button-72']")
	private WebElement addToCartButton;
	
	@FindBy(xpath  = "//span[.='Shopping cart']")
	private WebElement shoppingCart;
	
	@FindBy(className = "country-input")
	private WebElement countryDropdown;
	
	@FindBy(id="StateProvinceId")
	private WebElement stateDropdown;
	
	@FindBy(id="ZipPostalCode")
	private WebElement zipCodeTextfield;
	
	@FindBy(id="termsofservice")
	private WebElement termsOfServiceCheckBox;
	
	@FindBy(id="checkout")
	private WebElement checkOutButton;
	
	

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public WebElement getZipCodeTextfield() {
		return zipCodeTextfield;
	}

	public WebElement getTermsOfServiceCheckBox() {
		return termsOfServiceCheckBox;
	}

	public WebElement getCheckOutButton() {
		return checkOutButton;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getSlowOption() {
		return slowOption;
	}

	public WebElement getMediumOption() {
		return mediumOption;
	}

	public WebElement getFastOption() {
		return fastOption;
	}

	public WebElement getRam2GbOption() {
		return Ram2GbOption;
	}

	public WebElement getRam4GbOption() {
		return Ram4GbOption;
	}

	public WebElement getRam8GbOption() {
		return Ram8GbOption;
	}

	public WebElement getHdd320GbOption() {
		return Hdd320GbOption;
	}

	public WebElement getHdd400GbOption() {
		return Hdd400GbOption;
	}

	public WebElement getImageViewerSoftware() {
		return imageViewerSoftware;
	}

	public WebElement getOfficeSuiteOption() {
		return officeSuiteOption;
	}

	public WebElement getOtherOfficeSuiteOption() {
		return otherOfficeSuiteOption;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getViewAsDropdown() {
		return viewAsDropdown;
	}

	public WebElement getBuildYourOwnExpensiveComputer() {
		return buildYourOwnExpensiveComputer;
	}

	public WebElement getComputersLink() {
		return ComputersLink;
	}

	public WebElement getDesktopsLink() {
		return desktopsLink;
	}

	public WebElement getCheapComputerLink() {
		return cheapComputerLink;
	}

	public WebElement getAddToCartInput() {
		return addToCartInput;
	}

	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}

	public WebElement getDisplayPerPageDropdown() {
		return displayPerPageDropdown;
	}

	

	

	
	
}
