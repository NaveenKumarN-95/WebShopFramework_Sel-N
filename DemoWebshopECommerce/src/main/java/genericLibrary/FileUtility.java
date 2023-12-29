package genericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.devtools.v118.browser.Browser;

public class FileUtility extends WebDriverUtility{

	public static void main(String[] args) throws IOException {
		String browser = getProperty("browser");
		
		System.out.println(browser);
		
		System.out.println(readRowDataFromExcel("register"));
	}
	
	public static String readDataFromExcel() throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream(EXCEL_PATH);
//		
//		Workbook book = WorkbookFactory.create(fis);
//		
//		Sheet sheet = book.getSheet("register");
//		
//		Row row = sheet.getRow(3);
//		
//		System.out.println(row.getCell(4));
		
		return WorkbookFactory.create(fis).getSheet("register").getRow(3 ).getCell(2).toString();
	}
	public static String getProperty(String key) throws IOException {
		
		FileInputStream fis=null;
		
		try {
		fis=new FileInputStream(PROPERTY_FILE_PATH);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		Properties p=new Properties();
		
		try {
		p.load(fis);}
		catch (Exception e) {

		e.printStackTrace();
		
		}
		
		return p.getProperty(key);
	}
	
	public static String[][] readRowDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException{
	
		//Step 1: Get the java representation of physical file
		FileInputStream fis=new FileInputStream(EXCEL_PATH);
		
		//Step 2: Get the Workbook
		Workbook book=WorkbookFactory.create(fis);
		
		//Step 3: Get the Workbook
		Sheet sheet=book.getSheet(sheetName);
		
		//Step 4: Get the count of rows having value
		int rowCount=sheet.getPhysicalNumberOfRows();
		
		//Step 5: Get the count of cell having value
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		
		//Step 5: Create a 2 dimensional array
		String [][] data=new String[rowCount-1][cellCount];
		
		//Step 6: Read the data from Excel and store inside 2 dimensional array.
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		//Return 2D array
		return data;
	}
}
