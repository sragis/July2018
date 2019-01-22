package firstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveHover_BookMeds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Ragi\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://bookmeds.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='searchiconmainpage']")).click();
		
		WebElement element = driver.findElement(By.xpath(".//div[@id='headerMenuParent']/div/ul[1]/li[2]/span"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
      //  driver.findElement(By.xpath("//*[@id='headerMenuParent']/div/ul/li[2]/div/div/div[1]/div[2]/a/img"));

        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        WebElement productsMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Home Care']")));
        
        //Click on the first image on the sub menu item home care under products	
        driver.findElement(By.xpath("//a[@title='Show products in category Home Care']")).click();
        
        //Comment above line before uncommenting below line for wheel chairs 
        //They wont work together as you already clicked on menu
        //To click menu item "Wheel Chairs" under products/home care 

       // driver.findElement(By.xpath("//a[@title='Wheel Chairs']")).click();
	}

}
