@tag
Feature: To validate the work flow of the adactin web application

  @tag1
  Scenario Outline: : To check the adactin web application workflow is as per the requirement
    Given Open the browser and launch the application
    When Log-in using valid credantials
      | saravanan4896 | Csn@4896 |
    And Search hotel by adding necessary details
      | Sydney | Hotel Creek | Double | 1 - One | 18/12/2019 | 19/12/2019 | 2 - Two | 1 - One |
    Then Hotel details we entered appears and select , take screenshot and click continue
    And Enter the necessary details in the displayed page "<name>""<last>""<address>""<card>""<type>""<month>""<year>""cvv>" and click Book now
    And Scroll down the displayed page and take screenshot and click My Itenary and click the booked hotel in the displayed page then click cancel selected
    And Click ok to the alert
    And Click logout and take screenshot ,quit the browser.

    Examples: 
      | name | last | address                                            | card             | type | month | year | cvv  |
      | sss  | vvv  | 2nd street,near George cottages,New Orleans,Alaska | 7843569813855767 | VISA | May   | 2022 | 2334 |
