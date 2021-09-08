package  Lab03_Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class By_xpath_Locators
{
	
	static WebDriver driver;

	public static String UserName="//*[@id='txtUsername']";
	public static String Password="//*[@id='txtPassword']";
	public static String Loginbutton="//*[@id='btnLogin']";
	public static String Admin="//*[@id='menu_admin_viewAdminModule']/b";
	public static String Qualifications="//*[@id='menu_admin_Qualifications']";
	public static String viewSkills="//*[@id='menu_admin_viewSkills']";
	public static String SkillAddButton="//*[@id='btnAdd']";
	public static String SkillName="//*//*[@id='skill_name']";
	public static String SkillDescription="//*[@id='skill_description']";
	public static String SkillSaveButton="//*[@id='btnSave']";
	

	@Test
	public void xpath_Test () throws Exception {
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		
		findElement(By.xpath(UserName)).sendKeys("Admin");
		findElement(By.xpath(Password)).sendKeys("admin123");
		findElement(By.xpath(Loginbutton)).click();
		findElement(By.xpath(Admin)).click();
		findElement(By.xpath(Qualifications)).click();
		findElement(By.xpath(viewSkills)).click();
		findElement(By.xpath(SkillAddButton)).click();
		findElement(By.xpath(SkillName)).sendKeys("Selenium_Java");
		findElement(By.xpath(SkillDescription)).sendKeys("Selenium_Java Description");
		findElement(By.xpath(SkillSaveButton)).click();
		
		
		
		
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












