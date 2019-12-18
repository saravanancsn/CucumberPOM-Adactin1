$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Adactin.feature");
formatter.feature({
  "name": "To validate the work flow of the adactin web application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "name": ": To check the adactin web application workflow is as per the requirement",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "Open the browser and launch the application",
  "keyword": "Given "
});
formatter.step({
  "name": "Log-in using valid credantials",
  "keyword": "When ",
  "rows": [
    {
      "cells": [
        "saravanan4896",
        "Csn@4896"
      ]
    }
  ]
});
formatter.step({
  "name": "Search hotel by adding necessary details",
  "keyword": "And ",
  "rows": [
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Double",
        "1 - One",
        "18/12/2019",
        "19/12/2019",
        "2 - Two",
        "1 - One"
      ]
    }
  ]
});
formatter.step({
  "name": "Hotel details we entered appears and select , take screenshot and click continue",
  "keyword": "Then "
});
formatter.step({
  "name": "Enter the necessary details in the displayed page \"\u003cname\u003e\"\"\u003clast\u003e\"\"\u003caddress\u003e\"\"\u003ccard\u003e\"\"\u003ctype\u003e\"\"\u003cmonth\u003e\"\"\u003cyear\u003e\"\"cvv\u003e\" and click Book now",
  "keyword": "And "
});
formatter.step({
  "name": "Scroll down the displayed page and take screenshot and click My Itenary and click the booked hotel in the displayed page then click cancel selected",
  "keyword": "And "
});
formatter.step({
  "name": "Click ok to the alert",
  "keyword": "And "
});
formatter.step({
  "name": "Click logout and take screenshot ,quit the browser.",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "last",
        "address",
        "card",
        "type",
        "month",
        "year",
        "cvv"
      ]
    },
    {
      "cells": [
        "sss",
        "vvv",
        "2nd street,near George cottages,New Orleans,Alaska",
        "7843569813855767",
        "VISA",
        "May",
        "2022",
        "2334"
      ]
    }
  ]
});
formatter.scenario({
  "name": ": To check the adactin web application workflow is as per the requirement",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open the browser and launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinStepDefinition.open_the_browser_and_launch_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Log-in using valid credantials",
  "rows": [
    {
      "cells": [
        "saravanan4896",
        "Csn@4896"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AdactinStepDefinition.log_in_using_valid_credantials(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search hotel by adding necessary details",
  "rows": [
    {
      "cells": [
        "Sydney",
        "Hotel Creek",
        "Double",
        "1 - One",
        "18/12/2019",
        "19/12/2019",
        "2 - Two",
        "1 - One"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.search_hotel_by_adding_necessary_details(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hotel details we entered appears and select , take screenshot and click continue",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.hotel_details_we_entered_appears_and_select_take_screenshot_and_click_continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the necessary details in the displayed page \"sss\"\"vvv\"\"2nd street,near George cottages,New Orleans,Alaska\"\"7843569813855767\"\"VISA\"\"May\"\"2022\"\"cvv\u003e\" and click Book now",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.enter_the_necessary_details_in_the_displayed_page_and_click_Book_now(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Scroll down the displayed page and take screenshot and click My Itenary and click the booked hotel in the displayed page then click cancel selected",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.scroll_down_the_displayed_page_and_take_screenshot_and_click_My_Itenary_and_click_the_booked_hotel_in_the_displayed_page_then_click_cancel_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ok to the alert",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.click_ok_to_the_alert()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click logout and take screenshot ,quit the browser.",
  "keyword": "And "
});
formatter.match({
  "location": "AdactinStepDefinition.click_logout_and_take_screenshot_quit_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});