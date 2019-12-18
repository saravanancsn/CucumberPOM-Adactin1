package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "org.stepdefinition", dryRun = false, monochrome = true, plugin = {
		"pretty", "html:target/html-report/Cu.POM" })
public class TestRunner {

}
