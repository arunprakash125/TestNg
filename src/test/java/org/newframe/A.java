package org.newframe;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	

	@Before
	public void before() throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File screen1 = screenshot.getScreenshotAs(OutputType.FILE);
		
		File file = new File("D:\\selenium screenshot\\page1.png");
		FileUtils.copyDirectory(screen1, file);
	}
	
	@Test
	   public void test() {
		   WebElement txtUser = driver.findElement(By.id("username"));
		   txtUser.sendKeys("arunprakash125");
		   
		   WebElement txtPass = driver.findElement(By.id("password"));
		   txtPass.sendKeys("prakash95");
		   
		   WebElement btnLogin = driver.findElement(By.id("login"));
		   btnLogin.click();
	}
	
	
	@After
	   public void after() throws IOException {
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File file2 = screenshot.getScreenshotAs(OutputType.FILE);
		File file1= new File("D:\\selenium screenshot\\page2.png");
		FileUtils.copyDirectory(file2, file1);
		
	}	
	 
	
		

  
   @AfterClass
	public static void afterClass()  {
	   
		driver.quit();
	}
 

}
   