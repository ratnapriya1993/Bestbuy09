package Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import utils.Utility;



public class ProjectSpecificationMethod extends Utility {

	public void launchBrowser(String browser) {
		browserlaunch(browser);
	}
		
	public void getUrl(String url) {
		loadurl(url);
			}
	public void BrowserClose() {
         closebrowser();
	}
	@DataProvider(name ="ReadfromExcel")
	public String[][] exceldata() throws IOException {
		 String[][] data = readExcel();
		 return data; 
	}
}
	
	
    
