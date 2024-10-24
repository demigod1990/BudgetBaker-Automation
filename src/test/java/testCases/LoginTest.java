package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import logsetup.Log;
import pageobjects.BudgetBakerLoginPage;

public class LoginTest extends BaseTest {
	
	@Test (description="Login_Test")
	public void navigateToLoginpage() {

		budgetbakerLoginPage.enterEmail();
		Log.info("Successfully Entered Email");
		
	}	

}
