package webdriver;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoomail_Login_Logout_WD {
	
	public WebDriver driver;
	public void openURL() {
		System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.yahoomail.com");
		driver.manage().window().maximize();
		
	}
	public void verifyyahoomaillogin() throws Exception {
		
		driver.findElement(By.id("login-username")).sendKeys("karuna_111");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("login-passwd")).sendKeys("07429186166Kr");
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
	}

	public void verifylogout() {
		  
		  driver.findElement(By.xpath("//*[@id='yui_3_18_0_3_1520957637940_1190']")).click();
		  driver.findElement(By.linkText("Sign out")).click();
		
	}
	public static void main(String[] args) throws Exception {
		
		Yahoomail_Login_Logout_WD karuna=new Yahoomail_Login_Logout_WD();
		karuna.openURL();
		karuna.verifyyahoomaillogin();
		karuna.verifylogout();
		
		

	}

}
