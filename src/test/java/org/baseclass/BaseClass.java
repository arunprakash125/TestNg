package org.baseclass;

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

public class BaseClass  {
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


	public WebElement findLocatorById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}


	public WebElement findLocatreByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}
	public WebElement findLocatreByClassName(String byClass) {
		WebElement element = driver.findElement(By.className(byClass));
		return element;
	}
	public WebElement findLocatreByxpath(String xpathName) {
		WebElement element = driver.findElement(By.xpath(xpathName));
		return element;
	}
	public void passValue(WebElement element,String keys) {
		element.sendKeys(keys);
	}
	public void TypeText(WebElement element, String data) {
		element.sendKeys(data);
	}
	public String typeText(WebElement element , String data) {
		element.sendKeys(data);
		return data;


	}
	public void Click(WebElement element) {
		element.click();
	}
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	public String CurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	public String getAttributes(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public void selectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectByindex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void selectByattribute(WebElement element,String attribute) {
		Select select = new Select(element);
		select.selectByValue(attribute);
	}
	public boolean ismultiple (WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}
	public void deSelectByindex(WebElement element,int data) {
		Select select = new Select(element);
		select.deselectByIndex(data);
	}
	public void deSelectByValue(WebElement element,String data) {
		Select select = new Select(element);
		select.deselectByValue(data);
	}
	public void deselectByVisibleText(WebElement element,String data) {
		Select select = new Select(element);
		select.deselectByVisibleText(data);
	}
	public void deselectAll(WebElement element,String data) {
		Select select = new Select(element);
		select.deselectAll();
	}
	public void selectByatttribute(WebElement element,String attribute) {
		Select select = new Select(element);
		select.selectByValue(attribute);
	}
	public void textJs(WebElement element,String Data) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].setAttribute('value','"+Data+"')",element);
	}
	public void moveToelement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void rightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}
	public void doubleClick() {
		Actions action = new Actions(driver);
		action.doubleClick().perform();
	}
	public void dragNDrop(WebElement source,WebElement destination) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
	}
	public void simpleAlert() {
		Alert sAlert = driver.switchTo().alert();
		sAlert.accept();
	}
	public void cancelAlert() {
		Alert cAlert = driver.switchTo().alert();
		cAlert.dismiss();
	}

	public void switchtoFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void switchtoFrameByText(String text) {
		driver.switchTo().frame(text);
	}
	public void switchtoFrameByElement(WebElement element) {
		driver.switchTo().frame(element);
	}

	public void getToDefaultWindow() {
		driver.switchTo().defaultContent();
	}
	public void navigateTourl(String url) {
		driver.navigate().to(url);
	}
	public void navigateForward() {
		driver.navigate().forward();
	}
	public void navigateBack() {
		driver.navigate().back();
	}
	public void navigateRefresh() {
		driver.navigate().refresh();
	}
	public boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	public boolean isSelected(WebElement element) {
		boolean selected = element.isSelected();
		return selected;
	}
	public boolean isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
	}
	public void isMultiple(WebElement element) {

	}
	public int length(String size) {
		int length = size.length();
		return length;
	}
	public boolean equals(String s1,String s2) {
		boolean equals = s1.equals(s2);
		return equals;	
	}
	public boolean equalsIgnore(String s1,String s2) {
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		return equalsIgnoreCase;	
	}
	public boolean contains(String s1,String s2) {
		boolean contains = s1.contains(s2);
		return contains;
	}
	public boolean startswith(String s1, String s2) {
		boolean startsWith = s1.startsWith(s2);
		return startsWith;
	}
	public boolean endsWith(String s1, String s2) {
		boolean endsWith = s1.endsWith(s2);
		return endsWith;
	}
	public boolean isEmpty(String s) {
		boolean empty = s.isEmpty();
		return empty;
	}public boolean createfolder(File f) {
		boolean mkdir = f.mkdir();
		return mkdir;	
	}public boolean createFile(File f) throws IOException {
		boolean createNewFile = f.createNewFile();
		return createNewFile;
	}
	public boolean canRead(File f) {
		boolean canRead = f.canRead();
		return canRead;
	}
	public boolean canWrite(File f) {
		boolean canWrite = f.canWrite();
		return canWrite;
	}
	public boolean canExecute(File f) {
		boolean canExe = f.canExecute();
		return canExe;
	}
	public boolean exists(File f) {
		boolean exist = f.exists();
		return exist;
	}
	public void closeBrowser() {
		driver.close();
	}
	public void closeAllBrowsers() {
		driver.quit();
	}
	public void getData(String string, int i, int j) {

		return;
	}




}
