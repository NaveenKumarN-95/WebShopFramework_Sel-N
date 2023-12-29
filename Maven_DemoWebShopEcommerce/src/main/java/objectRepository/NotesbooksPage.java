package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotesbooksPage extends BasePage{
	public NotesbooksPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement notebooksPageHeading;
	
	@FindBy(linkText = "14.1-inch Laptop")
	private WebElement laptopLink;

	public WebElement getNotebooksPageHeading() {
		return notebooksPageHeading;
	}

	public WebElement getLaptopLink() {
		return laptopLink;
	}
	
}
