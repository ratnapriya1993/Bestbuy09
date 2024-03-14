package test;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Base.ProjectSpecificationMethod;
import pages.HomePage;
import pages.RegisterPage;

public class TC002_RegisterTest extends ProjectSpecificationMethod{

	   @Test(dataProvider = "ReadfromExcel")
   public void registertest(String firstname,String lastname,String email,String password,String conformpassword,String mobilenumber) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileReader reader = new FileReader("C:\\Users\\USER\\eclipse-workspace\\BestbuyProject\\src\\test\\resources\\TestData.properties");
		Properties prop = new Properties();
		prop.load(reader);
	   
		HomePage obj = new HomePage(driver);
		RegisterPage obj1= new RegisterPage(driver) ;
		obj.browserlaunch(prop.getProperty("browser"));
		obj.loadurl(prop.getProperty("url"));
		obj.selectcountry();
		driver.navigate().refresh();
		obj.AccountButton();
		obj.createAccountButton();
		obj1.Firstname(firstname);
		obj1.Lastname(lastname);
		obj1.email(email);
		obj1.passward(password);
		obj1.conformpasword(conformpassword);
		obj1.mobilnumber(mobilenumber);
		obj1.createAccount();
		
	}

}
