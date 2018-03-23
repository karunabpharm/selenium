package sikuli;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class Gmail_upload_Resume {
	public WebDriver driver;
	public Screen s;
  @Test
  public void Verifylogin()throws Exception {
	  driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("karunabpharm");
	  driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("07429186166Kr");
	  driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/div/content")).click();
  }
  @Test
  public void uploadresume() throws Exception {
	    s.click("E:\\Eclips_Workspace.sikuli\\1520327694664.png");
	    driver.findElement(By.id("r2")).sendKeys("karunabpharm@gmail.com");
	    driver.findElement(By.id("p2")).sendKeys("resume");
	    driver.findElement(By.id(":nu")).sendKeys("hiiii");
	    driver.findElement(By.id("sa")).click();
	    s.hover("E:\\Eclips_Workspace.sikuli\\1520328381015.png");
	    s.hover("E:\\Eclips_Workspace.sikuli\\1520328517563.png");
	    driver.findElement(By.id("pc")).click();
	  
  }
  /*
  @Test
  public void verifylogout() {
	  driver.findElement(By.cssSelector("span.gb_ab.gbii")).click();
		driver.findElement(By.id("gb_71")).click();
	  
  }*/
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  s=new Screen();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
  }

}
