package seleniumrc;

import com.thoughtworks.selenium.DefaultSelenium;

public class FaceBook_Login {

	public static void main(String[] args) {
		DefaultSelenium karuna=new DefaultSelenium
				("localhost", 5555, "firefox", "http://facebook.com");
		karuna.start();
		karuna.open("facebook");
		karuna.windowMaximize();
		karuna.type("email", "karunabpharm");
		karuna.type("pass", "07429186166Kk");
		karuna.click("u_0_3");

	}

}
