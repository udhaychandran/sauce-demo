package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pom.LoginScreen;
import pom.LoginScreenPOM;
import utilities.HelperClass;
import utilities.SetUpTearDown;

public class loginSwagStep{
	WebDriver driver;
	SetUpTearDown setupTearDown;
	LoginScreen loginScreen;
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
		
		loginScreen = new LoginScreen(driver);
		loginScreen.enterUserName(username);
		loginScreen.enterPassword(password);
		loginScreen.clickLogin();
	}


	@Then("I should be able to login successfully.")
	public void i_should_be_able_to_login_successfully() 
	{
		Assert.assertEquals(loginScreen.loginText(), "Swag Labs");
	}

}
