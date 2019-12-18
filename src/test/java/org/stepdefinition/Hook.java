package org.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {
	public static WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh\\workspace\\CucumberPOMAdactin\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void quit() {
		driver.quit();
	}

}
