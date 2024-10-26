package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentTest;

import constants.GlobalConstants;
import decorators.Driver;
import decorators.DriverBase;
import decorators.DriverLogger;
import drivermanager.DriverManager;
import logsetup.Log;
import pageobjects.BudgetBakerLoginPage;
import pageobjects.BudgetBakerLogoutPage;
import util.PropertyFileReader;

public class BaseTest {
	
	public Driver driver;
	
	protected BudgetBakerLoginPage budgetbakerLoginPage;
	protected BudgetBakerLogoutPage budgetbakerLogoutPage;
	
	String url = PropertyFileReader.readFile(GlobalConstants.CONFIG).get("url").toString();
	String browser = PropertyFileReader.readFile(GlobalConstants.CONFIG).get("browser").toString();
	ExtentTest extenttest;
	
	
	@Parameters({"browser"})
	@BeforeMethod
	public void testInit() {
		
		// Setup the driver of type Driver
		driver = new DriverLogger(new DriverBase());
		
		// Add the Driver to Threadlocalmap from DriverManager
		DriverManager.setDriver(driver);
		Log.info("Driver set up Successfull.");
		
		// Getting the driver from the Threadlocal internal hashmap
		DriverManager.getDriver().start(browser);
		Log.info("Browser "+browser+" started.");
		
		DriverManager.getDriver().goToUrl(url);
		Log.info("URL \" "+url+" \" launched.");
		
		budgetbakerLoginPage = new BudgetBakerLoginPage();
		budgetbakerLogoutPage = new BudgetBakerLogoutPage();
		
	}
	
	@AfterMethod
	public void testCleanup() {
		if (DriverManager.getDriver() != null) {
			DriverManager.removeDriver();
		}
		Log.info("Driver quit successfully.");

	}

}
