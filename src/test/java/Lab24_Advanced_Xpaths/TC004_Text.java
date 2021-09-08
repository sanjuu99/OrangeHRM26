package Lab24_Advanced_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC004_Text {
	
	WebDriver driver;
	
	//String Nationality_xpath ="//a[text()='Nationalities']";
	//String Nationality_xpath1 ="//*[text()='Nationalities']";
	
	//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	
	//<input name="txtUsername" id="txtUsername" type="text">
	
	//input[@name='txtUsername'  and  @id='txtUsername']
	
	//String Login_Xpath="//*[@type='submit' or @name='btnReset']";
	String 	Login1_Xpath1="//input[@type='submit' and @name='Submit']";
	
	//<input type="button" class="" id="btnAdd" name="btnAdd" value="Add">
	//String ButtonAdd = "//input[@type='button' and @name='btnAdd']";

	
	@Test
	public void Test1()throws Exception
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.xpath(Login1_Xpath1)).click();	
	
		
		//<input type="button" class="" id="btnAdd" name="btnAdd" value="Add">
		//<b>Admin</b>  //Copied Admin web element
		findElement(By.xpath("//b[text()='Admin']")).click(); //written using Text keyword
		
		//<a href="/index.php/admin/nationality" id="menu_admin_nationality">Nationalities</a>
		
		//Copied Nationalities web element
		findElement(By.xpath("//a[text()='Nationalities']")).click();// written using Text keyword
		
		//<input type="button" class="" id="btnAdd" name="btnAdd" value="Add"> (Copied element)
		
		findElement(By.xpath("//input[@type='button'and @value='Add']")).click();
		
		// 9 results are there so used and operator in add button operation
		    

	}
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
					
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	
	
	
}
