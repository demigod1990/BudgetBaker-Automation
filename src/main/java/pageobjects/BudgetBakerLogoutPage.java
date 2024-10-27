package pageobjects;

import org.openqa.selenium.By;
import drivermanager.DriverManager;

public class BudgetBakerLogoutPage {
	
	private final By btn_profileicon = By.cssSelector("div[role='listbox']");
	private final By btn_settings = By.xpath("//div[text()='Settings']");
	private final By btn_privacySettings = By.cssSelector("a[href='/settings/privacy1']");
	private final By btn_deleteUserData = By.xpath("//button[text()='Delete all user data']");
	private final By btn_delete = By.xpath("//button[text()='Delete']");
	private final By btn_ok = By.xpath("//button[text()='OK']");
	
	
	public BudgetBakerLogoutPage clickbtnProfileIcon() {
		DriverManager.getDriver().findElement(btn_profileicon).click();
		return this;
	}
	
	public BudgetBakerLogoutPage clickbtnSettings() {
		DriverManager.getDriver().findElement(btn_settings).click();
		return this;
	}
	
	public BudgetBakerLogoutPage clickbtnPrivacySettings() {
		DriverManager.getDriver().findElement(btn_privacySettings).click();
		return this;
	}
	
	public BudgetBakerLogoutPage clickbtnDeleteUserData() {
		DriverManager.getDriver().findElement(btn_deleteUserData).click();
		return this;
	}
	
	public BudgetBakerLogoutPage clickbtnDelete() {
		DriverManager.getDriver().findElement(btn_delete).click();
		return this;
	}
	
	public BudgetBakerLogoutPage clickbtnOk() {
		DriverManager.getDriver().findElement(btn_ok).click();
		return this;
	}

}
