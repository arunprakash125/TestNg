package com.parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel2 {
	@Test
	private void test4() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486390870450&hvpos=&hvnetw=g&hvrand=17892439301024212833&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061894&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAjw0a-SBhBkEiwApljU0i9BtxkkHky03Vdd4Cu5vHLFFwuZhgyHq_qYxnIiEqDTNOASj3JlqxoCXA4QAvD_BwE");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 13 pro", Keys.ENTER);
		//WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"search-form-container\"]/form/div/input"));
		//searchBtn.click();

	}

	@Test

	private void test5() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486390870450&hvpos=&hvnetw=g&hvrand=17892439301024212833&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061894&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=CjwKCAjw0a-SBhBkEiwApljU0i9BtxkkHky03Vdd4Cu5vHLFFwuZhgyHq_qYxnIiEqDTNOASj3JlqxoCXA4QAvD_BwE");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 13 pro", Keys.ENTER);
		//WebElement searchBtn = driver.findElement(By.xpath("//*[@id=\"search-form-container\"]/form/div/input"));
		//searchBtn.click();



	}

}
