@quote1

Feature: Fill out the Required Fields of Quote and arrive on the Confirmation Page

  Scenario: (Smoke Test) Fill out the Required Fields of Quote and arrive on the Confirmation Page
    Given I open the url "https://quote-qa.portnov.com/"
    Then I verify the page title is "Get a Quote"
    When I click on the Name field
    Then I see a new window
    When I enter "<firstname>" and "<lastname>" into the Name fields
    Then I click on the Save button
    And I switch to the parent window
    And I enter "<full name>" into the Username field
    And I enter "<email>" into the Email field
    When I enter "<password>" into the Password field
    And I enter "<confirmPassword>" into the Confirm Password field
    Then I check the Privacy Policy checkbox
    When I click on the "Submit" button at the bottom of the page
    Then I verify we see the Submitted Application Page