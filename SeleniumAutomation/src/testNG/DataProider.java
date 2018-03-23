package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class DataProider {
	public WebDriver driver;
  @Test(dataProvider = "Authentication")
  public void verifyinglogin(String uname, String pwd)throws Exception {
	  driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("uname");
	  driver.findElement(By.xpath("//*[@id='identifierNext']/div[2]")).click();
	  driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("pwd");
	  driver.findElement(By.xpath("//*[@id='identifierNext']/div[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
	  driver.findElement(By.xpath("//*[@id='gb_71']")).click();
  }

  @DataProvider (name ="Authentication")
  
  public Object[][] credentials() {
    return new Object[][] {{ "karunabpharm","07429186166Kr"},{"karunams001" ,"07429186166Kk"}};}
     
    
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.gmail.com");
	  driver.manage().window().maximize();
  }

}
