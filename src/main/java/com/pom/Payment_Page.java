package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Payment_Page {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement bank;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
    private WebElement confirm;
	public Payment_Page(WebDriver driver2) {
    this.driver=driver2;
    PageFactory.initElements(driver2,this);
	}
	public WebElement getBank() {
		return bank;
	}
	public WebElement getConfirm() {
		return confirm;
	}
}
