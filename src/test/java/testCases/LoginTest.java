package testCases;

import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import logsetup.Log;
import reports.ReportManager;

public class LoginTest extends BaseTest {
	
	@Test (description="TestCase01_LoginTest_ Test scenario for first time login", dataProvider="suiteDataProvider",dataProviderClass=dataproviders.Dataprovider.class)
	public void TestCase01_LoginTest(String email, String password, String cashBalance) {

		budgetbakerLoginPage.enterEmail(email);
		Log.info("Successfully Entered Email");
		ReportManager.getExtentTest().log(Status.INFO, "Successfully Entered Email");
		
		budgetbakerLoginPage.enterPassword(password);
		Log.info("Successfully Entered Password");
		ReportManager.getExtentTest().log(Status.INFO, "Successfully Entered Password");
		
		budgetbakerLoginPage.clickbtnLogin();
		Log.info("Successfully clicked login button");
		ReportManager.getExtentTest().log(Status.INFO, "Successfully clicked login button");
		
		budgetbakerLoginPage.clickbtnConfirmCurrency();
		Log.info("Successfully clicked confirm currency button");
		ReportManager.getExtentTest().log(Status.INFO, "Successfully clicked confirm currency button");
		
		budgetbakerLoginPage.enterCashBalance(cashBalance);
		Log.info("Successfully entered cash balance");
		ReportManager.getExtentTest().log(Status.INFO, "Successfully entered cash balance");
		
		budgetbakerLoginPage.clickbtnConfirmBalance();
		Log.info("Successfully clicked confirm cash balance button");
		ReportManager.getExtentTest().log(Status.INFO, "Successfully clicked confirm cash balance button");
		
		budgetbakerLoginPage.clickbtnContinueDashboard();
		Log.info("Successfully clicked continue to dashboard button");
		ReportManager.getExtentTest().log(Status.INFO, "Successfully clicked continue to dashboard button");
		
	}	

}
