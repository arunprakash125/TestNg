package org.newframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin extends BaseClass {
	public static void main(String[] args) {
	
		getDrivere();
		loadUrl("https://www.facebook.com/");
		maximize();
		WebElement byId = findLocaterById("email");
		passValue(byId, "Arun");
		WebElement pass = findLocaterById("pass");
		passValue(pass, "1234");
	
		WebElement click = findLocaterByName("login");
		Click(click);
		
	}

}
