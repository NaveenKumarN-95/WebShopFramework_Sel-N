package testScripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import objectRepository.HomePage;
import objectRepository.NotesbooksPage;

public class Computers_NotebooksTest extends BaseClass{
@Test
public void laptopTest001() {
	HomePage homePage = new HomePage(driver);
	NotesbooksPage notebooksPage = new NotesbooksPage(driver);
	
	homePage.getNotebooksLink().click();
	
}
}
