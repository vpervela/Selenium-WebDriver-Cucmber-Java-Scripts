Feature: End-to-End Checkout Flow on nopCommerce

  Scenario: Logged-in user completes a full checkout flow
    Given I am on the registration page
    When I register with a Default User
    When I click on the "Computers" category tab
    And I click on the "Desktops" subcategory in the sidebar
    And I select the product "Build your own computer"
    And I add the product to the cart
    And I click on Shopping cart tab
    Then I proceed to the checkout page
#    And I fill out my shipping and payment details
#    And I confirm my order
#    Then I should see a success message for my order

  @e2e @computers @desktops
  Scenario: Logged-in user completes a full checkout flow Lenovo
    Given I am on the registration page
    When I register with a Default User
    When I click on the "Computers" category tab
    And I click on the "Desktops" subcategory in the sidebar
    And I select the product "Lenovo IdeaCentre 600 All-in-One PC"
    And I add the product to the cart
    And I click on Shopping cart tab
    Then I proceed to the checkout page
#    And I fill out my shipping and payment details
#    And I confirm my order
#    Then I should see a success message for my order

  @e2e @computers @desktops
  Scenario: Logged-in user completes a full checkout flow Build your own
    Given I am on the registration page
    When I register with a Default User
    When I click on the "Computers" category tab
    And I click on the "Desktops" subcategory in the sidebar
    And I select the product "Build your own computer"
    And I select RAM as "2 GB" for Desktop
    And I add the product to the cart
    And I click on Shopping cart tab
    Then I proceed to the checkout page
#    And I fill out my shipping and payment details
#    And I confirm my order
#    Then I should see a success message for my order

  Scenario: Guest user completes a full checkout flow
    Given I am on the nopCommerce homepage
    When I click on the "Computers" category tab
    And I click on the "Desktops" subcategory in the sidebar
    And I select the product "Build your own computer"
    And I add the product to the cart
    And I click on Shopping cart tab
    Then I proceed to the checkout page
#    And I fill out my guest shipping and payment details
#    And I confirm my order
#    Then I should see a success message for my order