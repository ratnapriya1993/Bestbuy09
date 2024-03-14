package utils;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class Utility {
	
    public static WebDriver driver;
	
	public void browserlaunch(String browser) {
		
		if (browser.equals("chrome")){
	    	driver = new ChromeDriver();
	    }else if (browser.equals("edge")){
           driver = new EdgeDriver();
	    }else if(browser.equals("firefox")) {
	    	driver = new FirefoxDriver();
	    }else {
	    	driver = new ChromeDriver();
	    }
	}
		
	public void loadurl(String url) {
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	public void closebrowser() {
		driver.close();
	
	}
	
	public String[][] readExcel() throws IOException  {
		
        XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\USER\\eclipse-workspace\\BestbuyProject\\Data\\RegisterTest.xlsx");
		XSSFSheet sheet =  book.getSheetAt(0);
	    
	    int rowcount = sheet.getLastRowNum();
	    int columcount = sheet.getRow(0).getLastCellNum();
	    
	    String[][] data = new String [rowcount][columcount];
	    // get in to the row
	    for ( int i=1;i<=rowcount;i++) {
	    	  XSSFRow row = sheet.getRow(i);
	   // get tin to the column
	    	  for(int j=0;j<columcount;j++) {
	    		XSSFCell cell = row.getCell(j);
	    		data[i-1][j] = cell.getStringCellValue();
	    	  }
	    	  }
	    book.close();
		return  data;	    
}
}