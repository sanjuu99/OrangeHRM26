package  Lab04_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_By_Index
{
	
	static WebDriver driver;
	String TestUrl = "https://opensource-demo.orangehrmlive.com/";
	String Username = "Admin", Password = "admin123";
	String Location_Name = "Hyderabad";
		

	@Test
	public void Test1() throws Exception {
		
		Dropdown_By_Index T1 = new Dropdown_By_Index();
		T1.OpenChromeBrowser();
		T1.OpenOrangeHRM(TestUrl);
		T1.Login(Username, Password);
		T1.AddLocation(Location_Name);
		
	}
	
	
	   public void OpenChromeBrowser() throws Exception {
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	   }
	   
		public void OpenOrangeHRM (String TestUrl1) throws Exception {
		driver.get(TestUrl1);
		}
		
		public void Login (String Username1, String Password1) throws Exception {
		findElement(By.name("txtUsername")).sendKeys(Username1);
		findElement(By.id("txtPassword")).sendKeys(Password1);
		findElement(By.id("btnLogin")).click();	
		}
		
		public void AddLocation(String Location_Name1) throws Exception {
		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Organization")).click();
		findElement(By.linkText("Locations")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("location_name")).sendKeys(Location_Name);
        
		Select dropdown2 = new Select(driver.findElement(By.id("location_country")));
		
		dropdown2.selectByIndex(2);
		
	}
			public  WebElement findElement(By by) throws Exception {
				
			    WebElement elem = driver.findElement(by);
			    	    
			    // draw a border around the found element
			    if (driver instanceof JavascriptExecutor) {
			        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			        
			        
			    }
			    return elem;
			}
			

}


