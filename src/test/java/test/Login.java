package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Login
{

	
	
	
	@BeforeTest
	
	public void Stup()
	{
		System.out.println("Open the Google ");
		
	}
	
	@Test
	
	public void login()
	{
System.setProperty("webdriver.chrome.driver","D:\\Divyanshu\\Software\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();				
		driver.get("https://www.google.co.in");
		
	}
	
	
	
}
	

