package genericLibrary;
//15-12-23
//21-11-23

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//public class FileUtility {
public class FileUtility extends WebdriverUtility{

	//  COMMON DATA.Properties

	public static String getProperty(String key) {

		//Step 1: Get the java representation of physical properties file
		FileInputStream fis = null;

		try {
//		fis = new FileInputStream("./src/test/resources/commonData.properties");
			fis = new FileInputStream(PROPERTY_FILE_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Properties p = new Properties();

		//Step 2 : Load all the key and value pair to properties object

		try {
			p.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Step 3: Get the value using key
		return p.getProperty(key);	
	}
	public static void main(String[] args) throws IOException {
		//	System.out.println(getProperty("browser"));
		//	System.out.println(readDataFromExcel());
		//	System.out.println(readCellDataFromExcel("register",2,4));
		readRowDataFromExcel("register");
	}

	//		EXCEL
	public static String[][] readRowDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException
	{
		//Step 1:Get the java representation of excel file
		FileInputStream fis = new FileInputStream("./Resources/testdata_1.xlsx");
		//Step 2:Get the Workbook 
		Workbook book = WorkbookFactory.create(fis);
		//Step 3:Get sheet from Workbook
		Sheet sheet = book.getSheet(sheetName);
		//Step 4:Get the count of rows having value
		int rowCount = sheet.getPhysicalNumberOfRows();
		//Step 5:Get the count of cells having value
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		//Step 6:Create 2 dimensional array
		String [][] data = new String[rowCount-1][cellCount];
		//Step 7:Read the data from Excel and store inside 2 Dimensional Array
		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
				System.out.print(" "+data[i-1][j]);
			}
			System.out.println();
		}
		//Step 8: Read 2D Array
		return data;
	}

	//public static String readDataFromExcel() throws EncryptedDocumentException, IOException
	public static String readCellDataFromExcel(String sheet,int row, int cell) throws EncryptedDocumentException, IOException
	{
		//Step 1:Get the java representation of excel file
		FileInputStream fis = new FileInputStream("./Resources/testdata_1.xlsx");
		//Step 2:Get the Workbook 
		//	Workbook book = WorkbookFactory.create(fis);
		//Step 3:Get sheet from Workbook
		//	Sheet sheet = book.getSheet("register");
		//Step 4:Get the row from Sheet
		//	Row row = sheet.getRow(3);
		//Step 5:Get the cell from sheet
		//	System.out.println(row.getCell(4));
		//	return null;

		// Alternate Step 2 : Reading the Data from Cell using Method Chaining
		return WorkbookFactory.create(fis).getSheet("register").getRow(3).getCell(4).toString();
	}
}
