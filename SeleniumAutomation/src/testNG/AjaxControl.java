package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;


public class AjaxControl {
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  String str;
	  Thread.sleep(3000);
	  driver.findElement(By.id("gs_htif0")).sendKeys("selenium");
	  Thread.sleep(30000);
	  str=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div")).getText();
	  System.out.println(str);
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("http://google.com");
	  driver.manage().window().maximize();
  }

}
