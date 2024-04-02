package com.qa.tutorialsninja.s1.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.tutorialsninja.s1.pages.TotorialsNinja_S1_Login_Page;
import com.qa.tutorialsninja.s1.testbase.TutorialsNinja_S1_TestBase;
import com.qa.tutorialsninja.s1.testdata.TutorialsNinja_S1_TestDataSupply;
import com.qa.tutorialsninja.s1.utilities.TutorialsNinja_S1_Utilities;

public class TutorialsNinja_S1_LoginPageTest extends TutorialsNinja_S1_TestBase {
	
	public TutorialsNinja_S1_LoginPageTest() throws Exception {
		super();
		
	}

	public static SoftAssert softAssert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		driver = initializeAndOpenBrowser(configprop.getProperty("browserName1"));
		TotorialsNinja_S1_Login_Page login = new TotorialsNinja_S1_Login_Page(driver);
		login.clickOnMyAccountLink();
	}
	@Test(priority = 1, dataProvider = "TutorialsNinja_S1_DataProvider_DataSupply", dataProviderClass = TutorialsNinja_S1_TestDataSupply.class)
	public void loginWithValidCredentialsUsingDataProvider(String username, String password) {
		TotorialsNinja_S1_Login_Page login = new TotorialsNinja_S1_Login_Page(driver);
		login.clickOnLoginLink();
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLoginButton();
		WebElement accountInformation = login.accoutInformation();
		softAssert.assertTrue(login.accountInformationIsDisplayed(), "Account Infotmation is not displayed");
		softAssert.assertAll();
		
		if(accountInformation.isDisplayed()) {
			System.out.println("Login with Valid Credentials using DataProvider is functional");
		}else {
			System.out.println("Login with Valid Credentials using DataProvider is not fucntional");
		}
	}
	@Test(priority = 2, dataProvider = "TutorialsNinja_S1_ExcelSheet_DataSupply", dataProviderClass = TutorialsNinja_S1_TestDataSupply.class)
	public void loginWithValidCredentialsUsinExcelSheet(String username, String password) {
		TotorialsNinja_S1_Login_Page login = new TotorialsNinja_S1_Login_Page(driver);
		login.clickOnLoginLink();
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickOnLoginButton();
		WebElement accountInformation = login.accoutInformation();
		softAssert.assertTrue(login.accountInformationIsDisplayed(), "Account Infotmation is not displayed");
		softAssert.assertAll();
		
		if(accountInformation.isDisplayed()) {
			System.out.println("Login with Valid Credentials using ExcelSheet is functional");
		}else {
			System.out.println("Login with Valid Credentials using ExcelSheet is not fucntional");
		}
		
	}
    @Test(priority = 3)
	public void loginWithInvalidCredentials() {
		TotorialsNinja_S1_Login_Page login = new TotorialsNinja_S1_Login_Page(driver);
		login.clickOnLoginLink();
		login.enterUsername(TutorialsNinja_S1_Utilities.generateEmailWithTimeStamp());
		login.enterPassword(TutorialsNinja_S1_Utilities.generatePasswordWithTimeStamp());
		login.clickOnLoginButton();
		WebElement invalidCredentialsMessage = login.invalidCredentialsMessage();
		softAssert.assertTrue(login.invalidCredentialsMessageIsDisplayed(), "Invalid Credentials Message is not displayed");
		softAssert.assertAll();
		
		if(invalidCredentialsMessage.isDisplayed()) {
			System.out.println("Login with Invalid Credentials is functional");
		}else {
			System.out.println("Login with Invalid Credentials is not fucntional");
		}
	}
	@Test(priority = 4)
	public void loginWithValidUsernameInvalidPassword() {
		TotorialsNinja_S1_Login_Page login = new TotorialsNinja_S1_Login_Page(driver);
		login.clickOnLoginLink();
		login.enterUsername(configprop.getProperty("validUsername"));
		login.enterPassword(TutorialsNinja_S1_Utilities.generatePasswordWithTimeStamp());
		login.clickOnLoginButton();
		WebElement invalidPasswordMessage = login.invalidPasswordMessage();
		softAssert.assertTrue(login.invalidPasswordMessageIsDisplayed(), "Invalid Password Message is not displayed");
		softAssert.assertAll();
		
		if(invalidPasswordMessage.isDisplayed()) {
			System.out.println("Login with Invalid Password is functional");
		}else {
			System.out.println("Login with Invalid Password is not fucntional");
		}
	}
	@Test(priority = 5)
	public void loginWithInvalidUsernamevalidPassword() {
		TotorialsNinja_S1_Login_Page login = new TotorialsNinja_S1_Login_Page(driver);
		login.clickOnLoginLink();
		login.enterUsername(TutorialsNinja_S1_Utilities.generateEmailWithTimeStamp());
		login.enterPassword(configprop.getProperty("validPassword"));
		login.clickOnLoginButton();
		WebElement invalidUsernameMessage = login.invalidUsernameMessage();
		softAssert.assertTrue(login.invalidCredentialsMessageIsDisplayed(), "Invalid Username Message is not displayed");
		softAssert.assertAll();
		
		if(invalidUsernameMessage.isDisplayed()) {
			System.out.println("Login with Invalid Username is functional");
		}else {
			System.out.println("Login with Invalid Username is not fucntional");
		}
	}
	@Test(priority = 6)
	public void loginWithEmptyCrendtials() {
		TotorialsNinja_S1_Login_Page login = new TotorialsNinja_S1_Login_Page(driver);
		login.clickOnLoginLink();
		login.enterUsername("");
		login.enterPassword("");
		login.clickOnLoginButton();
		WebElement emptyCredentialsMessage = login.emptyCredentialsMessage();
		softAssert.assertTrue(login.emptyCredentialsMessageIsDisplayed(), "Empty Credentials Message is not displayed");
		softAssert.assertAll();
		
		if(emptyCredentialsMessage.isDisplayed()) {
			System.out.println("Login with Empty Credentials is functional");
		}else {
			System.out.println("Login with Empty Credentials is not fucntional");
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
		
		
		
		
		
		
	}
		
		
		
	}


