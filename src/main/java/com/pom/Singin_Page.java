package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Singin_Page {
	public WebDriver driver;
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement email;
	
	@FindBy(id="SubmitCreate")
	private WebElement create_Acc;

	public Singin_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCreate_Acc() {
		return create_Acc;
	}
	

}
