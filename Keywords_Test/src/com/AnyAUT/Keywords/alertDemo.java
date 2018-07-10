package com.AnyAUT.Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

public class alertDemo {
	
	static WebDriver driver;
	static Alert alert;
	
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									

//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "/Browsers/Win/chromedriver.exe");
//		driver = new ChromeDriver();
		
	  	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Browsers/Win/geckodriver.exe");
		driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/Browsers/Win/MicrosoftWebDriver.exe");
//		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("http://demo.guru99.com/selenium/delete_customer.php");			
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
        
        // Alert Message handling
        driver.findElement(By.name("cusid")).sendKeys("53920");	
                
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert        
        //driver.switchTo().alert();	
       

        
       System.out.println(isAlertPresent() + " - Alert Status before switching");
       

//		//alert = driver.switchTo().alert();
//
        System.out.println("Switched to alert - " + getAlertText());

        switchToAlert();

        System.out.println(isAlertPresent() + " - Alert Status after switching");
	       confirmAlert();

//        // Capturing alert message.    
//       // String alertMessage= driver.switchTo().alert().getText();		
//        		
//        String alertMessage = getAlertText();
//        // Displaying alert message		
//        System.out.println("captured alert message " + alertMessage);	
//        Thread.sleep(1000);
//        		       
//        // Accepting alert		
//        alert.accept();	
//        
//        System.out.println(isAlertPresent() + " Alert Status after accepted");

    }	
	
public static String getAlertText() {
		
	if (isAlertPresent()) {
		System.out.println("Switched and got text");

		return driver.switchTo().alert().getText(); 
		}
	else System.out.println("No such alert"); 
	return "";
	//alert.getText();
	}
	
	public static void dismissAlert() {
		// This function will dismiss the Simple Alert/Confirm Alert box/Prompt Alert and user can continue 
		// operations with main window
		if (isAlertPresent()) {
			driver.switchTo().alert().dismiss(); 
			System.out.println("Dismissed");
			}
		else System.out.println("No such alert");
	}

	public static void confirmAlert() {
		// This function will Confirm the Simple Alert/Confirm Alert box/Prompt Alert and user can continue
		// operations with main window
		alert.accept();
	}
	
	//This keyword verifies the alert message against a test data
	public String verifyAlertText(String data) {
						
	// This method should be used only if SwitchtoAlert Method return true ;
	if (alert.getText().equalsIgnoreCase(data))
		return "Pass";
	// This returns the text displayed on Simple Alert/Confirm Alert box/Prompt Alert box
	else
		return "Fail";
}
	
	public static boolean isAlertPresent() {
		//String foundAlert = "Fail";
		WebDriverWait wait = new WebDriverWait(driver, 5);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			return true;
			//foundAlert = "Pass";
		} catch (TimeoutException eTO) {
			//foundAlert = "Fail";
		}
		return false;
		//return foundAlert;

	}
	
	public static void switchToAlert() {
		// Switch to SimpleAlert/Confirm Alert box/Prompt Alert box
		if (isAlertPresent()) {
			alert = driver.switchTo().alert();
			System.out.println("Switched!!");
		}
		else {
			System.out.println("Cannot switch to Alert : No alert present!");
		}

	}

}
		