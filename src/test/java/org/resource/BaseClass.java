package org.resource;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.stepdefinition.Hook;

public class BaseClass {
	public void launch(String url) {
		Hook.driver.get(url);
	}

	public void type(WebElement w, String s) {
		w.sendKeys(s);
	}

	public void click(WebElement w) {
		w.click();
	}

	public void select(WebElement w, String st) {
		Select s = new Select(w);
		s.selectByVisibleText(st);
	}

	public void alert() {
		Alert a = Hook.driver.switchTo().alert();
		a.accept();
	}

	public void scroll(WebElement w) {
		JavascriptExecutor j = (JavascriptExecutor) Hook.driver;
		j.executeScript("arguments[0].scrollIntoview(true)", w);
	}

	public void screenShot(String path) throws Exception {
		TakesScreenshot t = (TakesScreenshot) Hook.driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
	}

}
