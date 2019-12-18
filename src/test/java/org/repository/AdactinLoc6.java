package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hook;

public class AdactinLoc6 {
	public AdactinLoc6() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(name = "ids[]")
	private WebElement radio2;
	@FindBy(name = "cancelall")
	private WebElement cancelbtn;
	@FindBy(name = "logout")
	private WebElement lgoutbtn;

	public WebElement getRadio2() {
		return radio2;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public WebElement getLgoutbtn() {
		return lgoutbtn;
	}

}
