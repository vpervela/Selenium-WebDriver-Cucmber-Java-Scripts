# Page Object Model based scenario
    # 1. Write test case to automate
    # 2. Create Page Objects needed for test case
        # QuoteForm.java
          # don't boil the ocean - add only selectors you need for this scenario
        # QuoteResult.java
    # 3. Write step definitions with the usage of Page Objects

@quote
   Feature: My Quote Project Smoke Test OOP
     @quote1
     Scenario: Quote smoke test oop
       Given I navigate to "quote" page oop
       When I fill out the required fields on the form oop
       And I "accept" third party agreement oop
       When I type "Richard Roe" into contact person name field and "0123456789" into contact person phone field oop
       And I submit the quote form oop
       And I wait for 2 sec
       Then I verify third party agreement is "accepted" oop
       Then I see required fields submitted successfully oop
       And I verify that contact person name is "Richard Roe" and phone is "0123456789" oop

     @quote3
     Scenario: working with alerts
       Given I navigate to "quote" page oop
       And I "accept" third party agreement oop

     @quote4
     Scenario: working with frames
       Given I navigate to "quote" page oop
       When I type "Richard Roe" into contact person name field and "0123456789" into contact person phone field oop
       
     @quote5
     Scenario: working with windows
        Given I navigate to "quote" page oop
        Then I verify that "Document 2" present in related documents
        And I wait for 2 sec
        When I fill out the required fields on the form oop
        And I submit the quote form oop
        Then I see required fields submitted successfully oop
       

     @quote6 # with Vladimir
     Scenario: working with iframes POM
        Given I navigate to quote page oop
        And I wait for 2 sec
        Then I go to iframe oop
        And I type contact person name "Joe" oop
        And I type contact person phone "1234567890" oop
        And I go outside iframe oop
        And I wait for 2 sec
        And I type name "Joe" oop
