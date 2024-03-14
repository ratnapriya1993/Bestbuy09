package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecificationMethod;

   public class LoginPage extends ProjectSpecificationMethod {

	 @FindBy(xpath = "//input[@type='email']") 
	 WebElement email;
	 
	 @FindBy(xpath = "//input[@type='password']")
	 WebElement password;
	 
	 @FindBy(xpath = "//button[@data-track='Sign In']")
	 WebElement signin;
	   
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	public LoginPage  email(String email) {
		
		return this;
	}
	public LoginPage password(String password) {
		
		return this;
	}
	public void  signinbutton() {
		signin.click();
	}
}
	
