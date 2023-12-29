package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage {
//	@FindBy(xpath = "//ul[@class='top-menu']//a[contains(.,'Notebooks')]")
//	private WebElement NotebooksLink;
	
	@FindBy(xpath = "//div[@class='page-title']/h1")
	private WebElement computersPageHeading;
	
	
}
