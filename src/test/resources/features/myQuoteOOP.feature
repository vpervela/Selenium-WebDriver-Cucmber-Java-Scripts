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




