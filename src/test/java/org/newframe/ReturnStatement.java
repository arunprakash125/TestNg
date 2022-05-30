package org.newframe;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReturnStatement {
	
	WebDriver driver;
	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
private void enterUrl(String url) {
	driver.get(url);
	

}
	public static void main(String[] args) {
		ReturnStatement res = new ReturnStatement();
		res.getDriver();
		res.enterUrl("https://www.facebook.com/");
	}
	
	public String getTitle() {
		String title = driver.getTitle();
		return title;

	}
	
	public String click(WebElement element) {
		String title = driver.getTitle();
		return title;
		
	}
	
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		

	}
		public String getAttribute(WebElement element) {
			String attribute = element.getAttribute("value");
			return attribute;

		}
			public void closeAllBrowser() {
				driver.close();

			}
		public void selectOptionByText(WebElement element, String text) {
			Select select = new Select(element);
			select.selectByVisibleText(text);
			
		}	
		public void selectByIndex(WebElement element, int index) {
			Select select = new Select(element);
			select.selectByIndex(index);
		}
		
		public void selectOptionByAttribute(WebElement element, String value) {
			Select select = new Select(element);
			select.selectByValue(value);

		}
		
		}

	
