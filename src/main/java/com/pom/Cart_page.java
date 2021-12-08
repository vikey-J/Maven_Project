package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Cart_page {
	public WebDriver driver;
	@FindBy(xpath = "//span[@class='available-now']" )
     private  WebElement instock;
	@FindBy(xpath="//a[@title='Add to cart']")
	private WebElement addcart;
	@FindBy(xpath="(//i[@class='icon-chevron-right right'])[2]")
	private WebElement checkout1;
	public Cart_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebElement getInstock() {
		return instock;
	}
	public WebElement getAddcart() {
		return addcart;
	}
	public WebElement getCheckout1() {
		return checkout1;
	}
	}
