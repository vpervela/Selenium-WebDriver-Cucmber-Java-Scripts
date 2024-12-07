Feature: User Registration and Login
  As a new user
  I want to be able to register and log in to the nopCommerce website
  So that I can access my account

  Scenario: Register a new user
    Given I am on the registration page
    When I register with a Default User
    Then I should see a registration success message
    And I click Logout
    When I am on the login page
    When I enter Default Credentials
    Then I verify something

  Scenario: Register a new user with specific details
    Given I am on the registration page
    And I wait for 2 sec
    When I register using first name "John", last name "D", email "john11@example.com", and password "abcd1234"
    Then I should see a registration success message


    @nop3
    Scenario: Hover over the "Computers" category tab and verify subcategories
      Given I am on the nopCommerce homepage
      When I hover over the "Computers" category tab
      Then I should see subcategory:
        |Desktops |
        |Notebooks|
        |Software |
      And I should see the "Notebooks" subcategory in the sidebar
      And I should see the "Software" subcategory in the sidebar


    @nop4
    Scenario: Hover over the "Electronics" category tab and verify subcategories
      Given I am on the nopCommerce homepage
      When I hover over the "Electronics" category tab
        Then I should see subcategory:
            |Camera & photo|
            |Cell phones  |
            |Others       |


    @nop5
    Scenario: Hover over the "Apparel" category tab and verify subcategories
      Given I am on the nopCommerce homepage
      When I hover over the "Apparel" category tab
      Then I should see subcategory:
        |Clothing |
        |Shoes    |
        |Accessories|
      And I should see the "Clothing" subcategory in the sidebar
      And I should see the "Shoes" subcategory in the sidebar
      And I should see the "Accessories" subcategory in the sidebar


    @nop6
    Scenario: webDriver wait
      Given I am on the nopCommerce homepage
      When I click and wait for Shopping Cart
#      Then I should see the Shopping Cart page
