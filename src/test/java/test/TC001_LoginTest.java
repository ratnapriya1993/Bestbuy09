package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Base.ProjectSpecificationMethod;
import pages.HomePage;
     
 
    public class TC001_LoginTest extends ProjectSpecificationMethod {
      	
	
	    @Test(dataProvider = "ReadfromExcel")
	    public  void logintest(String email,String password) throws IOException {
	    	// TODO Auto-generated method stub
	    	
	    	
		// read the file using file reader class and properties class
		FileReader reader = new FileReader("C:\\Users\\USER\\eclipse-workspace\\BestbuyProject\\src\\test\\resources\\TestData.properties");
		Properties prop = new Properties();
		prop.load(reader);
	
		HomePage obj = new HomePage(driver);
		obj.browserlaunch(prop.getProperty("browser"));
		obj.loadurl(prop.getProperty("url"));
		obj.selectcountry();
		driver.navigate().refresh();
		obj.AccountButton();
	    obj.Signinbutton()
		.email(email)
		.password(password)
		.signinbutton();
		


	}

}
