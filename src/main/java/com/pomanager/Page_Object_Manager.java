package com.pomanager;

import org.openqa.selenium.WebDriver;

import com.pom.Adress_Page;
import com.pom.Cart_page;
import com.pom.HomePage;
import com.pom.New_Acc;
import com.pom.Payment_Page;
import com.pom.Shiping_Page;
import com.pom.Singin_Page;
import com.pom.Summary;

public class Page_Object_Manager {
	public WebDriver driver;
	private HomePage hp;
	private Cart_page cp;
	private Summary sum;
	private Singin_Page singin;
	private New_Acc np;
	private Adress_Page ap;
	private Shiping_Page sp;
	private Payment_Page pp;

	public Page_Object_Manager(WebDriver driver2) {
    this.driver=driver2;
	}

	public HomePage getInstanceHp() {
		if (hp == null) {
			hp = new HomePage(driver);
		}
		return hp;
	}

	public Cart_page getInstanceCp() {
		if (cp == null) {
			cp = new Cart_page(driver);
		}
		return cp;
	}

	public Summary getInstanceSum() {
		if (sum == null) {
			sum = new Summary(driver);
		}
		return sum;
	}

	public Singin_Page getInstanceSingin() {
		if (singin == null) {
			singin = new Singin_Page(driver);
		}
		return singin;
	}

	public New_Acc getInstanceNp() {
		if (np == null) {
			np = new New_Acc(driver);
		}
		return np;
	}

	public Adress_Page getInstanceAp() {
		if (ap == null) {
			ap = new Adress_Page(driver);
		}
		return ap;
	}

	public Shiping_Page getInstanceSp() {
		if (sp == null) {
			sp = new Shiping_Page(driver);
		}
		return sp;
	}

	public Payment_Page getInstancePp() {
		if (pp == null) {
			pp = new Payment_Page(driver);
		}
		return pp;
	}
}