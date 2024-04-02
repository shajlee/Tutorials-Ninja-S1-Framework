package com.qa.tutorialsninja.s1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotorialsNinja_S1_Login_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//span[text() = 'My Account']")
	private WebElement myAccountLink;
	
	@FindBy(linkText = "Login")
	private WebElement loginLink;
	
	@FindBy(css = "input#input-email")
	private WebElement usernameTextBox;
	
	@FindBy(css = "input#input-password")
	private WebElement passwordTextBox;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement loginButton;
	
	@FindBy(linkText = "Edit your account information")
	private WebElement accountInformation;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement invalidCredentialsMessage;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement invalidPasswordMessage;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement invalidUsernameMessage;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement emptyCredentialsMessage;
	
	public TotorialsNinja_S1_Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnMyAccountLink() {
		myAccountLink.click();
	}
	public void clickOnLoginLink() {
		loginLink.click();
	}
	public void enterUsername(String usernameText) {
		usernameTextBox.sendKeys(usernameText);
	}
	public void enterPassword(CharSequence passwordText) {
		passwordTextBox.sendKeys(passwordText);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public WebElement accoutInformation() {
		return accountInformation;
	}
	public boolean accountInformationIsDisplayed() {
		boolean displayStatus = accountInformation.isDisplayed();
		return displayStatus;
	}
	public WebElement invalidCredentialsMessage() {
		return invalidCredentialsMessage;
	}
	public boolean invalidCredentialsMessageIsDisplayed() {
		boolean displayStatus = invalidCredentialsMessage.isDisplayed();
		return displayStatus;
	}
	public WebElement invalidPasswordMessage() {
		return invalidPasswordMessage;
	}
	public boolean invalidPasswordMessageIsDisplayed() {
		boolean displayStatus = invalidPasswordMessage.isDisplayed();
		return displayStatus;
	}
	public WebElement invalidUsernameMessage() {
		return invalidUsernameMessage;
	}
	public boolean invalidUsernameMessageIsDisplayed() {
		boolean displayStatus = invalidUsernameMessage.isDisplayed();
		return displayStatus;	
	}
	public WebElement emptyCredentialsMessage() {
		return emptyCredentialsMessage;
	}
	public boolean emptyCredentialsMessageIsDisplayed() {
		boolean displayStatus = emptyCredentialsMessage.isDisplayed();
		return displayStatus;	
		
	}
}
	
	


