package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseOver_WD {
	public WebDriver driver;
	
  @Test
  public void f() throws Exception{
	  Actions a= new Actions(driver);
	  Thread.sleep(3000);
	WebElement str= driver.findElement(By.xpath("//*[@id='menu-item-85']/a"));
	a.moveToElement(str).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Selenium FAQ’s")).click();
	Thread.sleep(3000);
	a.keyDown(Keys.CONTROL).sendKeys(Keys.DOWN).build().perform();
	Thread.sleep(3000);
	a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://www.seleniumbymahesh.com");
	  driver.manage().window().maximize();
	  
	  
  }

}
