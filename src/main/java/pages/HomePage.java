package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecificationMethod;

public class HomePage extends ProjectSpecificationMethod {
	
	@FindBy(xpath = "(//img[@alt='United States']) [1]")
	WebElement selcountry;
	
	@FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
	WebElement accountbutton;
	
	@FindBy(linkText = "Create Account")
	WebElement registerpage;
	
    @FindBy(linkText = "Sign In")
    WebElement loginpage;
	
	
  public  HomePage(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver,this);
	  
  }
  public void selectcountry() {
	  selcountry.click();
  }

  public void AccountButton() {
	  accountbutton.click();
  }
  
  public RegisterPage createAccountButton() {
	  registerpage.click();
	  return new RegisterPage(driver) ;
  }
  public LoginPage Signinbutton() {
	  loginpage.click();
	  return new LoginPage(driver);
  }
  }
 
