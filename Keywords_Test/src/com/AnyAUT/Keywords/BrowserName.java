package com.AnyAUT.Keywords;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserName {

 WebDriver driver;

 @BeforeTest
 public void setup(){

//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/Browsers/Win/chromedriver.exe");
//		driver = new ChromeDriver();
		
	  	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Browsers/Win/geckodriver.exe");
		driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/Browsers/Win/MicrosoftWebDriver.exe");
//		driver = new EdgeDriver();
		
		//Check and print Firefox browser and OS detail.
  CheckBrowserOS();
  driver.close();
  
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/Browsers/Win/chromedriver.exe");
	driver = new ChromeDriver();
  //Check and print Chrome browser and OS detail.
  CheckBrowserOS();
  driver.close();
  
	System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/Browsers/Win/MicrosoftWebDriver.exe");
	driver = new EdgeDriver();
  //Check and print Edge browser and OS detail.
  CheckBrowserOS();
  driver.close();
 }

//@BeforeTest 
 public void CheckBrowserOS() {
  //Get Browser name and version.
	String browserName;
	try {
  Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
   browserName = caps.getBrowserName();
   System.out.println("Browser "+browserName);
 // String browserVersion = caps.getVersion();
	}
	catch(Exception e) {
		System.out.println("Exception is "+e);
	}
	
	driver.get("https://www.google.com");
  //Get OS name.
  String os = System.getProperty("os.name").toLowerCase();
  //System.out.println("OS = " + os + ", Browser = " + browserName + " "+ browserVersion);
 } 
}
