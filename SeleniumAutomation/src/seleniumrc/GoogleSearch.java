package seleniumrc;

import com.thoughtworks.selenium.DefaultSelenium;

public class GoogleSearch {

	public static void main(String[] args) {
		
		DefaultSelenium karuna=new DefaultSelenium
				("localhost", 5555,"firefox","http://google.com");
		karuna.start();
		karuna.open("//");
		karuna.windowMaximize();
		karuna.type("lst-ib", "selenium");
		karuna.click("_fZl");

	}

}
