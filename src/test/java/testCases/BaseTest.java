package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.GlobalConstants;
import decorators.Driver;
import decorators.DriverBase;
import decorators.DriverLogger;
import drivermanager.DriverManager;
import logsetup.Log;
import pageobjects.BudgetBakerLoginPage;
import util.PropertyFileReader;

public class BaseTest {
	
	public Driver driver;
	
	protected BudgetBakerLoginPage budgetbakerLoginPage;
	
	String url = PropertyFileReader.readFile(GlobalConstants.CONFIG).get("url").toString();
	
	@Parameters({"browser"})
	@BeforeMethod
	public void testInit() {
		
		// Setup the driver of type Driver
		driver = new DriverLogger(new DriverBase());
		
		// Add the Driver to Threadlocalmap from DriverManager
		DriverManager.setDriver(driver);
		Log.info("Driver set up Successfull.");
		
		// Getting the driver from the Threadlocal internal hashmap
		String browser = "chrome";
		DriverManager.getDriver().start(browser);
		Log.info("Browser "+browser+" started.");
		
		DriverManager.getDriver().goToUrl(url);
		Log.info("URL \" "+browser+" \" launched.");
		
		budgetbakerLoginPage = new BudgetBakerLoginPage();
		
	}
	
	@AfterMethod
	public void testCleanup() {
		if (DriverManager.getDriver() != null) {
			DriverManager.removeDriver();
		}
		Log.info("Driver quit successfully.");

	}

}
