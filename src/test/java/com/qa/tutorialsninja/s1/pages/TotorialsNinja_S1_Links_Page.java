package com.qa.tutorialsninja.s1.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TotorialsNinja_S1_Links_Page {
	public WebDriver driver;
	
	@FindBy(linkText = "Desktops")
	private WebElement desktopLink;
	
	@FindBy(linkText = "Show AllDesktops")
	private WebElement showAllDesktopsLink;
	
	@FindBy(linkText = "HP LP3065")
	private WebElement HPLaptop;
	
	@FindBy(linkText = "Laptops & Notebooks")
	private WebElement laptopLink;
	
	@FindBy(linkText = "Show AllLaptops & Notebooks")
	private WebElement showAllLaptopsLink;
	
	@FindBy(linkText = "MacBook")
	private WebElement macbookLaptop;
	
	@FindBy(linkText = "Components")
	private WebElement componentsLink;
	
	@FindBy(linkText = "Show AllComponents")
	private WebElement showAllComponentsLink;
	
	@FindBy(linkText = "Monitors (2)")
	private WebElement monitorsLink;
	
	@FindBy(css = "div#content h2")
	private WebElement appleMonitor;
	
	@FindBy(linkText = "Tablets")
	private WebElement tabletsLink;
	
	@FindBy(linkText = "Samsung Galaxy Tab 10.1")
	private WebElement samsungTablet;
	
	@FindBy(linkText = "Software")
	private WebElement softwareLink;
	
	@FindBy(css = "div#content h2")
	private WebElement softwareMessage;
	
	@FindBy(linkText = "Phones & PDAs")
	private WebElement phonesAndPDALink;
	
	@FindBy(linkText = "iPhone")
	private WebElement iphone;
	
	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement camerasLink;
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D']")
	private WebElement canonCamera;
	
	@FindBy(xpath = "//a[text() = 'MP3 Players']")
	private List <WebElement> mp3PlayersLink;
	
	@FindBy(xpath = "//a[text() = 'Show AllMP3 Players']")
	private WebElement showAllMP3PlayersLink;
	
	@FindBy(xpath = "//a[text()= 'iPod Classic']")
	private WebElement ipodClassic;
	
	public TotorialsNinja_S1_Links_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnDesktopsLink() {
		desktopLink.click();
	}
	public void clickOnAllDesktopsLink() {
		showAllDesktopsLink.click();
	}
	public WebElement HPLaptop() {
		return HPLaptop;
	}
	public void clickOnlaptopsAndNotebooksLink() {
		laptopLink.click();
	}
	public void clickOnAllLaptopsAndNotebooksLink() {
		showAllLaptopsLink.click();
	}
	public WebElement macbookLaptop() {
		return macbookLaptop;
	}
	public void clickOnComponentsLink() {
		componentsLink.click();
	}
	public void clickOnAllComponentsLink() {
		showAllComponentsLink.click();
	}
	public void clickOnMonitorsLink() {
		monitorsLink.click();
	}
	public WebElement appleMonitor() {
		return appleMonitor;
	}
	public void clickOnTabletsLink() {
		tabletsLink.click();
	}
	public WebElement samsungTablet() {
		return samsungTablet;
	}
	public void clickOnSoftWareLink() {
		softwareLink.click();
	}
	public WebElement softwareLinkMessage() {
		return softwareMessage;
	}
	public void clickOnPhoneAndPDASLink() {
		phonesAndPDALink.click();
	}
	public WebElement iphone() {
		return iphone;
	}
	public void clickOnCamerasLink() {
		camerasLink.click();
	}
	public WebElement canonCamera() {
		return canonCamera;
	}
	public List <WebElement> MP3Link() {
		return mp3PlayersLink;
	}
	public void clickOnAllMP3Link() {
		showAllMP3PlayersLink.click();
	}
	public WebElement ipodClassic() {
		return ipodClassic;
		
		
		
		
		
		
		
		
	}
	
	


}




