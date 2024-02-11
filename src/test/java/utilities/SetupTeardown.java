package utilities;

import java.time.Duration;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupTeardown {
	WebDriver driver;
	
	public void setUp() {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();;
	}
	
}
