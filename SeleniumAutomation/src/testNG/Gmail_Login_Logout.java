package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

 
public class Gmail_Login_Logout {
	public WebDriver driver;
  @Test
  public void verifyLogin() throws Exception{
	 /* driver.findElement(By.id("identifierId")).sendKeys("karunabpharm");
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.name("password")).sendKeys("07429186166Kr");
	    driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
	    Thread.sleep(8000);*/
	  driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("karunabpharm");
	  driver.findElement(By.xpath("//*[@id='identifierNext']/div[2]")).click();
	  driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/form/div[1]/div/div[1]/div/div[1]/input")).sendKeys("07429186166Kr");
	  driver.findElement(By.xpath("//*[@id='identifierNext']/div[2]")).click();
  
 
  }
  public void verifyLogout() {
	  driver.findElement(By.cssSelector("span.gb_ab.gbii")).click();
		driver.findElement(By.id("gb_71")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
