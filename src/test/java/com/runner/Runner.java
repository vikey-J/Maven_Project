package com.runner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.base_Class.Base_Class;

public class Runner extends Base_Class{
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		 driver = getBrowser("chrome");
		url("https://adactinhotelapp.com/");
		//login
		WebElement username = driver.findElement(By.id("username"));
		sendkeys(username, "vikneshkumar");
		
		WebElement pass = driver.findElement(By.id("password"));
		sendkeys(pass, "VCVM24");
		
		WebElement login = driver.findElement(By.id("login"));
		click(login);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Search Hotel
		
		WebElement location = driver.findElement(By.id("location"));
		dropdown(location, "New York");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		dropdown(hotel, "Hotel Sunshine");
		
		WebElement roomtypes = driver.findElement(By.id("room_type"));
        dropdown(roomtypes, "Double");
        
		WebElement rooms = driver.findElement(By.id("room_nos"));
		dropdown(rooms, "2");
		
		WebElement date1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		sendkeys(date1, "22/11/2021");
		
		WebElement date2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		sendkeys(date2, "24/11/2021");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		dropdown(adult,"3");
		
		WebElement child = driver.findElement(By.id("child_room"));
		dropdown(child, "2");
		
		WebElement search = driver.findElement(By.id("Submit"));
		click(search);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// Select hotel
		
		WebElement agree = driver.findElement(By.xpath("//input[@type='radio']"));
		click(agree);
		
		WebElement continuee = driver.findElement(By.id("continue"));
		click(continuee);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		// Book a Hotel
		
		WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		sendkeys(fname, "VIKNESH");
		
		WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		sendkeys(lname,"KUMAR");
		
		WebElement adress = driver.findElement(By.id("address"));
		sendkeys(adress,"no.17a,Avengers Tour,New York");
		
		WebElement credit_Card = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		sendkeys(credit_Card,"9876123405467744");
		
		WebElement cc_Type = driver.findElement(By.id("cc_type"));
		dropdown(cc_Type, "MAST");
		
		WebElement exp_Month = driver.findElement(By.id("cc_exp_month"));
		dropdown(exp_Month, "10");
		
		WebElement exp_Year = driver.findElement(By.id("cc_exp_year"));
		dropdown(exp_Year, "2022");
		
		WebElement ccv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		sendkeys(ccv,"9876");
		
		WebElement booknow = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		click(booknow);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Booking Confirmation
		
		WebElement logout = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
		click(logout);
		
		// Take Screenshot output
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File source=ts.getScreenshotAs(OutputType.FILE);
//		File destination=new File("C:\\Users\\my pc\\eclipse-workspace\\Selenium_Project\\Screenshot.miniproject2.png");
//		FileUtils.copyFile(source, destination);
//				
		
		
	}
}