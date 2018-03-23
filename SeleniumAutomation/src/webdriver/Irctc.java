package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Irctc {
	
public WebDriver driver;
public void open_URL() {
	driver=new FirefoxDriver();
	driver.get("http://www.irctc.com");
	driver.manage().window().maximize();
	
}
public void verifylogin()throws Exception {
	driver.findElement(By.xpath("html/body/div[1]/div[1]/div[4]/div[3]/div[1]/div/a[2]/div")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id='txtLogin']")).sendKeys("karunabpharm");
	driver.findElement(By.xpath("//*[@id='txtPwd']")).sendKeys("07429186166Kr");
	driver.findElement(By.xpath("//*[@id='frmAdminLogin']/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td/table/tbody/tr[3]/td/table/tbody/tr[9]/td[2]/input[1]")).click();
	
}

	public static void main(String[] args) throws Exception{
		Irctc karuna=new Irctc ();
		karuna.open_URL();
		karuna.verifylogin();
		
		
	}

}
