package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hook;

public class AdactinLoc4 {
	public AdactinLoc4() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(name = "first_name")
	private WebElement fname;
	@FindBy(name = "last_name")
	private WebElement lname;
	@FindBy(name = "address")
	private WebElement address;
	@FindBy(name = "cc_num")
	private WebElement creditno;
	@FindBy(name = "cc_type")
	private WebElement credittype;
	@FindBy(name = "cc_exp_month")
	private WebElement cmonth;
	@FindBy(name = "cc_exp_year")
	private WebElement cyear;
	@FindBy(name = "cc_cvv")
	private WebElement ccvv;
	@FindBy(name = "book_now")
	private WebElement bookbtn;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditno() {
		return creditno;
	}

	public WebElement getCredittype() {
		return credittype;
	}

	public WebElement getCmonth() {
		return cmonth;
	}

	public WebElement getCyear() {
		return cyear;
	}

	public WebElement getCcvv() {
		return ccvv;
	}

	public WebElement getBookbtn() {
		return bookbtn;
	}

}
