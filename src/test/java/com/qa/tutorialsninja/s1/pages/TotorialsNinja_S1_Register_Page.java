package com.qa.tutorialsninja.s1.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotorialsNinja_S1_Register_Page  {
	public WebDriver driver;
	
	@FindBy(xpath = "//span[text() = 'My Account']")
	private WebElement myAccountLink;
	
	@FindBy(linkText = "Register")
	private WebElement registerButton;
	
	@FindBy(css = "input#input-firstname")
	private WebElement firstNameTextBox;
	
	@FindBy(css = "input#input-lastname")
	private WebElement lastNameTextBox;
	
	@FindBy(css = "input#input-email")
	private WebElement emailTextBox;
	
	@FindBy(css = "input#input-telephone")
	private WebElement telephoneTextBox;
	
	@FindBy(css = "input#input-password")
	private WebElement passewordTextBox;
	
	@FindBy(css = "input#input-confirm")
	private WebElement passwordConfirmationTextBox;
	
	@FindBy(css = "label.radio-inline input")
	private List <WebElement> newsLetterRadioButton;
	
	@FindBy(name = "agree")
	private WebElement privacyPolicyCheckbox;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement continueButton;
	
	@FindBy(css = "div#content h1")
	private WebElement accountCreationMessage;
	
	@FindBy(css = "div.alert.alert-danger.alert-dismissible")
	private WebElement privacyPolicyAgreementMessage;
	
	@FindBy(css = "input#input-firstname+div")
	private WebElement firstNameMessage;
	
	@FindBy(css = "input#input-lastname+div")
	private WebElement lastNameMessage;
	
	@FindBy(css = "input#input-email+div")
	private WebElement emailMessage;
	
	@FindBy(css = "input#input-telephone+div")
	private WebElement telephoneMessage;
	
	@FindBy(css = "input#input-password+div")
	private WebElement passwordMessage;
	
	public TotorialsNinja_S1_Register_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnMyAccountLink() {
		myAccountLink.click();
	}
	public void clickOnRegisterButton() {
		registerButton.click();
	}
	public void enterFirstName(String firstNameText) {
		firstNameTextBox.sendKeys(firstNameText);
	}
	public void enterLastName(String lastNameText) {
		lastNameTextBox.sendKeys(lastNameText);
	}
	public void enterEmail(String emailText) {
		emailTextBox.sendKeys(emailText);
	}
	public void enterTelephoneNumber(String telephoneNumberText) {
		telephoneTextBox.sendKeys(telephoneNumberText);
	}
	public void enterPassword(CharSequence passwordText) {
		passewordTextBox.sendKeys(passwordText);
	}
	public void confirmPassword(CharSequence passwordText) {
		passwordConfirmationTextBox.sendKeys(passwordText);
	}
	public void clickOnPrivacyPolicyCheckBox() {
		privacyPolicyCheckbox.click();
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public WebElement accountCreationMessage() {
		return accountCreationMessage;
	}
	public List <WebElement> newsLetterRadioButton() {
		return newsLetterRadioButton;
	}
	public WebElement privacyPolicyAgreementMessage() {
		return privacyPolicyAgreementMessage;
	}
	public WebElement firstNameMessage() {
		return firstNameMessage;
	}
	public WebElement lastNameMessage() {
		return lastNameMessage;
	}
	public WebElement emailMessage() {
		return emailMessage;
	}
	public WebElement telephoneMessage() {
		return telephoneMessage;
	}
	public WebElement passwordMessage() {
		return passwordMessage;
		
		
	}
	
	
	
	
		
		
	}


	