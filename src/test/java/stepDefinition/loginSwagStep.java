package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.LoginScreen;
import pom.LoginScreenPOM;
import utilities.HelperClass;


public class loginSwagStep{
	WebDriver driver;
	//SetUpTearDown setupTearDown;
	LoginScreenPOM loginScreenPOM;
	WebDriverWait wait = null;
	WebElement element;
	@Given("I launch the {string} of the application")
	public void i_launch_the_of_the_application(String url) throws InterruptedException {
		
		WebDriverManager.chromedriver().clearDriverCache().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();;
		driver.get(url);
		
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String username, String password) { 
		
		loginScreenPOM = new LoginScreenPOM(driver);
		loginScreenPOM.enterUserName(username);
		loginScreenPOM.enterPassword(password);
		loginScreenPOM.clickLogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}


	@Then("I should be able to login successfully.")
	public void i_should_be_able_to_login_successfully() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		loginScreenPOM.postLoginElement();
		loginScreenPOM.clickLogout();		
		driver.quit();
	}

}
