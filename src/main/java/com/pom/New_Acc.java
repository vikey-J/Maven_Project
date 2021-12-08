package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class New_Acc {
	public WebDriver driver;
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement mr;
	@FindBy(id="customer_firstname")
	private WebElement firstname;
	@FindBy(id="customer_lastname")
	private WebElement lastname;	
	@FindBy(id="passwd")
    private WebElement password;
	@FindBy(id="firstname")
	private WebElement adress_Fn;	
	@FindBy(id="lastname")
	private WebElement adress_Ln;
	@FindBy(id="company")
	private WebElement adress_Company;	
	@FindBy(id="address1")
	private WebElement address;
	@FindBy(id="city")
	private WebElement city;
	@FindBy(xpath="//select[@name='id_state']")
	private WebElement state;
	@FindBy(id="postcode")
	private WebElement post;
	@FindBy(id="phone_mobile")
	private WebElement phoneno;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[3]")
	private WebElement register;
	public New_Acc(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this);
	}
	public WebElement getMr() {
		return mr;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getAdress_Fn() {
		return adress_Fn;
	}
	public WebElement getAdress_Ln() {
		return adress_Ln;
	}
	public WebElement getAdress_Company() {
		return adress_Company;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getPost() {
		return post;
	}
	public WebElement getPhoneno() {
		return phoneno;
	}
	public WebElement getRegister() {
		return register;
	}
}
