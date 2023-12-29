package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath = "//h1")
	private WebElement checkoutPageHeading;
	
	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement firstNameTextfield;
	
	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement lastNameTextfield;
	
	@FindBy(name = "BillingNewAddress.Email")
	private WebElement emailTextfield;
	
	@FindBy(id = "BillingNewAddress_Company")
	private WebElement companyTextfield;
	
	@FindBy(name = "BillingNewAddress.CountryId")
	private WebElement countryDropdown;
	
	@FindBy(id="BillingNewAddress_City")
	private WebElement cityTextfield;
	
	@FindBy(id="BillingNewAddress_Address1")
	private WebElement address1Testfield;
	
	@FindBy(name = "BillingNewAddress.ZipPostalCode")
	private WebElement postalCodeTextfield;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	private WebElement phoneNumberTextfield;
	
	@FindBy(id = "shippingoption_0")
	private WebElement groundOption;
	
	@FindBy(id = "paymentmethod_0")
	private WebElement codOption;
	
	@FindBy(xpath = "(//input[@value='Continue'])[1]")
	private WebElement billingContinue;
	
	@FindBy(xpath = "(//input[@value='Continue'])[2]")
	private WebElement shippingContinue;
	
	@FindBy(xpath = "(//input[@value='Continue'])[3]")
	private WebElement shippingMethodContinue;
	
	
	@FindBy(xpath = "(//input[@value='Continue'])[4]")
	private WebElement paymentContinue;
	
	@FindBy(xpath = "(//input[@value='Continue'])[5]")
	private WebElement paymentInformationContinue;
	
	@FindBy(xpath = "//input[@value='Confirm']")
	private WebElement confirmButton;

	public WebElement getCheckoutPageHeading() {
		return checkoutPageHeading;
	}

	public WebElement getFirstNameTextfield() {
		return firstNameTextfield;
	}

	public WebElement getLastNameTextfield() {
		return lastNameTextfield;
	}

	public WebElement getEmailTextfield() {
		return emailTextfield;
	}

	public WebElement getCompanyTextfield() {
		return companyTextfield;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getCityTextfield() {
		return cityTextfield;
	}

	public WebElement getAddress1Testfield() {
		return address1Testfield;
	}

	public WebElement getPostalCodeTextfield() {
		return postalCodeTextfield;
	}

	public WebElement getPhoneNumberTextfield() {
		return phoneNumberTextfield;
	}

	public WebElement getGroundOption() {
		return groundOption;
	}

	public WebElement getCodOption() {
		return codOption;
	}

	public WebElement getBillingContinue() {
		return billingContinue;
	}

	public WebElement getShippingContinue() {
		return shippingContinue;
	}

	public WebElement getShippingMethodContinue() {
		return shippingMethodContinue;
	}

	public WebElement getPaymentContinue() {
		return paymentContinue;
	}

	public WebElement getPaymentInformationContinue() {
		return paymentInformationContinue;
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}
	
	
	
	
}
