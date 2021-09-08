package  Lab29_PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Employee
{
	
	WebDriver driver;
	
	public void Employee(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public  void AddEmployee() throws Exception
	{
	
		findElement(By.id("menu_pim_viewPimModule")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("firstName")).sendKeys("Java");
		findElement(By.id("lastName")).sendKeys("Java123");
		findElement(By.id("btnSave")).click();
	}
	
	
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
	

}












