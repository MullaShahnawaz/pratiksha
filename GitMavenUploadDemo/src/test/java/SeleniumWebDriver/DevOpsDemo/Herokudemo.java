package SeleniumWebDriver.DevOpsDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Herokudemo {
WebDriver driver;
@BeforeTest
public void beforeTest() {
	System.setProperty("webdriver.chrome.driver","resources\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/login");
	
}
	
@Test
  public void herokuapp() {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("tomsmith");
	driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	driver.findElement(By.xpath("//button[@class='radius']")).click();
  }


  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
