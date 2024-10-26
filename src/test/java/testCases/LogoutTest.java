package testCases;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import logsetup.Log;
import reports.ReportManager;

public class LogoutTest extends BaseTest {
	
	@Test (description="TestCase02_LogoutTest_ Test scenario for logout and clear all user data", dataProvider="suiteDataProvider",dataProviderClass=dataproviders.Dataprovider.class)
	public void TestCase02_LogoutTest(String email, String password) {
		
		budgetbakerLoginPage.enterEmail(email);
		budgetbakerLoginPage.enterPassword(password);
		budgetbakerLoginPage.clickbtnLogin();
		ReportManager.getExtentTest().log(Status.INFO, "Successfully logged in to application");
		
		budgetbakerLogoutPage.clickbtnProfileIcon();
		Log.info("Successfully clicked profile icon");
		ReportManager.getExtentTest().log(Status.INFO, "Successfully clicked profile icon");
		
		
		budgetbakerLogoutPage.clickbtnSettings();
		Log.info("Successfully clicked settings button");
		ReportManager.getExtentTest().log(Status.INFO, "Successfully clicked settings button");
		
		budgetbakerLogoutPage.clickbtnPrivacySettings();
		Log.info("Successfully clicked privacy settings button");
		ReportManager.getExtentTest().log(Status.INFO, "Successfully clicked privacy settings button");
		
		budgetbakerLogoutPage.clickbtnDeleteUserData();
		budgetbakerLogoutPage.clickbtnDelete();
		budgetbakerLogoutPage.clickbtnOk();
		Log.info("Successfully deleted user data");
		ReportManager.getExtentTest().log(Status.INFO, "Successfully deleted user data");
		
		
	}
	

}
