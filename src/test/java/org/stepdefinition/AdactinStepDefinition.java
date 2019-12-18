package org.stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.repository.AdactinLoc1;
import org.repository.AdactinLoc2;
import org.repository.AdactinLoc3;
import org.repository.AdactinLoc4;
import org.repository.AdactinLoc5;
import org.repository.AdactinLoc6;
import org.resource.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinStepDefinition extends BaseClass {
	@Given("Open the browser and launch the application")
	public void open_the_browser_and_launch_the_application() {
		launch("https://www.adactin.com/HotelAppBuild2/");
	}

	AdactinLoc1 a1 = new AdactinLoc1();
	AdactinLoc2 a2 = new AdactinLoc2();
	AdactinLoc3 a3 = new AdactinLoc3();
	AdactinLoc4 a4 = new AdactinLoc4();
	AdactinLoc5 a5 = new AdactinLoc5();
	AdactinLoc6 a6 = new AdactinLoc6();

	@When("Log-in using valid credantials")
	public void log_in_using_valid_credantials(io.cucumber.datatable.DataTable dataTable) {
		List<String> li = dataTable.asList(String.class);
		type(a1.getUser(), li.get(0));
		type(a1.getPass(), li.get(1));
		click(a1.getLgbtn());
	}

	@When("Search hotel by adding necessary details")
	public void search_hotel_by_adding_necessary_details(io.cucumber.datatable.DataTable dataTable) throws Exception {
		List<String> li = dataTable.asList(String.class);
		Hook.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		select(a2.getLocation(), li.get(0));
		select(a2.getHotel(), li.get(1));
		select(a2.getRoomtype(), li.get(2));
		select(a2.getRoomno(), "2 - Two");
		type(a2.getDatein(), "18/12/2019");
		type(a2.getDateout(), "19/12/2019");
		select(a2.getAdult(), "2 - Two");
		select(a2.getChild(), "1 - One");
		screenShot("F:\\SS\\AdactinPOM\\1.png");
		click(a2.getSbmtbtn());
	}

	@Then("Hotel details we entered appears and select , take screenshot and click continue")
	public void hotel_details_we_entered_appears_and_select_take_screenshot_and_click_continue() throws Exception {
		Hook.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		click(a3.getRadio1());
		screenShot("F:\\SS\\AdactinPOM\\2.png");
		click(a3.getCntebtn());
	}

	@Then("Enter the necessary details in the displayed page {string}{string}{string}{string}{string}{string}{string}{string} and click Book now")
	public void enter_the_necessary_details_in_the_displayed_page_and_click_Book_now(String string, String string2,
			String string3, String string4, String string5, String string6, String string7, String string8)
			throws Exception {
		Hook.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		type(a4.getFname(), string);
		type(a4.getLname(), string2);
		type(a4.getAddress(), string3);
		type(a4.getCreditno(), string4);
		select(a4.getCredittype(), string5);
		select(a4.getCmonth(), string6);
		select(a4.getCyear(), string7);
		Hook.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		type(a4.getCcvv(), "5656");
		screenShot("F:\\SS\\AdactinPOM\\3.png");
		click(a4.getBookbtn());

	}

	@Then("Scroll down the displayed page and take screenshot and click My Itenary and click the booked hotel in the displayed page then click cancel selected")
	public void scroll_down_the_displayed_page_and_take_screenshot_and_click_My_Itenary_and_click_the_booked_hotel_in_the_displayed_page_then_click_cancel_selected()
			throws Exception {
		Hook.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		screenShot("F:\\SS\\AdactinPOM\\4.png");
		click(a5.getItibtn());

	}

	@Then("Click ok to the alert")
	public void click_ok_to_the_alert() throws Exception {
		Hook.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		click(a6.getRadio2());
		click(a6.getCancelbtn());
		alert();
		screenShot("F:\\SS\\AdactinPOM\\5.png");
	}

	@Then("Click logout and take screenshot ,quit the browser.")
	public void click_logout_and_take_screenshot_quit_the_browser() throws Exception {
		Hook.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		click(a6.getLgoutbtn());
		screenShot("F:\\SS\\AdactinPOM\\6.png");

	}

}
