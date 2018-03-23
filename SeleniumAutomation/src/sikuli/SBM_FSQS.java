package sikuli;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SBM_FSQS {
	public WebDriver driver;
	public Screen s;
  @Test
  public void f() throws Exception {
	  s.hover("E:\\Eclips_Workspace.sikuli\\1520326582702.png");
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Selenium FAQ’s")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  s=new Screen();
	  driver.get("http://www.seleniumbymahesh.com");
	  driver.manage().window().maximize();
  }

}
