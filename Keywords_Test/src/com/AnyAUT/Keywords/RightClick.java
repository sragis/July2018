package com.AnyAUT.Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RightClick {
	
	WebDriver driver;
	
  @Test
  public void contextClick() {
		// You can use this function for doing right click on any Webelement
		WebElement rightClick = driver.findElement(By.xpath("//img[@id='hplogo']"));
		
		Actions action = new Actions(driver);
		Action a1 = action.contextClick(rightClick).build();
		a1.perform();

//		Actions action= new Actions(driver); 
//		action.contextClick(rightClick).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
	}
  
  @BeforeClass
  public void SetUp() {

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/Browsers/Win/chromedriver.exe");
			driver = new ChromeDriver();
			
//		  	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Browsers/Win/geckodriver.exe");
//			driver = new FirefoxDriver();
//			
//			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/Browsers/Win/MicrosoftWebDriver.exe");
//			driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.manage().deleteAllCookies();

  }

  @AfterClass
  public void afterClass() {
  }


}
