package org.newframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel {
	
	
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", 
					"D:\\java\\SelenumProject\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://adactinhotelapp.com/index.php");
			driver.manage().window().maximize();
			
			WebElement txtUserName = driver.findElement(By.id("username"));
			txtUserName.sendKeys("arunprakash125");
			
			WebElement txtPassword = driver.findElement(By.id("password"));
			txtPassword.sendKeys("prakash95");
			
			Thread.sleep(2000);
			
			WebElement btnLogin = driver.findElement(By.name("login"));
			btnLogin.click();
			
			WebElement location = driver.findElement(By.name("location"));
			Select select = new Select(location);
			select.selectByIndex(4);
			
			WebElement hotel = driver.findElement(By.id("hotels"));
			Select select0 = new Select(hotel);
			select0.selectByIndex(3);
			
			WebElement typeRoom = driver.findElement(By.id("room_type"));
			Select select1 = new Select(typeRoom);
			select1.selectByIndex(2);
			
			WebElement roomQty = driver.findElement(By.name("room_nos"));
			Select select2 = new Select(roomQty);
			select2.selectByIndex(3);
			
			WebElement fromDt = driver.findElement(By.name("datepick_in"));
			fromDt.sendKeys("27/01/2022");
			
			WebElement checkDt = driver.findElement(By.name("datepick_out"));
			checkDt.sendKeys("01/03/2022");
			
			WebElement adult = driver.findElement(By.id("adult_room"));
			Select select3 = new Select(adult);
			select3.selectByIndex(2);
			
			WebElement child = driver.findElement(By.id("child_room"));
			Select select4 = new Select(child);
			select4.selectByValue("1");
			
			Thread.sleep(2000);
			
			WebElement btnSubmit = driver.findElement(By.id("Submit"));
			btnSubmit.click();
			
			// Select Hotel
			WebElement clickHotel = driver.findElement(By.id("radiobutton_0"));
			clickHotel.click();
			Thread.sleep(2000);
			WebElement btnContinue = driver.findElement(By.name("continue"));
			btnContinue.click();
			
			//Book a hotel
			WebElement txtFirstName = driver.findElement(By.id("first_name"));
			txtFirstName.sendKeys("jalalrtyu");
			
			WebElement txtLastName = driver.findElement(By.id("last_name"));
			txtLastName.sendKeys("deevbnmn");
			
			WebElement txtAddress = driver.findElement(By.id("address"));
			txtAddress.sendKeys("no :12 street, nagar, area pin-456789876");
			
			WebElement ccDetails = driver.findElement(By.id("cc_num"));
			ccDetails.sendKeys("23456789098765434567898");
			
			WebElement ccType = driver.findElement(By.name("cc_type"));
			Select select5 = new Select(ccType);
			select5.selectByVisibleText("VISA");
			
			WebElement dateExpiry = driver.findElement(By.id("cc_exp_month"));
			Select select6 = new Select(dateExpiry);
			select6.selectByIndex(5);
			
			WebElement yrExpiry = driver.findElement(By.id("cc_exp_year"));
			Select select7 = new Select(yrExpiry);
			select7.selectByVisibleText("2022");
			
			WebElement cvv = driver.findElement(By.id("cc_cvv"));
			cvv.sendKeys("4567");
			
			WebElement btnBookNow = driver.findElement(By.id("book_now"));
			btnBookNow.click();
			
			
			WebElement printOrderId = driver.findElement(By.id("order_no"));
			String orderIdNo = printOrderId.getAttribute("value");
			System.out.println(orderIdNo);
			
			
			
			
			
			
			
		}

	}


