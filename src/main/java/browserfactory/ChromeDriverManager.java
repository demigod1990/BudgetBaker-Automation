package browserfactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDriverManager  implements BrowserManager{
	WebDriver driver;

	public WebDriver initDriver() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--headless");
//		chromeOptions.addArguments("-headed");
		chromeOptions.addArguments("--no-sandbox"); // Important in CI environments
		chromeOptions.addArguments("--disable-dev-shm-usage"); // To avoid memory issues
		chromeOptions.addArguments("--disable-gpu"); // Disables GPU hardware acceleration

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
		
	}

}