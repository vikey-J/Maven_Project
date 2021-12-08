package com.base_Class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Base_Class {
	public static WebDriver driver;     //driver = null
	
	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+"\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\chromedriver_win32\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
   }
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void click(WebElement element) {
		element.click();
	}
	public static void sendkeys(WebElement element,String value) {
		element.sendKeys(value);
		}
	
	public static void moveToElement(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		
	}
	
	public static void dropdown(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public static void javaScriptExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
	}
	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments.[0].scrollIntoView();", element);
	}
	public static void sleep(int milliseconds)throws InterruptedException {
		Thread.sleep(milliseconds);
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void  implicitWait(int seconds, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
	}
	public static void explicitWait(int seconds, WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public static void fluentWait( int timeoutseconds, int pollingseconds, TimeUnit format ) {
    Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(30,format).pollingEvery(5, format).ignoring(Exception.class);
	}
	public static void screenshot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\my pc\\eclipse-workspace\\Maven_Project\\Screenshot\\Ts.png");
		FileUtils.copyFile(source, destination);
	}
	public static void quit() {
		driver.quit();
	}
	public static void close() {
		driver.close();
	}
}
	
