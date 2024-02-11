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
	LoginScreenLocators loginScreenLoc;
	
	public LoginScreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String strUserName) {
		
		loginScreenLoc.enterUserName.sendKeys(strUserName);
		
		
	}
	public void enterPassword(String strPassword) {
		
		loginScreenLoc.enterPassword.sendKeys(strPassword);		
		
	}
	public void clickLogin() {
		loginScreenLoc.clickLogin.click();
	}
	
	public String loginText() {
		return loginScreenLoc.findLoginText.getText();	
	}
	
	
}
