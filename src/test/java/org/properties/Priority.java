package org.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Priority {
	
	@Test
	private void adactinLoginPage() throws IOException {
		FileInputStream stream = new FileInputStream("D:\\java\\FrameWork2\\src\\test\\resources\\AdactinHotel.properties");
		Properties properties = new Properties();
		properties.load(stream);
       String url = properties.get("url").toString();
       String user = properties.get("username").toString();
       String pass = properties.get("password").toString();

       
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get(url);
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       String title = driver.getTitle();
       System.out.println(title);
       
       String windowHandle = driver.getWindowHandle();
       System.out.println(windowHandle);
       
       String currentUrl = driver.getCurrentUrl();
       System.out.println(currentUrl);
       
       driver.findElement(By.id("username")).sendKeys(user);
       driver.findElement(By.id("password")).sendKeys(pass);
       driver.findElement(By.id("login")).click();
       
	}
	
	@Test
	private void groupOfHotel() throws IOException {
		FileInputStream stream = new FileInputStream("D:\\java\\FrameWork2\\src\\test\\resources\\AdactinHotel.properties");
		Properties properties = new Properties();
		properties.load(stream);
		
		String locatio = properties.get("location").toString();
	       String hotel = properties.get("hotel").toString();
	       String roomtype = properties.get("roomtype").toString();
	       String noofroom = properties.get("numberofroom").toString();
	       String checkin = properties.get("checkindate").toString();
	       String checkout = properties.get("checkoutdate").toString();
	       String adultperroom = properties.get("adultsperroom").toString();
	       String childperroom = properties.get("childrenperroom").toString();
	       
	       WebDriverManager.chromedriver().setup();
	       WebDriver driver = new ChromeDriver();
	       
	       String title = driver.getTitle();
	       System.out.println(title);
	       
	       String windowHandle = driver.getWindowHandle();
	       System.out.println(windowHandle);
	       
	       String currentUrl = driver.getCurrentUrl();
	       System.out.println(currentUrl);
	       
	       driver.findElement(By.id("location")).sendKeys(locatio);
	       driver.findElement(By.id("hotels")).sendKeys(hotel);
	       driver.findElement(By.id("room_type")).sendKeys(roomtype);
	       driver.findElement(By.id("room_nos")).sendKeys(noofroom);
	       WebElement datein = driver.findElement(By.id("datepick_in"));
	       datein.clear();
	       datein.sendKeys(checkin);
	       WebElement dateout = driver.findElement(By.id("datepick_out"));
	       dateout.clear();
	       dateout.sendKeys(checkout);
	       driver.findElement(By.id("adult_room")).sendKeys(adultperroom);
	       driver.findElement(By.id("child_room")).sendKeys(childperroom);
	       driver.findElement(By.id("Submit")).click();
		

	}

}
