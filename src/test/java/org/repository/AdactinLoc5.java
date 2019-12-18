package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hook;

public class AdactinLoc5 {
	public AdactinLoc5() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(name = "search_hotel")
	private WebElement hotelbtn;
	@FindBy(name = "my_itinerary")
	private WebElement itibtn;

	public WebElement getItibtn() {
		return itibtn;
	}

	public WebElement getHotelbtn() {
		return hotelbtn;
	}

}
