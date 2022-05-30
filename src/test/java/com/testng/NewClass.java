package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewClass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.tnpsc.gov.in/");
		WebElement notification = driver.findElement(By.xpath("//*[@id=\'core\']/div/div[1]/div[2]/aside/div[2]/div/div/div/ul/li[1]/div/h4/a"));
		notification.click();
		 WebElement group2 = driver.findElement(By.xpath("//*[@id=\'noti_table\']/tbody/tr[3]/td[3]/a[1]"));
		group2.click();
	}

}
