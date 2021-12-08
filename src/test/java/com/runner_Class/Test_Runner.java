package com.runner_Class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.pom.Adress_Page;
import com.pom.Cart_page;
import com.pom.HomePage;
import com.base_Class.Base_Class;
import com.pom.New_Acc;
import com.pom.Payment_Page;
import com.pom.Shiping_Page;
import com.pom.Singin_Page;
import com.pom.Summary;
import com.pomanager.Page_Object_Manager;

public class Test_Runner extends Base_Class {
	public static WebDriver driver=getBrowser("chrome");
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
    public static void main(String[] args) {
		url("http://automationpractice.com/index.php");
		click(pom.getInstanceHp().getDresses());
        implicitWait(30, TimeUnit.SECONDS);
        click(pom.getInstanceHp().getCasual_Dresses());
		implicitWait(30, TimeUnit.SECONDS);
		// move the mouse to instock
		moveToElement(driver, pom.getInstanceCp().getInstock());
		click(pom.getInstanceCp().getAddcart());
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstanceCp().getCheckout1());
		// 1.summary
		javaScriptExecutor();
		implicitWait(30, TimeUnit.SECONDS);
		// click the + button for 6 times
        click(pom.getInstanceSum().getPlusclick1());
        click(pom.getInstanceSum().getPlusclick2());
        click(pom.getInstanceSum().getPlusclick3());
        click(pom.getInstanceSum().getPlusclick4());
        click(pom.getInstanceSum().getPlusclick5());
        click(pom.getInstanceSum().getPlusclick6());
        implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstanceSum().getCheckout2());
		// 2.Signin
        implicitWait(30, TimeUnit.SECONDS);
		sendkeys(pom.getInstanceSingin().getEmail(),"vikey12@gmail.com");
		click(pom.getInstanceSingin().getCreate_Acc());
		implicitWait(30, TimeUnit.SECONDS);
		//create an account page
		click(pom.getInstanceNp().getMr());
		sendkeys(pom.getInstanceNp().getFirstname(), "viknesh");
		sendkeys(pom.getInstanceNp().getLastname(),"kumar");
		sendkeys(pom.getInstanceNp().getPassword(),"vikey@123");
		sendkeys(pom.getInstanceNp().getAdress_Fn(),"viknesh");
		sendkeys(pom.getInstanceNp().getAdress_Ln(),"kumar" );
		sendkeys(pom.getInstanceNp().getAdress_Company(),"DLF");
		sendkeys(pom.getInstanceNp().getAddress(),"7,DLF road");
		sendkeys(pom.getInstanceNp().getCity(),"Chennai");
		dropdown(pom.getInstanceNp().getState(), "14");
		sendkeys(pom.getInstanceNp().getPost(),"00000");
		sendkeys(pom.getInstanceNp().getPhoneno(),"9876543210");
		click(pom.getInstanceNp().getRegister());
		implicitWait(30, TimeUnit.SECONDS);
		//3.address
		implicitWait(30, TimeUnit.SECONDS);
        click(pom.getInstanceAp().getCheckout3());
		// 4.Shipping
        implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstanceSp().getAgree());
		click(pom.getInstanceSp().getCheckout4());
		// 5.Payment
		implicitWait(30, TimeUnit.SECONDS);
		click(pom.getInstancePp().getBank());
		click(pom.getInstancePp().getConfirm());
		javaScriptExecutor();

	}
}



