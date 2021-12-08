package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath= "(//a[@title='Dresses'])[2]")
	private WebElement dresses;

	@FindBy(xpath = "(//a[@class='subcategory-name'])[1]")
	private WebElement casual_Dresses;

	public HomePage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getCasual_Dresses() {
		return casual_Dresses;
	}
}

