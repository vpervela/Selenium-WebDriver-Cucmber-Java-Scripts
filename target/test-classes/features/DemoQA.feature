
@demo1


Feature: DemoQA

  Scenario: Verify Text Box tab

    Given I am on the "Elements" page

    When I click on the "Text Box" option

    Then I verify I am on the "Text Box" page



@demo2

  Scenario: Verify the Practice Form

    Given I am on the "Forms" page

    When I click on the "Practice Form" option

    Then I verify I am on the "Practice Form" page

    And I should see fields for "First Name, Last Name, Email, Gender, Mobile, Date of Birth, Subjects, Hobbies, Picture, Current Address, State and City"

@demo3
  Scenario: Click Button to See Alert

    Given I am on the "Alerts, Frame & Windows" page

    When I click on the "Alerts" option
    When I click the button for "Simple" alert
    Then an alert should appear
    And I accept the alert

    #Then I verify I am on the "Tex Box" page


@demo4

  Scenario: Open new tab and verify content

  Given I am on the "Alerts, Frame & Windows" page
  When I click on the "Browser Windows" option
  When I click the "New Tab" button
  Then a new window or tab should open
  And I switch to the new window or tab
  And I should see "This is a sample page" text


  @demo5

  Scenario: Open new window and verify content

    Given I am on the "Alerts, Frame & Windows" page
    When I click on the "Browser Windows" option
    When I click the "New Window" button
    Then a new window or tab should open
    And I switch to the new window or tab
    And I should see "This is a sample page" text


  Scenario: Verify content in the first frame
    Given I am on the "Alerts, Frame & Windows" page
    When I click on the "Frames" option
    When I switch to the frame with id "frame1"
    Then I should see "This is a sample page" text in the frame


  Scenario: Verify content in the second frame
    Given I am on the "Alerts, Frame & Windows" page
    When I click on the "Frames" option
    When I switch to the frame with id "frame2"
    Then I should see "This is a sample page" text in the frame

