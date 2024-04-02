package com.qa.tutorialsninja.s1.testbase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.qa.tutorialsninja.s1.utilities.TutorialsNinja_S1_Utilities;

public class TutorialsNinja_S1_TestBase {
	public static WebDriver driver;
	public static ChromeOptions OptionsC;
	public static FirefoxOptions OptionsF;
	public static EdgeOptions OptionsE;
	public Properties configprop;
	public FileInputStream ip;
	
	public TutorialsNinja_S1_TestBase() throws Exception {
		configprop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\tutorialnsninja_s1\\configurations\\tutorialsninja_S1_configurations.properties");
		configprop.load(ip);
	}
	public WebDriver initializeAndOpenBrowser(String browserName) {
		if(browserName.equalsIgnoreCase(configprop.getProperty("browserName1"))) {
			OptionsC = new ChromeOptions();
			OptionsC.addArguments("--incognito");
			OptionsC.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver = new ChromeDriver(OptionsC);
		}else if (browserName.equalsIgnoreCase(configprop.getProperty("browserName2"))) {
			OptionsF = new FirefoxOptions();
			OptionsF.addArguments("--incognito");
			OptionsF.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver = new FirefoxDriver(OptionsF);
		}else if(browserName.equalsIgnoreCase(configprop.getProperty("browserName3"))) {
			OptionsE = new EdgeOptions();
			OptionsE.addArguments("--incognito");
			OptionsE.setPageLoadStrategy(PageLoadStrategy.EAGER);
			driver = new EdgeDriver(OptionsE);
		}
		driver.manage().window().maximize();
		driver.get(configprop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TutorialsNinja_S1_Utilities.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TutorialsNinja_S1_Utilities.PAGELOAD_WAIT_TIME));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(TutorialsNinja_S1_Utilities.SCRIPTLOAD_TIME));
		driver.manage().deleteAllCookies();
		return driver;
		
			
			
		}
		
		
	}
	



