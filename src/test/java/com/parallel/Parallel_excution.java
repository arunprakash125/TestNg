package com.parallel;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_excution {
	@Test
	private void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));
		txtUser.sendKeys("arunprakash");
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPass.sendKeys("prakash");
		
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='loginbutton']"));
		btnLogin.click();

	}
	@Test
	private void test2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));
		txtUser.sendKeys("arunprakash");
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPass.sendKeys("prakash");
		
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='loginbutton']"));
		btnLogin.click();

	}
	
	@Test
	private void test3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));
		txtUser.sendKeys("arunprakash");
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPass.sendKeys("prakash");
		
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id='loginbutton']"));
		btnLogin.click();

	}

}
