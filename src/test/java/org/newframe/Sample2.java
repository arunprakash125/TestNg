package org.newframe;

import org.apache.poi.hpsf.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	
	WebDriver driver;
	
	@BeforeClass
	private void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/index.php");
	}
	
	@BeforeMethod
	
	private void beforeMethod() {
		Date date = new Date();
		System.out.println(date);

	}
	@Parameters({"username" , "password"})
	
   @Test
	private void tc01(String s , String s1) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(s);
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(s1);
	}
	
	@Test
	private void tc02() {
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
	}
	
	@Parameters({"location" , "hotels","room_type","room_nos","datepick_in","datepick_out","adult_room","child_room",})
	@Test
	private void tc03(String location, String hotel, String roomType, String roomNos, 
			String dateIn, String dateOut, String adultRoom , String childRoom ) {
		WebElement loc = driver.findElement(By.id("location"));
		Select select = new Select(loc);
		select.selectByIndex(1);
		
		WebElement hot = driver.findElement(By.id("hotels"));
		Select select1 = new Select(hot);
		select1.selectByIndex(2);
		
		WebElement roomty = driver.findElement(By.id("room_type"));
		Select select2 = new Select(roomty);
		select2.selectByIndex(2);
		
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(roomno);
		select3.selectByIndex(2);
		
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.clear();
		datein.sendKeys("10/02/2022");
		
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.clear();
		dateout.sendKeys("15/02/2022");
		
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select select6 = new Select(adult);
		select6.selectByIndex(2);
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select select7 = new Select(child);
		select7.selectByIndex(0);
		
		WebElement btnSearch = driver.findElement(By.id("Submit"));
		btnSearch.click();

	}
	
	@Parameters({"radiobutton_0"  })
	@Test
	private void tc04(String radioBtn) {
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
       btnRadio.click();
        
        WebElement continueBtn = driver.findElement(By.id("continue"));
        continueBtn.click();
	}
	@Parameters({"first_name", "last_name" ,"address", "cc_num","cc_type",
		              "cc_exp_month","cc_exp_year","cc_cvv"})
	@Test
	private void tc05(String firstName , String lastName , String address, String ccNum,
			String ccType, String ccExpMonth , String ccExpYear, String ccCvv) {
		
		WebElement txtFirst = driver.findElement(By.id("first_name"));
		txtFirst.sendKeys("Arun");
		
		WebElement txtLast = driver.findElement(By.id("last_name"));
		txtLast.sendKeys("prakash");
		
		WebElement txtAddress = driver.findElement(By.id("address"));
		txtAddress.sendKeys("chennai");
		
		WebElement numCc = driver.findElement(By.id("cc_num"));
		numCc.sendKeys("6546546546546546");
		
		WebElement numCcType = driver.findElement(By.id("cc_type"));
		Select select8 = new Select(numCcType);
		select8.selectByVisibleText(ccType);
		
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		Select select9 = new Select(expMonth);
		select9.selectByIndex(12);
		
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		Select select10 = new Select(expYear);
		select10.selectByVisibleText(ccExpYear);
		
		WebElement numCcCvv = driver.findElement(By.id("cc_cvv"));
		numCcCvv.sendKeys("5555");
		
		WebElement btnBookNow = driver.findElement(By.id("book_now"));
		btnBookNow.click();

	}
	
	
	
	@AfterMethod
	private void afterMethod() {
		Date date = new Date();
		System.out.println(date);
		
	}
	

}
