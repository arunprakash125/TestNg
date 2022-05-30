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

public class LibGlobal {
	 
		WebDriver driver ;
		public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		public void Loadurl(String data) {
		driver.get(data);
		}
		public void Maximize() {
		driver.manage().window().maximize();
		}
		public WebElement FindLocaterById(String Attributename) {
		WebElement element = driver.findElement(By.id(Attributename));
		return element;
		}
		public WebElement FindLocaterByName(String Name) {
		WebElement element = driver.findElement(By.name(Name));
		return element;
		}
		public WebElement FindLocatorByClassName(String ClassName) {
		WebElement element = driver.findElement(By.className(ClassName));
		return element;
		}
		public WebElement FindLocatorByXpath(String Xpathname) {
		WebElement element = driver.findElement(By.xpath(Xpathname));
		return element;
		}
		public void TypeText(WebElement element, String data) {
		element.sendKeys(data);
		}
		public void Click(WebElement element) {
		element.click();
		}
		public String GetTitle() {
		String title = driver.getTitle();
		return title;
		}
		public String GetEnteredUrl() {
		String crnturl = driver.getCurrentUrl();
		return crnturl;
		}
		public String GetText(WebElement element) {
		String text = element.getText();
		return text;
		}
		public String GetAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
		}
		public void SelectoOptionsByText(WebElement element,String Data) {
		Select select = new Select(element);
		select.selectByVisibleText(Data);
		}
		public void SelectOptionsByIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
		}
		public void SelectOptionsByAttribute(WebElement element,String AttributeName) {
		Select select = new Select(element);
		select.deselectByValue(AttributeName);
		}
		public void TypeTextJS(WebElement element,String Data) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].SetAttribute('value','"+Data+"')", element);
		}
		public void MoveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		}
		public void RightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
		}
		public void DragAndDrop(WebElement src, WebElement dest) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).perform();
		}
		public void Quit() {
		driver.quit();
		}
		public void Close() {
		driver.close();
		}
		public void AcceptInAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
		}
		public void CancelInAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
		}
		public void SwitchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
		}
		public void SwitchToFrameByText(String data) {
		driver.switchTo().frame(data);
		}
		public void GetDefaultWindowinFrames() {
		driver.switchTo().defaultContent();
		}
		public void NavigateTo(String url) {
		driver.navigate().to(url);
		}
		public void NavigateBack() {
		driver.navigate().back();
		}
		public void NavigateForword() {
		driver.navigate().forward();
		}
		public void NavigateRefresh() {
		driver.navigate().refresh();
		}
		public boolean IsDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
		}
		public boolean IsSelected(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
		}
		public boolean IsEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		return enabled;
		}
		public boolean IsMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		return multiple;
		}
		public void DeSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
		}
		public void DeselectByValue(WebElement element, String data) {
		Select select = new Select(element);
		select.deselectByValue(data);
		}
		public void DeSelectByVisibleText(WebElement element, String data) {
		Select select = new Select(element);
		select.deselectByVisibleText(data);
		}
		public void DeSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
		}
		public int Lenth(String s) {
		int length = s.length();
		return length;
		}
		public boolean Equals(String s1, String s2) {
		boolean equals = s1.equals(s2);
		return equals;
		}
		public boolean EqualIgnoreCase(String s1, String s2) {
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		return equalsIgnoreCase;
		}
		public boolean Contains(String s1,String s2) {
		boolean contains = s1.contains(s2);
		return contains;
		}
		public boolean StartsWith(String s1,String s2) {
		boolean startsWith = s1.startsWith(s2);
		return startsWith;
		}
		public boolean EndsWith(String s1, String s2) {
		boolean endsWith = s1.endsWith(s2);
		return endsWith;
		}
		public boolean IsEmpty(String s) {
		boolean empty = s.isEmpty();
		return empty;
		}
		public boolean CreateFolder(File F) {
		boolean b = F.mkdir();
		return b;
		}
		public boolean CreateFolders(File F) {
		boolean b = F.mkdirs();
		return b;
		}
		public boolean CreateFile(File F)throws IOException{
		boolean newFile = F.createNewFile();
		return newFile;
		}
		public boolean CanRead(File F) {
		boolean read = F.canRead();
		return read;
		}
		public boolean CanWrite(File F){
		boolean write = F.canWrite();
		return write;
		}
		public boolean CanExecute(File F) {
		boolean execute = F.canExecute();
		return execute;
		}
		public boolean Exist(File F) {
		boolean exists = F.exists();
		return exists;
		}
		public String getData(String string, WebElement txtUserNme, String string2) {
			getData(string, txtUserNme, string2);
			return null;
		}
		public String passValue(WebElement txtUserNme, String string) {
			passValue(txtUserNme, string);
			return string;
			
			
		}
		public String passValue(WebElement location, int i) {
			passValue(location, i);
			return null;
			
			
		}
		public String SelectoOptionsByText(WebElement location, int i) {
			SelectOptionsByIndex(location, i);
			return null;
			
		}
		}


