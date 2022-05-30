package org.newframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
@DataProvider(name="amazon")
@Test
public Object[][] product() {
	return new Object[][] {
		{"iphone" , "12"} , {"Redmi" ,"note 10"} , {"vivo" , "v20 pro"} , {"oneplus" , "9r"},
		{"boat" , "255"}, {"truke Buds ", "BTg3"},{"Redmi LED Tv" , "4a"}
	};

}

@Test(dataProvider = "amazon")
private void tc0(String s, String s1) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ref=nav_logo");
	WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	searchBox.sendKeys(s);
	searchBox.sendKeys(s1);
	
	WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
	searchBtn.click();
	

}

}
