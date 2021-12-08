package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shiping_Page {
	public WebDriver driver;
	@FindBy(id="cgv")
	private WebElement agree;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
    private WebElement checkout4;
	public Shiping_Page(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver2,this);
	}
	public WebElement getAgree() {
		return agree;
	}
	public WebElement getCheckout4() {
		return checkout4;
	}
}
