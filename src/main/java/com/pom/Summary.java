package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary {
	public WebDriver driver;
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusclick1;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusclick2;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusclick3;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusclick4;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusclick5;
	
	@FindBy(xpath="//i[@class='icon-plus']")
	private WebElement plusclick6;
	
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement checkout2;

	public Summary(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	public WebElement getPlusclick1() {
		return plusclick1;
	}
	public WebElement getPlusclick2() {
		return plusclick2;
	}
	public WebElement getPlusclick3() {
		return plusclick3;
	}
	public WebElement getPlusclick4() {
		return plusclick4;
	}

	public WebElement getPlusclick5() {
		return plusclick5;
	}

	public WebElement getPlusclick6() {
		return plusclick6;
	}

	public WebElement getCheckout2() {
		return checkout2;
	}
	

	
}
