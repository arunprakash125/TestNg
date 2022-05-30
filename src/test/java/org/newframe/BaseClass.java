package org.newframe;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void getDrivere() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		
	}
	public static String loadUrl(String url) {
		driver.get(url);
		return url;
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static WebElement findLocaterById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}
	public static WebElement findLocaterByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
	public static WebElement findLocatreByClassName(String byClass) {
		WebElement element = driver.findElement(By.className(byClass));
		return element;
	}
	public static WebElement findLocatreByxpath(String xpathName) {
		WebElement element = driver.findElement(By.xpath(xpathName));
		return element;
	}
	public static void passValue(WebElement element,String keys) {
		element.sendKeys(keys);
	}
	
	public void sendValue(WebElement element , String keys) {
		element.sendKeys(keys);

	}
	public static void TypeText(WebElement element, String data) {
		element.sendKeys(data);
		}
	public static String typeText(WebElement element , String data) {
		element.sendKeys(data);
		return data;
		

	}
	public static void Click(WebElement element) {
		element.click();
	}
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public static String CurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		
	}
	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public static String getAttributes(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public static void selectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectByindex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public static void selectByattribute(WebElement element,String attribute) {
		Select select = new Select(element);
		select.selectByValue(attribute);
	}
	public static boolean ismultiple (WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}
	public static void deSelectByindex(WebElement element,int data) {
		Select select = new Select(element);
		select.deselectByIndex(data);
	}
	public static void deSelectByValue(WebElement element,String data) {
		Select select = new Select(element);
		select.deselectByValue(data);
	}
	public static void deselectByVisibleText(WebElement element,String data) {
		Select select = new Select(element);
		select.deselectByVisibleText(data);
	}
	public static void deselectAll(WebElement element,String data) {
		Select select = new Select(element);
		select.deselectAll();
	}
	public static void selectByatttribute(WebElement element,String attribute) {
		Select select = new Select(element);
		select.selectByValue(attribute);
	}
	public static void textJs(WebElement element,String Data) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','"+Data+"')",element);
	}
	public static void moveToelement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	public static void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}
	public static void doubleClick() {
		Actions action = new Actions(driver);
		action.doubleClick().perform();
	}
	public static void dragNDrop(WebElement source,WebElement destination) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
	}
	public static void simpleAlert() {
		Alert sAlert = driver.switchTo().alert();
		sAlert.accept();
	}
	public static void cancelAlert() {
		Alert cAlert = driver.switchTo().alert();
		cAlert.dismiss();
	}
	
	public static void switchtoFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	
	public static void switchtoFrameByText(String text) {
		driver.switchTo().frame(text);
	}
	public static void switchtoFrameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void getToDefaultWindow() {
		driver.switchTo().defaultContent();
	}
	public static void navigateTourl(String url) {
		driver.navigate().to(url);
	}
	public static void navigateForward() {
		driver.navigate().forward();
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	public static boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	public static boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	public static boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	public static void isMultiple(WebElement element) {
	 
	}
	public static int length(String size) {
		int length = size.length();
		return length;
	}
	public static boolean equals(String s1,String s2) {
		boolean equals = s1.equals(s2);
		return equals;	
	}
	public static boolean equalsIgnore(String s1,String s2) {
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		return equalsIgnoreCase;	
	}
	public static boolean contains(String s1,String s2) {
		boolean contains = s1.contains(s2);
		return contains;
	}
	public static boolean startswith(String s1, String s2) {
		boolean startsWith = s1.startsWith(s2);
		return startsWith;
	}
	public static boolean endsWith(String s1, String s2) {
		boolean endsWith = s1.endsWith(s2);
		return endsWith;
	}
	public static boolean isEmpty(String s) {
		boolean empty = s.isEmpty();
		return empty;
	}public static boolean createfolder(File f) {
		boolean mkdir = f.mkdir();
		return mkdir;	
	}public static boolean createFile(File f) throws IOException {
		boolean createNewFile = f.createNewFile();
		return createNewFile;
	}
	public static boolean canRead(File f) {
		boolean canRead = f.canRead();
		return canRead;
	}
	public static boolean canWrite(File f) {
		boolean canWrite = f.canWrite();
		return canWrite;
	}
	public static boolean canExecute(File f) {
		boolean canExe = f.canExecute();
		return canExe;
	}
	public static boolean exists(File f) {
		boolean exist = f.exists();
		return exist;
	}
	public static void closeBrowser() {
		driver.close();
	}
	public static void closeAllBrowsers() {
		driver.quit();
	}
	public static void getData(String string, int i, int j) {
		
		return;
	}




}
