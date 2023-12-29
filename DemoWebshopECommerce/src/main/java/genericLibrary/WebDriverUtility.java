package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class WebDriverUtility implements FrameworkConstants{
	
	public static Actions a;
	public static JavascriptExecutor je;
	public static ExtentReports report;
	public static ExtentTest test;
	
	public static String verifyPageHeading(WebDriver driver) {
		
	return	driver.getTitle();
	}
	
	public static void selectOptionByIndex(WebElement dropdown,int index) {
		Select s=new Select(dropdown);
		
		s.selectByIndex(index);
	}
	
	public static void selectOptionByValue(WebElement dropdown,String value) {
		
		Select s=new Select(dropdown);
		
		s.selectByValue(value);
		
	}
	
public static void selectOptionByVisibleText(WebElement dropdown,String text) {
		
		Select s=new Select(dropdown);
		
		s.selectByVisibleText(text);
		
	}
public static void switchtoAlertAndAccept(WebDriver driver) {
	
	driver.switchTo().alert().accept();
}

public static void switchtoAlertAndDismiss(WebDriver driver) {
	
	driver.switchTo().alert().dismiss();
}

public static void switchtoAlertAndGettext(WebDriver driver) {
	
	driver.switchTo().alert().getText();
}

public static void switchtoAlertAndSendkeys(WebDriver driver,String text) {
	
	driver.switchTo().alert().sendKeys(text);
}


public static void switchToWindowByTitle(WebDriver driver,String title) {
	
	Set<String> allAddress = driver.getWindowHandles();
	
	for(String window:allAddress) {
		driver.switchTo().window(title);
		
		if(driver.getTitle().equalsIgnoreCase(title)) 
		{break;
		}
		}
	}

	//switch to window using url
	public static void switchtoWindowByUrl(WebDriver driver,String url) {
		
	  	Set<String> allAddress = driver.getWindowHandles();
	  	
	  	for(String window:allAddress) {
	  		
	  		driver.switchTo().window(url);
	  		
	  		if(driver.getCurrentUrl().equals(url)) {
	  			break;
	  		}
	  	}
	  	
	}
	
	//switch to frame by index
	public static void switchtoFrameByIndex(WebDriver driver,int index) {
		
		driver.switchTo().frame(index);
	}
	
     public static void switchtoFrameByNameOrId(WebDriver driver,String text) {
    
     driver.switchTo().frame(text);
     }
     
     public static void switchtoFrameByWebElement(WebDriver driver,WebElement element) {
    	 
    	 driver.switchTo().frame(element);
     }
     
   //all webdriver methods
     public static void clickOnElement(WebElement element) {
    	 
    	element.click();
     }
     public static void enterText(WebElement element,String text) {
    element.sendKeys(text);
     }
     
     public static String getSystemDate() {
    	 
    	 return LocalDateTime.now().toString().replace(":", "_").replace("-", "_");
     }
     public static String getScreenshotOfWebPage(WebDriver driver) throws IOException {
    	 
    	 TakesScreenshot ts=(TakesScreenshot)driver;
    	 
    	 File temp = ts.getScreenshotAs(OutputType.FILE);
    	 
    	String imagePath = SCREENSHOT_PATH + getSystemDate()+".png";
    	
    	File perm=new File(imagePath);
    	 
    	FileHandler.copy(temp, perm);
    	
    	return "."+imagePath;
     }
     
     public static String getScreenshotOfWebElement(WebDriver driver) {
    	 
    	 TakesScreenshot ts=(TakesScreenshot)driver;
    	 
    	 File temp = ts.getScreenshotAs(OutputType.FILE);
    	 
    	 String imagePath = SCREENSHOT_PATH+getSystemDate()+".png";
    	 
    	 File perm=new File(imagePath);
    	 
    	 
    	 try {
			FileHandler.copy(temp, perm);
		} catch (IOException e) {

			e.printStackTrace();
		}
    	 
    	 return "."+imagePath;
     }
     
     public static void enterValueIntoHiddenOrDisableElement(WebDriver driver,WebElement element,String value) {
    	 
    	 JavascriptExecutor je=(JavascriptExecutor)driver;
    	 
    	 je.executeScript("arguments[0].value='"+value+"';", element);
    	 
    	   }
     /**
 	 * Method to handle Hidden or Disabled button 
 	 */
     
     public static void clickOnHiddenOrDisableElement(WebDriver driver,WebElement element) {
 
    	 JavascriptExecutor je=(JavascriptExecutor)driver;
    	 
    	 je.executeScript("arguments[0].click();", element);
    	 
     }
     
     public static void mouseHover(WebDriver driver,WebElement element) {
    	 
    	 a=new Actions(driver);
    	 a.moveToElement(element).perform();;
     }
     
 public static void mouseClick(WebDriver driver,WebElement element) {
    	 
    	  a=new Actions(driver);
    	  a.click(element).perform();;
     }
 
 public static void rightClick(WebDriver driver,WebElement element) {
	 
	 	a=new Actions(driver);
	 	a.contextClick(element).perform();
	 
 }
}
     

