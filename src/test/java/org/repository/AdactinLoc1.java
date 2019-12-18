package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hook;

public class AdactinLoc1 {
	public AdactinLoc1() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(id = "username")
	private WebElement user;
	@FindBy(id = "password")
	private WebElement pass;
	@FindBy(name = "login")
	private WebElement lgbtn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLgbtn() {
		return lgbtn;
	}

}
