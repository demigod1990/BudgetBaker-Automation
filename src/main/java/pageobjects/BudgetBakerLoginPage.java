package pageobjects;

import org.openqa.selenium.By;

import drivermanager.DriverManager;

public class BudgetBakerLoginPage {
	
	private final By input_login_email = By.cssSelector("input[name='email']");
	private final By input_login_password = By.cssSelector("input[name='password']");
	private final By btn_login = By.cssSelector("button[type='submit']");
	private final By btn_confirmCurrency = By.cssSelector("button[type='submit']");
	private final By input_cashBalance = By.cssSelector("input[name='cashBalance']");
	private final By btn_confirmCashBalance = By.cssSelector("button[type='submit']");
	private final By btn_continueDashboard = By.xpath("//button[contains(text(),'Continue to Dashboard')]");
	
	public BudgetBakerLoginPage enterEmail(String data) {
		DriverManager.getDriver().findElement(input_login_email).typeText(data);
		return this;
	}
	
	public BudgetBakerLoginPage enterPassword(String data) {
		DriverManager.getDriver().findElement(input_login_password).typeText(data);
		return this;
	}
	
	public BudgetBakerLoginPage clickbtnLogin() {
		DriverManager.getDriver().findElement(btn_login).click();
		return this;
	}
	
	public BudgetBakerLoginPage clickbtnConfirmCurrency() {
		DriverManager.getDriver().findElement(btn_confirmCurrency).click();
		return this;
	}
	
	public BudgetBakerLoginPage enterCashBalance(String data) {
		DriverManager.getDriver().findElement(input_cashBalance).typeText(data);
		return this;
	}
	
	public BudgetBakerLoginPage clickbtnConfirmBalance() {
		DriverManager.getDriver().findElement(btn_confirmCashBalance).click();
		return this;
	}
	
	public BudgetBakerLoginPage clickbtnContinueDashboard() {
		DriverManager.getDriver().executeJsClick(btn_continueDashboard);
		return this;
	}
	
}
