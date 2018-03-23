package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.Screen;

public class HMS_PR {
	public WebDriver driver;
	public Screen s;
	public void openURL() {
		System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver.exe");
		driver=new ChromeDriver();
		s=new Screen();
		driver.get("http://www.seleniumbymahesh.com");
		driver.manage().window().maximize();
	}
	public void verify_HMS_Loginpage() throws Exception {
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("Registration")).click();
	Thread.sleep(3000);
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Insurance");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Tagotre");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("elephant");
		driver.findElement(By.name("LAST_NAME")).sendKeys("nallamothu");
		driver.findElement(By.name("DOB")).sendKeys("19/02/2018");
		driver.findElement(By.name("AGE")).sendKeys("30");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("tagu");
		Thread.sleep(3000);
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("AAdhar Card");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("123456789");
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("Yes");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("B.Tech");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("A+");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("Yes");
		driver.findElement(By.name("image")).sendKeys("C:\\Users\\karuna\\Desktop\\karuna 1.JPG");
		Thread.sleep(3000);
		
		
		
	}
	
	public void Feedbackverifyingpopup()throws Exception {
		 String str;
		str=driver.getWindowHandle();
		driver.findElement(By.linkText("Feedback")).click();
		Thread.sleep(5000);
		driver.switchTo().window("mywindow");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("tagore");
		driver.findElement(By.id("email")).sendKeys("asdfg@gmail.com");
		new Select(driver.findElement(By.id("car"))).selectByVisibleText("Volvo");
		driver.findElement(By.id("message")).sendKeys("hi welcome");
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().window(str);
		//driver.findElement(By.name("ADDRESS1")).sendKeys("hyd");
		driver.findElement(By.xpath("//*[@id='form1']/div[1]/table/tbody/tr[14]/td[2]/input")).sendKeys("hyderabad");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9908338185");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("abe@gmail.com");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		driver.findElement(By.name("ADDRESS2")).sendKeys("guardianway");
		driver.findElement(By.name("ZIP")).sendKeys("522403");
		driver.findElement(By.linkText("Logout")).click();
	}

	public static void main(String[] args) throws Exception {
		 HMS_PR karuna=new  HMS_PR();
		 karuna.openURL();
		 karuna.verify_HMS_Loginpage();
		 karuna.Feedbackverifyingpopup();
		 
		
	}

}
