package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginScreenLocators {


	@FindBy(how = How.NAME,using="user-name")
	public WebElement enterUserName;
	
	@FindBy(how = How.NAME,using="password")
	public WebElement enterPassword;
	
	@FindBy(how =How.XPATH,using="*//input[@id='login-button']")
	public WebElement clickLogin;
		
	@FindBy(how = How.XPATH,using = "//div[text()='Swag Labs']")
	public WebElement findLoginText;
	
	
	
}
