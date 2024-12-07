@quote
Feature: To Automate the Quote

  @quote1
  Scenario Outline: (Smoke Test) Fill out the Required Fields of Quote and arrive on the Confirmation Page
    Given I visit Quote Page in the <env> Environment
    When I enter <username> for the Username field
    And I enter <fname> for first name and <lname> for the last name in the Name field
    And I enter <email> for the Email field
    When I enter <pass> for the Password field
    And I enter <pass> for the Confirm Password field
    Then I <check> the Privacy Policy Policy checkbox
    When I click on the "Submit" button at the bottom of the page
    Then I verify we see the Submitted Application Page
    Then I verify username is <username>, first name is <fname>, last name is <lname>, email is <email>, and password is <pass>
    Examples:
      | env  | username      | fname | lname | email           | pass       | check   |
      | "Qa" | "Noob Saibot" | "B"   | "Han" | "test@test.com" | "abcd1234" | "check" |
      | "Qa" | "Naveen Kurry" | "K"   | "Kurry" | "test1@test.com" | "abcd12345"  | "check" |
      | "Qa" | "David Mark" | "D"   | "Mark" | "test2@test.com" | "abcd12346" | "check" |
      | "Qa" | "Peter Desouza" | "D"   | "Desouza" | "test3@test.com" | "abcd12347"  | "check" |
