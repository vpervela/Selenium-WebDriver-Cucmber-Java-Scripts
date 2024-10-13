@quote
  Feature: Quote Project

    @quote1
    Scenario: Quote smoke test
      Given I navigate to "https://skryabin.com/market/quote.html" page
      Then I verify the page title as "Get a Quote"
      When I enter "SaraM" into username field
      And I wait for 2 sec
      And I enter "abcd1234" into password field
      When I click on element with xpath "//input[@id='name']"
      Then I should see a new window
      And I enter "Sara" into firstname field
      And I enter "M" into middlename field
      And I enter "Lee" into lastname field
      When I click on element with xpath "//span[contains(text(),'Save')]"
      Then I switch to parent window
      And I enter "sara@example.com" into Email field
      And I enter "abcd1234" into Confirm Password field
      When I select the Privacy Policy check box
      And I click on the submit button
      Then I verify we see the Submitted Application Page




