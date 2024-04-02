package com.qa.tutorialsninja.s1.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.tutorialsninja.s1.pages.TotorialsNinja_S1_Logout_Page;
import com.qa.tutorialsninja.s1.testbase.TutorialsNinja_S1_TestBase;

public class TutorialsNinja_S1_LogoutPageTest extends TutorialsNinja_S1_TestBase {
	public TutorialsNinja_S1_LogoutPageTest() throws Exception {
		super();
		
	}

	public static SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		driver = initializeAndOpenBrowser(configprop.getProperty("browserName1"));
		TotorialsNinja_S1_Logout_Page logout = new TotorialsNinja_S1_Logout_Page(driver);
		logout.clickOnMyAccountLink();
	}
	@Test(priority = 1)
	public void logoutAndPresenceOfLogoutMessage() {
		TotorialsNinja_S1_Logout_Page logout = new TotorialsNinja_S1_Logout_Page(driver);
		logout.clickOnLoginLink();
		logout.enterUsername(configprop.getProperty("validUsername"));
		logout.enterPassword(configprop.getProperty("validPassword"));
		logout.clickOnLoginButton();
		logout.clickOnLogoutButton();
		WebElement logoutMessage = logout.logoutMessage();
		softassert.assertTrue(logout.logoutMessageIsDisplayed(), "log out message is not displayed");
		softassert.assertAll();
		
		if(logoutMessage.isDisplayed()) {
			System.out.println("Log out is functional");
		}else {
			System.out.println("Log out is not functional");
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		}
		
		
	}
	
	
	


