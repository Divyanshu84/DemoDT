package test;


import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class flipcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Google.co.in");
		//driver.findElement(By.name("q")).sendKeys("Aditya ");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		
		/*
		 * driver.manage().window().maximize(); driver.get("https://www.flipkart.com/");
		 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		 * 
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung");
		 * driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		 * 
		 * 
		 * List<WebElement> e=
		 * driver.findElements(By.xpath("//select[@class='_2YxCDZ']")); Select range =
		 * new Select(e.get(1));
		 * 
		 * range.selectByValue("10000");
		 * 
		 * // Select the check box Thread.sleep(5000);
		 * driver.findElement(By.xpath("//*[@title='2 GB']")).click();
		 * 
		 */
	}

}
