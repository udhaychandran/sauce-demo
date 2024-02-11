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

public class LoginScreenPOM {
	
	 WebDriver driver; 
	//LoginScreenLocators loginScreenLoc = new LoginScreenLocators();
	By userName = By.name("user-name");
	By password = By.name("password");
	By login = By.name("login-button");
	By loginText = By.xpath("loginTxt");
	By loginMenu = By.name("react-burger-menu-btn");
	By logout = By.id("logout_sidebar_link");
	public LoginScreenPOM(WebDriver driver) {
		this.driver = driver;
	}
		
	
	public void enterUserName(String strUsername) {
		
		driver.findElement(userName).sendKeys(strUsername);		
		
	}
	public void enterPassword(String strPassword) {
		
		driver.findElement(password).sendKeys(strPassword);	
		
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}
	public String loginText() {
		return driver.findElement(loginText).getText();
	}
	public void postLoginElement() {
		driver.findElement(loginMenu).click();
	}
	public void clickLogout() {
		driver.findElement(logout).click();
	}
	
}
