#"Add to Cart" functionality
#Add to Cart from Landing Page
#Click View Cart Verify Item is in Cart
#Change the Quantity of the Item and Click Update
#Verify Items are updated
#Click the Remove Icon and Verify Item is Updated
#Add EACH Item from product Page


@cart1
Feature: Add To Cart Functionality

#  Scenario: Verify Add To Cart From Landing Page
#    Given I open the browser and navigate to "https://store-stage.portnov.com/" page
#    Then I verify the page title "E-Market – Automation Practice Website"
#    Then I click on "Add To Cart" button of "iMac"
#    And I click on "View Cart" button
#    Then I verify the "iMac" is added to the cart


  @cart2
  Scenario Outline: Verify Add To Cart From Landing Page
    Given I open the browser and navigate to "https://store-stage.portnov.com/" page
    Then I verify the page title "E-Market – Automation Practice Website"
    Then I click on <button> button of <product>
    And I click on "View cart" button
    Then I verify the <product> is added to the cart
    Examples:
      | button        | product |
      | "Add To Cart" | "AirPods Pro"|
      | "Add To Cart" | "Apple Watch Series 6"|
      | "Add To Cart" | "iMac"  |


