package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hook;

public class AdactinLoc3 {
	public AdactinLoc3() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(name = "radiobutton_0")
	private WebElement radio1;
	@FindBy(name = "continue")
	private WebElement cntebtn;

	public WebElement getRadio1() {
		return radio1;
	}

	public WebElement getCntebtn() {
		return cntebtn;
	}

}
