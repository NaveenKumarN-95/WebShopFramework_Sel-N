package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage extends BasePage {

	public BookPage(WebDriver driver) {
		
		super(driver);
	}
	@FindBy	(id = "products-orderby")
	private WebElement sortByDropDown;
	
	@FindBy(id = "products-pagesize")
	private WebElement displayDropdown;
	
	@FindBy(name = "products-viewmode")
	private WebElement viewasDropdown;
	
	public WebElement getSortByDropDown() {
		return sortByDropDown;
	}

	public WebElement getDisplayDropdown() {
		return displayDropdown;
	}

	public WebElement getViewasDropdown() {
		return viewasDropdown;
	}
	@FindBy(xpath = "//div[@class='page-title']//h1")
	private WebElement booksPageHeading;

	public WebElement getBooksPageHeading() {
		return booksPageHeading;
	}
	
	
}
