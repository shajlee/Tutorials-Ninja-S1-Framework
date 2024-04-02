package com.qa.tutorialsninja.s1.testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.tutorialsninja.s1.pages.TotorialsNinja_S1_Landing_Page;
import com.qa.tutorialsninja.s1.testbase.TutorialsNinja_S1_TestBase;

public class TutorialsNinja_S1_LandingPageTest extends TutorialsNinja_S1_TestBase {

	public TutorialsNinja_S1_LandingPageTest() throws Exception {
		super();

	}

	public static SoftAssert softAssert = new SoftAssert();

	@BeforeMethod
	public void setUp() {
		driver = initializeAndOpenBrowser(configprop.getProperty("browserName1"));
	}

	@Test(priority = 1)
	public void getPageTitleAndCurrentUrl() {
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		String actualTitle = configprop.getProperty("title");
		String expectedTitle = driver.getTitle();

		String actualUrl = configprop.getProperty("url");
		String expectedUrl = driver.getCurrentUrl();

		if (actualTitle.equals(expectedTitle) && actualUrl.equals(expectedUrl)) {
			System.out.println("The page is valid and functional");
		} else {
			System.out.println("The page is invalid and non-functional");
		}
	}

	@Test(priority = 2)
	public void presenceOfQAFoxLink() {
		TotorialsNinja_S1_Landing_Page landingPage = new TotorialsNinja_S1_Landing_Page(driver);
		WebElement qaFoxLink = landingPage.qafoxLink();
		softAssert.assertTrue(landingPage.qaFoxLinkIsDisplayed(), "QA Fox Link is not displayed");

		if (qaFoxLink.isDisplayed()) {
			System.out.println("Landing page validates the presence of QA Fox Link");
		} else {
			System.out.println("Landing page does not validates the presence of QA Fox Link");
		}
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
