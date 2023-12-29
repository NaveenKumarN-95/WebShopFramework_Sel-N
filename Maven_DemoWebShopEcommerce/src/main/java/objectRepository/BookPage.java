package objectRepository;
//20-11-23
//21-11-23
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage extends BasePage{
	
	public BookPage(WebDriver driver) {
		super(driver);
	}
		
	@FindBy(xpath="//div[@class='page-title']//h1")
	private WebElement booksPageHeading;
	
	@FindBy(id = "products-orderby")
	private WebElement sortByDropDown;
	
	@FindBy(id = "products-pagesize")
	private WebElement pageSizeDropDown;
	
	public WebElement getBooksPageHeading() {
		return booksPageHeading;
	}

	public WebElement getSortByDropDown() {
		return sortByDropDown;
	}

	public WebElement getPageSizeDropDown() {
		return pageSizeDropDown;
	}
}
