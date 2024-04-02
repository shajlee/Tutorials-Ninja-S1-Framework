package com.qa.tutorialsninja.s1.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.tutorialsninja.s1.pages.TotorialsNinja_S1_Search_Page;
import com.qa.tutorialsninja.s1.testbase.TutorialsNinja_S1_TestBase;

public class TutorialsNinja_S1_SearchPageTest extends TutorialsNinja_S1_TestBase {

	public TutorialsNinja_S1_SearchPageTest() throws Exception {
		super();
		
	}
	public static SoftAssert softAssert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		driver = initializeAndOpenBrowser(configprop.getProperty("browserName1"));
	}
	@Test(priority = 1)
	public void searchWithValidProduct() {
		TotorialsNinja_S1_Search_Page search = new TotorialsNinja_S1_Search_Page(driver);
		search.enterValidProduct(configprop.getProperty("validProduct"));
		search.clickInSearchButton();
		WebElement validProduct = search.validProduct();
		softAssert.assertTrue(search.validProductIsDisplayed(), "Valid Product is Displayed");
		
		if(validProduct.isDisplayed()) {
			System.out.println("Valid Product search is functional");
		}else {
			System.out.println("Valid Product search is not functional");
		}
	}
	@Test(priority = 2)
	public void searchWithInvalidProduct() {
		TotorialsNinja_S1_Search_Page search = new TotorialsNinja_S1_Search_Page(driver);
		search.enterValidProduct(configprop.getProperty("invalidProduct"));
		search.clickInSearchButton();
		WebElement invalidProduct = search.invalidProduct();
		softAssert.assertTrue(search.invalidProductIsDisplayed(), "Invalid Product is not displayed");
		
		if(invalidProduct.isDisplayed()) {
			System.out.println("Invalid Product search is functional");
		}else {
			System.out.println("Invalid Product search is not functional");
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
		
	}


