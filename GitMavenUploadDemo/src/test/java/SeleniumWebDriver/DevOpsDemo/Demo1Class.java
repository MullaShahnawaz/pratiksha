package SeleniumWebDriver.DevOpsDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Demo1Class {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
			System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/");
	}
	
	
	@Test
	public void f() {
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
	}
	

	@AfterTest
	public void afterTest() {
		driver.close();

	}
	
}
