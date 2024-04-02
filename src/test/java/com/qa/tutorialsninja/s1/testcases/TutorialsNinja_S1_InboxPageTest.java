package com.qa.tutorialsninja.s1.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.tutorialsninja.s1.pages.TotorialsNinja_S1_Inbox_Page;
import com.qa.tutorialsninja.s1.testbase.TutorialsNinja_S1_TestBase;

public class TutorialsNinja_S1_InboxPageTest extends TutorialsNinja_S1_TestBase {
	
	public TutorialsNinja_S1_InboxPageTest() throws Exception {
		super();
		
	}

	public static SoftAssert softAssert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		driver = initializeAndOpenBrowser(configprop.getProperty("browserName1"));
		TotorialsNinja_S1_Inbox_Page inbox = new TotorialsNinja_S1_Inbox_Page(driver);
		inbox.clickOnMyAccountLink();
	}
	@Test(priority =1)
	public void loginAndPresenceofMyAccountMessage() {
		TotorialsNinja_S1_Inbox_Page inbox = new TotorialsNinja_S1_Inbox_Page(driver);
		inbox.clickOnLoginLink();
		inbox.enterUsername(configprop.getProperty("validUsername"));
		inbox.enterPassword(configprop.getProperty("validPassword"));
		inbox.clickOnLoginButton();
		WebElement myAccountMessage = inbox.myAccount();
		softAssert.assertTrue(inbox.myAccountMessageIsDisplayed(), "My Account Message is not displayed"); 
		
		if(myAccountMessage.isDisplayed()) {
			System.out.println("Inbox page is functional");
		}else {
			System.out.println("Inbox Page is not functional");
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		}
		
	}
	
	


