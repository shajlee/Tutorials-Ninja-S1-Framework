package com.qa.tutorialsninja.s1.testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.tutorialsninja.s1.pages.TotorialsNinja_S1_Links_Page;
import com.qa.tutorialsninja.s1.testbase.TutorialsNinja_S1_TestBase;

public class TutorialsNinja_S1_LinksPageTest extends TutorialsNinja_S1_TestBase {

	public TutorialsNinja_S1_LinksPageTest() throws Exception {
		super();
		
	}
	public static SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		driver = initializeAndOpenBrowser(configprop.getProperty("browserName1"));
	}
	@Test(priority = 1)
	public void linkTests() {
		TotorialsNinja_S1_Links_Page links = new TotorialsNinja_S1_Links_Page(driver);
		links.clickOnDesktopsLink();
		links.clickOnAllDesktopsLink();
		
		WebElement hpLaptop = links.HPLaptop();
		softassert.assertTrue(hpLaptop.isDisplayed(), "hpLaptop is not displayed");
		softassert.assertAll();
		
		driver.navigate().back();
		
		links.clickOnlaptopsAndNotebooksLink();
		links.clickOnAllLaptopsAndNotebooksLink();
		
		WebElement macbookLaptop = links.macbookLaptop();
		softassert.assertTrue(macbookLaptop.isDisplayed(), "macbookLaptop is not displayed");
		softassert.assertAll();
		
		driver.navigate().back();
		
		links.clickOnComponentsLink();
		links.clickOnAllComponentsLink();
		links.clickOnMonitorsLink();
		
		WebElement monitors = links.appleMonitor();
		softassert.assertTrue(monitors.isDisplayed(), "monitors is not displayed");
		softassert.assertAll();
		
		driver.navigate().back();
		
		links.clickOnTabletsLink();
		WebElement samsungTablet = links.samsungTablet();
		softassert.assertTrue(samsungTablet.isDisplayed(), "samsungTablet is not displayed");
		softassert.assertAll();
		
		driver.navigate().back();
		
		links.clickOnSoftWareLink();
		WebElement softwareMessage = links.softwareLinkMessage();
		softassert.assertTrue(softwareMessage.isDisplayed(), "softwareMessage is not displayed");
		softassert.assertAll();
		
		driver.navigate().back();
		
		links.clickOnPhoneAndPDASLink();
		WebElement iphone = links.iphone();
		softassert.assertTrue(iphone.isDisplayed(), "iphone is not displayed");
		softassert.assertAll();
		
		driver.navigate().back();
		
		links.clickOnCamerasLink();
		WebElement canonCamera = links.canonCamera();
		softassert.assertTrue(canonCamera.isDisplayed(), "canonCamera is not displayed");
		softassert.assertAll();
		
		driver.navigate().back();
		
		List<WebElement>mp3PlayersLink = links.MP3Link();
		for(int i=0;i<mp3PlayersLink.size(); i++) {
			if(mp3PlayersLink.get(i).getAttribute("class").equalsIgnoreCase("dropdown-toggle")) {
				mp3PlayersLink.get(i).click();
				break;
			}
		
		links.clickOnAllMP3Link();
		
		WebElement iPodClassic = links.ipodClassic();
		softassert.assertTrue(iPodClassic.isDisplayed(), "iPodClassic is not displayed");
		softassert.assertAll();
		
		System.out.println("All Links are Functional");
		}
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();


		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
