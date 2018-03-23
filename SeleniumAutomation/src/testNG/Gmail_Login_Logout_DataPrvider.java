package testNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Gmail_Login_Logout_DataPrvider {
	public WebDriver d;
	@Parameters({"username", "password"})
  @Test
  public void f(String username, String password ) throws Exception{
	  d.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("username");
	  d.findElement(By.xpath("//*[@id='identifierNext']/div[2]")).click();
	  d.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/form/div[1]/div/div[1]/div/div[1]/input")).sendKeys("pwd");
	  d.findElement(By.xpath("//*[@id='identifierNext']/div[2]")).click();
	  Thread.sleep(3000);
	  d.findElement(By.id("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
	 d.findElement(By.xpath("//*[@id='gb_71']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("http://www.gmail.com");
	  d.manage().window().maximize();
  }

}
