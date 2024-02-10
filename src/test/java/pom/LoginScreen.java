package pom;

import static org.mockito.Mockito.never;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import locators.LoginScreenLocators;
import utilities.HelperClass;

public class LoginScreen {
	
	 WebDriver driver; 
	//LoginScreenLocators loginScreenLoc = new LoginScreenLocators();
	
	@FindBy(how = How.NAME,using="user-name")
	public WebElement enterUserName;
	
	@FindBy(how = How.NAME,using="password")
	public WebElement enterPassword;
	
	@FindBy(how =How.XPATH,using="*//input[@id='login-button']")
	public WebElement clickLogin;
		
	@FindBy(how = How.XPATH,using = "//div[text()='Swag Labs']")
	public WebElement findLoginText;
	
	public void enterUserName(String strUserName) {
		
		enterUserName.sendKeys(strUserName);
		
		
	}
	public void enterPassword(String strPassword) {
		
		enterPassword.sendKeys(strPassword);		
		
	}
	public void clickLogin() {
		clickLogin.click();
	}
	
	public String loginText() {
		return findLoginText.getText();	
	}
	
	public LoginScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
