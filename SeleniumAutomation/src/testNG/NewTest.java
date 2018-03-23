package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	public WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.linkText("Sign in")).click();
	  driver.findElement(By.id("userid")).sendKeys("karunabpharm15");
	  driver.findElement(By.id("pass")).sendKeys("07429186166Kk");
	  driver.findElement(By.id("sgnBt")).click();
	  driver.findElement(By.id("gh-cat")).click();
	  driver.findElement(By.id("gh-cat-box")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.ebay.com");
	  driver.manage().window().maximize();
	  		
	  
  }

}
