package org.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefinition.Hook;

public class AdactinLoc2 {
	public AdactinLoc2() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(name = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotel;
	@FindBy(name = "room_type")
	private WebElement roomtype;
	@FindBy(name = "room_nos")
	private WebElement roomno;
	@FindBy(name = "datepick_in")
	private WebElement datein;
	@FindBy(name = "datepick_out")
	private WebElement dateout;
	@FindBy(name = "adult_room")
	private WebElement adult;
	@FindBy(name = "child_room")
	private WebElement child;
	@FindBy(name = "Submit")
	private WebElement sbmtbtn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSbmtbtn() {
		return sbmtbtn;
	}

}
