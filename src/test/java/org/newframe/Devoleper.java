package org.newframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Devoleper {
    
public static void main(String[] args) throws InterruptedException {
		LibGlobal baseclass = new LibGlobal();
		
		
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		baseclass.getDriver();
		
		//driver.get("https://adactinhotelapp.com/index.php");
		//driver.manage().window().maximize();
		baseclass.Loadurl("https://adactinhotelapp.com/index.php");
		
		baseclass.Maximize();
		
		//WebElement txtUserName = driver.findElement(By.id("username"));
		WebElement txtusername = baseclass.FindLocaterById("username");
		baseclass.passValue(txtusername, "arunprakash125");
		//txtUserName.sendKeys("arunprakash125");
		
		WebElement txtpassword = baseclass.FindLocaterById("password");
		baseclass.passValue(txtpassword, "prakash95");
		//WebElement txtPassword = driver.findElement(By.id("password"));
		//txtPassword.sendKeys("prakash95");
		
		Thread.sleep(2000);
		
		WebElement login = baseclass.FindLocaterByName("login");
		baseclass.Click(login);
		//WebElement btnLogin = driver.findElement(By.name("login"));
		//btnLogin.click();
		
		WebElement location = baseclass.FindLocaterById("location");
		baseclass.SelectOptionsByIndex(location, 1);
		//WebElement location = driver.findElement(By.name("location"));
		//Select select = new Select(location);
		//select.selectByIndex(1);
		
		WebElement hotellist = baseclass.FindLocaterByName("hotels");
		baseclass.SelectOptionsByIndex(hotellist, 2);
		//WebElement hotel = driver.findElement(By.id("hotels"));
		//Select select0 = new Select(hotel);
		//select0.selectByIndex(2);
		
		WebElement roomtype = baseclass.FindLocaterById("room_type");
		baseclass.SelectOptionsByIndex(hotellist, 1);
		//WebElement typeRoom = driver.findElement(By.id("room_type"));
		//Select select1 = new Select(typeRoom);
		//select1.selectByIndex(1);
		
		WebElement numofroom = baseclass.FindLocaterByName("room_nos");
		baseclass.SelectOptionsByIndex(numofroom, 2);
		//WebElement roomQty = driver.findElement(By.name("room_nos"));
		//Select select2 = new Select(roomQty);
		//select2.selectByIndex(2);
		
		WebElement checkindate = baseclass.FindLocaterById("datepick_in");
		baseclass.passValue(checkindate, 27/02/2022);
		//WebElement fromDt = driver.findElement(By.name("datepick_in"));
		//fromDt.sendKeys("27/02/2022");
		
		WebElement checkoutdate = baseclass.FindLocaterByName("datepick_out");
		baseclass.passValue(checkoutdate, 01/03/2022);
		//WebElement checkDt = driver.findElement(By.name("datepick_out"));
		//checkDt.sendKeys("01/03/2022");
		
		WebElement adult = baseclass.FindLocaterById("adult_room");
		baseclass.SelectOptionsByIndex(adult, 2);
		//WebElement adult = driver.findElement(By.id("adult_room"));
		//Select select3 = new Select(adult);
		//select3.selectByIndex(2);
		
		WebElement child = baseclass.FindLocaterById("child_room");
		baseclass.SelectOptionsByIndex(child, 1);
		//WebElement child = driver.findElement(By.id("child_room"));
		//Select select4 = new Select(child);
		//select4.selectByValue("1");
		
		Thread.sleep(2000);
		
		WebElement btnSubmit = baseclass.FindLocaterById("Submit");
		baseclass.Click(btnSubmit);
		//WebElement btnSubmit = driver.findElement(By.id("Submit"));
		//btnSubmit.click();
		
		// Select Hotel
		WebElement clickHotel = baseclass.FindLocaterById("radiobutton_0");
		baseclass.Click(clickHotel);
		//WebElement clickHotel = driver.findElement(By.id("radiobutton_0"));
		//clickHotel.click();
		Thread.sleep(2000);
		
		WebElement btnContinue = baseclass.FindLocaterByName("continue");
		baseclass.Click(btnContinue);
		//WebElement btnContinue = driver.findElement(By.name("continue"));
		//btnContinue.click();
		
		//Book a hotel
		WebElement txtFirstName = baseclass.FindLocaterById("first_name");
		baseclass.passValue(txtFirstName, "Arun");
		//WebElement txtFirstName = driver.findElement(By.id("first_name"));
		//txtFirstName.sendKeys("Arun");
		
		WebElement txtLastName = baseclass.FindLocaterById("last_name2");
		baseclass.passValue(txtLastName, "Prakash");
		//WebElement txtLastName = driver.findElement(By.id("last_name"));
		//txtLastName.sendKeys("Prakash");
		
		WebElement txtAddress = baseclass.FindLocaterById("address");
		baseclass.passValue(txtAddress, "No.3 anthoniar nagar, mathakottakottai road, thanjavur");
		//WebElement txtAddress = driver.findElement(By.id("address"));
		//txtAddress.sendKeys("No.3 anthoniar nagar, mathakottakottai road, thanjavur");
		
		WebElement ccDetails = baseclass.FindLocaterById("cc_num");
		baseclass.passValue(ccDetails, "465468465465465468496");
		//WebElement ccDetails = driver.findElement(By.id("cc_num"));
		//ccDetails.sendKeys("465468465465465468496");
		
		WebElement ccType = baseclass.FindLocaterByName("cc_type");
		baseclass.SelectoOptionsByText(ccType, "VISA");
		//WebElement ccType = driver.findElement(By.name("cc_type"));
		//Select select5 = new Select(ccType);
		//select5.selectByVisibleText("VISA");
		
		WebElement dateExpiry = baseclass.FindLocaterById("cc_exp_month");
		baseclass.SelectOptionsByIndex(dateExpiry, 5);
		//WebElement dateExpiry = driver.findElement(By.id("cc_exp_month"));
		//Select select6 = new Select(dateExpiry);
		//select6.selectByIndex(5);
		
		WebElement yrExpiry = baseclass.FindLocaterById("cc_exp_year");
		baseclass.SelectoOptionsByText(yrExpiry, "2022");
		//WebElement yrExpiry = driver.findElement(By.id("cc_exp_year"));
		//Select select7 = new Select(yrExpiry);
		//select7.selectByVisibleText("2022");
		
		
		WebElement cvv = baseclass.FindLocaterById("cc_cvv");
		baseclass.passValue(cvv, "4567");
		//WebElement cvv = driver.findElement(By.id("cc_cvv"));
		//cvv.sendKeys("4567");
		
		WebElement btnBookNow = baseclass.FindLocaterById("book_now");
		baseclass.Click(btnBookNow);
		//WebElement btnBookNow = driver.findElement(By.id("book_now"));
		//btnBookNow.click();
		
		Thread.sleep(10000);
		
		WebElement printOrderId = baseclass.FindLocaterById("order_no");
		baseclass.GetAttributeValue(printOrderId);
		//WebElement printOrderId = driver.findElement(By.id("order_no"));
		//String orderIdNo = printOrderId.getAttribute("value");
		//System.out.println(orderIdNo);
		
		
		
		
		
		
		
	}


}

