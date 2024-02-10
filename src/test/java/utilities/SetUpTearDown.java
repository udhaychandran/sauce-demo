package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUpTearDown {

	WebDriver driver = new ChromeDriver();
	public final static int Timeouts = 10;
	
	public SetUpTearDown(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public void setUp() throws InterruptedException {
		
		WebDriverManager.chromedriver().clearDriverCache().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Timeouts));
		driver.manage().window().maximize();
		
	}
	
	public void launchApplication() {
		driver.get("https://www.saucedemo.com/");
	}
	
	public void tearDown() {
		driver.quit();
	}
}
