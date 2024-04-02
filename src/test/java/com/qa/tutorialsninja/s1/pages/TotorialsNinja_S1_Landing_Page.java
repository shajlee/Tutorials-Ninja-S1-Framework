package com.qa.tutorialsninja.s1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotorialsNinja_S1_Landing_Page {
	public WebDriver driver;
	
	@FindBy(linkText = "Qafox.com")
	private WebElement qafoxLink;
	
	public TotorialsNinja_S1_Landing_Page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement qafoxLink() {
		return qafoxLink;
	}
	public boolean qaFoxLinkIsDisplayed() {
		boolean displayStatus = qafoxLink.isDisplayed();
		return displayStatus;
		
	}

}
