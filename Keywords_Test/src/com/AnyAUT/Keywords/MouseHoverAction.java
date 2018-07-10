package com.AnyAUT.Keywords;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseHoverAction {
	WebDriver driver;
	  @Test
  public void mouseHover() {
		WebElement menu =driver.findElement(By.linkText("FREELANCERS"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).build().perform();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//	    WebElement menuItem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Find Projects")));
//	    menuItem.click();
		
	    //Below line throws ElementNotInteractableException without explicit wait
		//driver.findElement(By.linkText("Find Projects")).click();
		
		//FREELANCERS is a dropdown; use Select Class
		
		//Select menuFreelancer = new Select(driver.findElement(By.className("fre-menu-freelancer dropdown")));
//		
//		Select menuFreelancer= new Select(driver.findElement(By.xpath("//li[@class='fre-menu-freelancer dropdown']"))) ; 
//
//		menuFreelancer.selectByVisibleText("FIND PROJECTS");
//		
//		driver.findElement(By.linkText("Find Projects")).click();
		
		WebElement subMenu = driver.findElement(By.xpath("//li[@class='fre-menu-freelancer dropdown']/ul/li[1]"));
		 
	 //   WebElement subMenu = driver.findElement(By.linkText("Find Projects"));
		
	    action.moveToElement(subMenu).click().perform();
	      
	     //Both the below implementations are right
	     
//	     action.moveToElement(subMenu);
//	     action.click();
//	 	 action.perform();
	     
//	      action.moveToElement(subMenu)
//	     		.click()
//	     		.perform();
		
	}

  
  @BeforeClass
  public void SetUp() {

//			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/Browsers/Win/chromedriver.exe");
//			driver = new ChromeDriver();
			
		  	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Browsers/Win/geckodriver.exe");
			driver = new FirefoxDriver();
			
//			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/Browsers/Win/MicrosoftWebDriver.exe");
//			driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://qaonair.com/");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			driver.manage().deleteAllCookies();
			
			mouseHover();

  }

  @AfterClass
  public void afterClass() {
  }

}
