package webdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_login_logout_WD {
	
	public WebDriver Driver;
	public void openURL() {
		System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		//Driver.navigate().to("chrome driver");
		Driver=new ChromeDriver();
		Driver.get("http://www.facebook.com");
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		String title=Driver.getTitle();
		System.out.println(title);
		String url=Driver.getCurrentUrl();
		System.out.println(url);
		
	}
	public void verifylogin() throws Exception {
		Driver.findElement(By.id("email")).sendKeys("karunabpharm");
		Driver.findElement(By.id("pass")).sendKeys("07429186166Kk");
		Thread.sleep(3000);
		//Driver.findElement(By.id("u_0_3")).click();
		Driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	public void findlinks() {
		List<WebElement> str = Driver.findElements(By.tagName("a"));
		System.out.println(str.size());
		
			//System.out.println(str.get(i).getText());
			for (int i=0;i<str.size();i++)
		{
			
		
			if (!str.get(i).getText().isEmpty())
			{
				//Count ++;
			}
		}
	}
	
	public void verifylogout() throws Exception{
		Driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(3000);
		Driver.findElement(By.xpath("html/body/div[22]/div/div/div/div/div[1]/div/div/ul/li[14]")).click();
	}

	public static void main(String[] args)throws Exception {
		Facebook_login_logout_WD karuna=new Facebook_login_logout_WD();
		karuna.openURL();
		karuna.verifylogin();
		karuna.findlinks();
		karuna.verifylogout();
		int Count=0;
		
		
		

	}

}
