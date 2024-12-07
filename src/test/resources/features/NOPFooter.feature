Feature: Footer of the NOP Commerce

  Scenario: Verify Facebook link opens in a new tab
    Given I am on the nopCommerce homepage
    When I click on the "Facebook" link in the footer
    Then I should be redirected to the "Facebook" page

  Scenario: Verify Twitter link opens in a new tab
    Given I am on the nopCommerce homepage
    When I click on the "Twitter" link in the footer
    Then I should be redirected to the "X" page

  Scenario: Verify YouTube link opens in a new tab
    Given I am on the nopCommerce homepage
    When I click on the "YouTube" link in the footer
    Then I should be redirected to the "YouTube" page


    #close window
  Scenario: Verify Facebook link opens in a new tab and back
    Given I am on the nopCommerce homepage
    When I click on the "Facebook" link in the footer
    Then I should be redirected to the "Facebook" page
    When I close the new tab
    Then I should return back to nopCommerce homepage

  Scenario: Verify Twitter link opens in a new tab and back
    Given I am on the nopCommerce homepage
    When I click on the "Twitter" link in the footer
    Then I should be redirected to the "X" page
    When I close the new tab
    Then I should return back to nopCommerce homepage

  Scenario: Verify YouTube link opens in a new tab and back
    Given I am on the nopCommerce homepage
    When I click on the "YouTube" link in the footer
    Then I should be redirected to the "YouTube" page
    When I close the new tab
    Then I should return back to nopCommerce homepage
