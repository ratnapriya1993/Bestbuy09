package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecificationMethod;

public class RegisterPage extends ProjectSpecificationMethod {

	@FindBy(id = "firstName")
	WebElement firstname;
	
	@FindBy(name = "lastName")
	WebElement lastname;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	WebElement password;
	
	@FindBy(id = "reenterPassword")
	WebElement conformpassword;
	
	@FindBy(id = "phone")
	WebElement phonenumber;
	
	@FindBy(xpath = "//button[@data-track='Create Account']")
	WebElement createaccount;
	
	
	public RegisterPage(WebDriver driver) {
		this.driver =driver;
	PageFactory.initElements(driver,this);
	}
	public RegisterPage Firstname(String frirstname) {
		
		return this;
	}
	public RegisterPage Lastname(String lastname) {
	
		return this;
	}
	public RegisterPage email(String email) {
		
		return this;
	}
	public RegisterPage passward(String password) {
		
		return this;
	}
	public RegisterPage conformpasword(String confirmpassword) {
		
		return this;
	}
	public RegisterPage mobilnumber(String mobilenumber) {
		
		return this;
	}
	public void createAccount() {
		createaccount.click();
	}
	}

