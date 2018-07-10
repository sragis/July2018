package firstPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordsAction {

		WebDriver driver;
				
	@Before
		public void setUp() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Tools\\Selenium Drivers\\chromedriver.exe");
		  	driver = new ChromeDriver();
		  	
		  	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  	driver.manage().window().maximize();
		  	driver.get("http://www.facebook.com");
	}

		  
	@Test
	public void getAllLinks(){
		    		// List<String> getAllLinks() 
		     List<WebElement> links = new ArrayList<WebElement>();
		     List<String> linkText = new ArrayList<String>();
		                
		                
		                        links = driver.findElements(By.tagName("a"));
		               // int before linkcount was missing 
		               int linkcount = links.size();
		               
		                for (int i = 0; i < links.size(); i++) {
		                	// print the texts of all the links on the console 
		                        linkText.add((links.get(i)).getText());
		                }
		                
		                System.out.println("inside llk" + linkText);
		                
		               // return linkText;
		                }   
	}


