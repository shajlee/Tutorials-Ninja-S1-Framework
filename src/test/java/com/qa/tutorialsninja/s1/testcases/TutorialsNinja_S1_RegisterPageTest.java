package com.qa.tutorialsninja.s1.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.tutorialsninja.s1.pages.TotorialsNinja_S1_Register_Page;
import com.qa.tutorialsninja.s1.testbase.TutorialsNinja_S1_TestBase;
import com.qa.tutorialsninja.s1.utilities.TutorialsNinja_S1_Utilities;

public class TutorialsNinja_S1_RegisterPageTest extends TutorialsNinja_S1_TestBase  {

	public TutorialsNinja_S1_RegisterPageTest() throws Exception {
		super();
		
	}
   public static SoftAssert softAssert = new SoftAssert();
   
   @BeforeMethod
   public void setUp() {
	   driver = initializeAndOpenBrowser(configprop.getProperty("browserName1"));
	   TotorialsNinja_S1_Register_Page register = new TotorialsNinja_S1_Register_Page(driver);
	   register.clickOnMyAccountLink();
	   register.clickOnRegisterButton();
   }
   @Test(priority =1)
   public void registerWithMandotaryFields() {
	   TotorialsNinja_S1_Register_Page register = new TotorialsNinja_S1_Register_Page(driver);
	   register.enterFirstName(configprop.getProperty("firstName"));
	   register.enterLastName(configprop.getProperty("lastName"));
	   register.enterEmail(TutorialsNinja_S1_Utilities.generateRegistrationEmailWithTimeStamp());
	   register.enterTelephoneNumber(configprop.getProperty("telephoneNumber"));
	   register.enterPassword(configprop.getProperty("registrationPassword"));
	   register.confirmPassword(configprop.getProperty("registrationPassword"));
	   register.clickOnPrivacyPolicyCheckBox();
	   register.clickOnContinueButton();
	   
	   WebElement accountCreationMessage = register.accountCreationMessage();
	   softAssert.assertTrue(accountCreationMessage.isDisplayed(), "accountCreationMessage is not displayed");
	   softAssert.assertAll();
	   System.out.println("Registration with mandatory fields are functional");
   }
   
    @Test(priority =2)
	public void registerWithAllFields() throws Exception {
       TotorialsNinja_S1_Register_Page register = new TotorialsNinja_S1_Register_Page(driver);
 	   register.enterFirstName(configprop.getProperty("firstName"));
 	   register.enterLastName(configprop.getProperty("lastName"));
 	   register.enterEmail(TutorialsNinja_S1_Utilities.generateRegistrationEmailWithTimeStamp());
 	   register.enterTelephoneNumber(configprop.getProperty("telephoneNumber"));
 	   register.enterPassword(configprop.getProperty("registrationPassword"));
 	   register.confirmPassword(configprop.getProperty("registrationPassword"));
 	   
 	   List<WebElement>newsLetterRadioButton = register.newsLetterRadioButton();
 	   for(int i=0;i<newsLetterRadioButton.size(); i++) {
 		   if(newsLetterRadioButton.get(i).getAttribute("value").equalsIgnoreCase("1")) {
 			  newsLetterRadioButton.get(i).click();
 			  break;
 		   }
 		Thread.sleep(2000);   
 		register.clickOnPrivacyPolicyCheckBox();
 		register.clickOnContinueButton();
 		 
 	   WebElement accountCreationMessage = register.accountCreationMessage();
 	   softAssert.assertTrue(accountCreationMessage.isDisplayed(), "accountCreationMessage is not displayed");
 	   softAssert.assertAll();
 	   System.out.println("Registration with all fields are functional");
 		   }
 	   }
    @Test(priority = 3)
    public void registerWithNoFields() {
    	TotorialsNinja_S1_Register_Page register = new TotorialsNinja_S1_Register_Page(driver);
    	register.clickOnContinueButton();
    	
    	WebElement privacyPolicyMessage = register.privacyPolicyAgreementMessage();
    	softAssert.assertTrue(privacyPolicyMessage.isDisplayed(), "privacyPolicyMessage is not displayed");
    	softAssert.assertAll();
    	
    	WebElement firstNameMessage = register.firstNameMessage();
    	softAssert.assertTrue(firstNameMessage.isDisplayed(), "firstNameMessage is not displayed");
    	softAssert.assertAll();
    	
    	WebElement lastNameMessage = register.lastNameMessage();
    	softAssert.assertTrue(lastNameMessage.isDisplayed(), "lastNameMessage is not displayed");
    	softAssert.assertAll();
    	
    	WebElement emailMessage = register.emailMessage();
    	softAssert.assertTrue(emailMessage.isDisplayed(), "emailMessage is not displayed");
    	softAssert.assertAll();
    	
    	WebElement telephoneMessage = register.telephoneMessage();
    	softAssert.assertTrue(telephoneMessage.isDisplayed(), "telephone message is not displayed");
    	softAssert.assertAll();
    	
    	WebElement passwordMessage = register.passwordMessage();
    	softAssert.assertTrue(passwordMessage.isDisplayed(), "Password message is not displayed");
    	softAssert.assertAll();
    	
    	System.out.println("Registration with no fields is functional");
    }
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    
    	
    	
    	
    	
    }
    	
		
		
	
	}
	
	
		
		
		
		
		
		
		
	
	
	
	
		


