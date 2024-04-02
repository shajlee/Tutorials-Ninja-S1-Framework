package com.qa.tutorialsninja.s1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotorialsNinja_S1_Search_Page {
	public WebDriver driver;
	
	@FindBy(name = "search")
	private WebElement searchBox;
	
	@FindBy(css = "span.input-group-btn button")
	private WebElement searchButton;
	
	@FindBy(linkText = "MacBook")
	private WebElement validProduct;
	
	@FindBy(css = "input#button-search+h2+p")
	private WebElement invalidProduct;
	
	public TotorialsNinja_S1_Search_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void enterValidProduct(String validProductText) {
		searchBox.sendKeys(validProductText);
	}
	public void clickInSearchButton() {
		searchButton.click();
	}
	public WebElement validProduct() {
		return validProduct;
	}
	public boolean validProductIsDisplayed() {
		boolean displayStatus = validProduct.isDisplayed();
		return displayStatus;
	}
	public WebElement invalidProduct() {
		return invalidProduct;
	}
	public boolean invalidProductIsDisplayed() {
		boolean displayStatus = invalidProduct.isDisplayed();
		return displayStatus;
		
	}
	
	
	

}
