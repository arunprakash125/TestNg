package org.newframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FaceBook {
	WebDriver driver;
	@Parameters({"username" , "password"})
	@Test
	private void tc01(@Optional ("welcome") String s , String s1 ) {
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys(s);
	
	WebElement txtpassword = driver.findElement(By.id("password"));	
	    txtpassword.sendKeys(s1);

	}

}
