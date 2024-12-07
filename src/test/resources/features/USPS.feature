  @USPS
  Feature: USPS Zipcode Validation and Priority Mail Page

    @USPS1
    Scenario: Validate ZIP code for Portnov Computer School
      Given I navigate to usps lookup a zip code by address page
      When I fill out "Portnov Computer school" company, "4970 El Camino Real" street, "Los Altos" city, "CA" state
      And I click Find button
      And I wait for 2 sec
      Then I validate "94022" zip code exists in the result

    @usps1 @smoke @outline
    Scenario Outline: Validate ZIP code for Portnov Computer School
      Given I navigate to usps lookup a zip code by address page
      When I fill out "<company>" company, "<street>" street, "<city>" city, "<state>" state
      And I click Find button
      And I wait for 2 sec
      Then I validate "<expected - zip>" zip code exists in the result
      Examples:
      |company                 | street              | city      | state | expected - zip
      |Portnov Computer school | 4970 El Camino Real | Los Altos | CA    | 94022
      |Portnov Computer school | 11 Wall Street      | New York  | NY    | 10005


    @USPS2
  Scenario: Validate Priority Mail Page for Ship Now
    Given I navigate to usps priority mail page
    When I click Ship Now from priority mail page
    And I wait for 2 sec
    Then I validate "Already have an account?" message present


  @USPS3
  Scenario: Validate Boxes count
    Given I navigate to usps lookup a zip code by address page
    When I hover over search and search for "Boxes"
    And I filter results with "Send"
    And I wait for 2 sec
    Then I verify the displayed result count as 8



