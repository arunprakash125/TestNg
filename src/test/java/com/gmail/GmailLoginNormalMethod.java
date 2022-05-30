package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class GmailLoginNormalMethod {
	
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	try {
		
	 WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/intl/en-GB/gmail/about/");
	driver.findElement(By.linkText("Sign in")).click();
	driver.findElement(By.id("identifierId")).sendKeys("email id", Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input")).sendKeys("password#", Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Compose']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[1]/table/tbody/tr[1]/td[2]/div/div/textarea")).sendKeys("arunprakashts125@gmail.com");
	driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/form/div[3]/input")).sendKeys("Hi");
	driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/div/div[1]/div[2]/div[1]/div/table/tbody/tr/td[2]/div[2]/div")).sendKeys("How are you");
	driver.findElement(By.xpath("/html/body/div[23]/div/div/div/div[1]/div[3]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]/div[1]")).click();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}
