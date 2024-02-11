package utilities;

import java.time.Duration;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

	private static HelperClass helperClass;
	private static WebDriver driver;
	public final static int Timeouts = 5;
	
	public HelperClass() {
		WebDriverManager.chromedriver().clearDriverCache().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Timeouts));
		driver.manage().window().maximize();
	}
	public static void openPage(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void tearDow() {
		if (driver!=null) {
			driver.quit();
		}
	}
}
