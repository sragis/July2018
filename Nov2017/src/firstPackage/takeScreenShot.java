
package firstPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class takeScreenShot {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Ragi\\Selenium\\Drivers\\chromedriver.exe");
	//	driver = new ChromeDriver();
	//	driver.manage().window().maximize();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Ragi\\Selenium\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("TestNG Tutorials");
		
		takePageScreenShot(driver);
		  
		Thread.sleep(3000);
		//The getText() method is for retrieving a text node between element tags
		//The element is not text box, but warnings, labels etc
		//String text = driver.findElement(By.id("lst-ib")).getText();
		
		//In a textbox, typed/input text in textbox goes into the value attribute
		String text = driver.findElement(By.id("lst-ib")).getAttribute("value");
		
		//innerHTML does not work for text boxes
	//	String text = driver.findElement(By.id("lst-ib")).getAttribute("innerHTML");
	
	}
	
	public static void takePageScreenShot(WebDriver driver) {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		
		try {
			FileUtils.copyFile(src, new File("C://ScreenShot/ss1.jpg"));
			System.out.println("Screen shot taken!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception!");
			e.printStackTrace();
		}
		
		
	}
		
	
}
