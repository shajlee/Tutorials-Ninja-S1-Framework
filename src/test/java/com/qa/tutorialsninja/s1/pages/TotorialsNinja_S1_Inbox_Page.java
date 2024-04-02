package com.qa.tutorialsninja.s1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotorialsNinja_S1_Inbox_Page {
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
	
	@FindBy(linkText = "My Account")
	private WebElement myAccountMessage;
	
	public TotorialsNinja_S1_Inbox_Page(WebDriver driver) {
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
	public WebElement myAccount() {
		return myAccountMessage;
	}
	public boolean myAccountMessageIsDisplayed() {
		boolean displayStatus = myAccountMessage.isDisplayed();
		return displayStatus;
	}
}


