@careers
  Feature: Careers project oop
    @careers1 @smoke
      Scenario: Careers Login page Smoke test
        Given I go to "careers" page oop
        When I click on "login" button
        And I type "student@example.com" into username field and "welcome" into password field
        When I click on "submit" button
        And I wait for 2 sec
        Then I should be logged in as a "student"
