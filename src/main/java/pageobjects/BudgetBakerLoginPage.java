package pageobjects;

import org.openqa.selenium.By;

import drivermanager.DriverManager;

public class BudgetBakerLoginPage {
	
	private final By login_email = By.cssSelector("input[name='email1']");

	
	
	public void enterEmail() {
		DriverManager.getDriver().findElement(login_email).typeText("subha.crmqa@gmail.com");
	}
	

	
}
