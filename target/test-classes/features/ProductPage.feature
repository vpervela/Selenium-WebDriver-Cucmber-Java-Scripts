@emarket
Feature: EMarket Scenarios

  @emarket1
  Scenario: Verify the Product description page functionality
    Given I open the browser and navigate to "https://store-stage.portnov.com/" page
    Then I verify the page title "E-Market – Automation Practice Website"
    When I click on "iMac" item
#      Then I land on product description page
    And I verify product information contains the "iMac"
    When I Increase the Counter and Add to Cart
    Then I click on "Add to cart" button
    Then Verify Product has been added

  @emarket1
  Scenario Outline: Verify the Product description page functionality
    Given I open the browser and navigate to "https://store-stage.portnov.com/" page
    Then I verify the page title "E-Market – Automation Practice Website"
    When I click on "<product>" item
    And I verify product information contains the "<product>"
    When I Increase the Counter and Add to Cart
    Then I click on "Add to cart" button
    Then Verify Product has been added
    Examples:
      | product |
      |AirPods Pro|
      |Apple Watch Series 6|
      |iMac |


#  Checkout Flow/Confirmation
#  Add an Item from Landing Page
#  Go to Cart page and verify that you are there
#  Click Proceed to Checkout
#  Fill out the Checkout page and Click Place Order
#  Verify the Confirmation Page and all of the information there
#  Do this for EACH Item

#  @emarket3
#  Scenario: Verify Checkout Flow
#    Given I open the browser and navigate to "https://store-stage.portnov.com/" page
#    Then I verify the page title "E-Market – Automation Practice Website"
#    Then I click on "Add to cart" button
#    Then I click on "View Cart"
#    When I click on "Proceed To Check Out" I should land on check out page
#    Then I enter "firstName","lastName" and "emailAddress" into the  fields
#    And I click  "Place Order" button
#    Then I verify the Confirmation Page and all of the information


  @emarket4
  Scenario Outline: Verify Checkout Flow
    Given I open the browser and navigate to "https://store-stage.portnov.com/" page
    Then I verify the page title "E-Market – Automation Practice Website"
    Then I click on "Add to cart" button
    Then I click on "View Cart"
    When I click on "Proceed To Check Out" I should land on check out page
    Then I enter <firstName>,<lastName> and <emailAddress> into the  fields
    And I click  "Place Order" button
    Then I verify the Confirmation Page and all of the information
    Examples:
      | firstName   | lastName   | emailAddress   |
      | "Tom" | "Cruise" | "tom@example.com" |
      |"John" | "Karen"  | "john@example.com"|

