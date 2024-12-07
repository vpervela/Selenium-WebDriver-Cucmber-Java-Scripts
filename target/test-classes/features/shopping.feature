Feature: Search and Learn More about the Marc Jacobs Leather Tote Bag

  Background As a Fashion Enthusiast,
  I want to learn more about the Marc Jacobs Tote Bag,
  so that I can decide if it fits my style and needs.

<<<<<<< HEAD
#  Navigate to the page;
#  Dismiss any alerts there may be
#  Verify the Title of the Page matches
#  our expectation
=======
  Scenario: Coach shopping
#  Navigate to the page;
#  Dismiss any alerts there may be
#  Verify the Title of the Page matches our expectation
>>>>>>> 16262e2767d759f5267f62b7563a2aea12a10abf
#  Search for the EXACT TITLE if possible
#  Type in the Item we are searching for in the Search Box
#  Most sites will have a Search bar or Search Icon; Use whatever is there
#  Click Search button
#  Verify we landed on the right page
#  This will require waiting for an element on the page
<<<<<<< HEAD
#    Then verify the item we are looking for is present (by text)
#  Verify the xpath you have chosen contains the exact text you need


  Scenario: Verify Searching for a “The Leather Tote Bag” and opening the product page
    Given I open url "https://www.ferragamo.com/shop/us/en"
    And I wait for 3 sec
    Then I should see page title as "Ferragamo United States | Official Online Store"
    And I wait for element with xpath "//a[text()='Accept all cookies']" to be present
    And I click on element using JavaScript with xpath "//a[text()='Accept all cookies']"
    When I click on element with xpath "//a[@class='header-r23__search']"
    And I wait for element with xpath "//input[@id='searchAutocompleteR19']" to be present
    When I type "Leather Moccasin " into element with xpath "//input[@id='searchAutocompleteR19']"
    And I wait for 4 sec
    Then element with xpath "//div[@class='featured featured--suggested']" should contain text "Moccasin"

    



=======
    Given I open url "https://www.coach.com"
    Then I should see page title as "COACH® Official Site - Designer Handbags, Wallets, Clothing, Menswear, Shoes & More"
    And I wait for element with xpath "//iframe[@id='attentive_creative']" to be present
    When I switch to iframe with xpath "//iframe[@id='attentive_creative']"
    And I wait for element with xpath "//button[@id='dismissbutton2']" to be present
    And I click on element using JavaScript with xpath "//button[@id='dismissbutton2']"
    And I switch to default content
    And I click on element with xpath "//input[@id='SearchInput']"
    And I type "Signature leather Belt" into element with xpath "//input[@id='SearchInput']"
    And I click on element using JavaScript with xpath "//div[@data-qa='cm_icon_search']"
    And I wait for element with xpath "//div[@id='product-search-results']" to be present
    Then element with xpath "//*[contains(text(),'Signature Buckle Cut To Size Reversible Belt, 38mm')][1]" should contain text "Belt"

    
    
>>>>>>> 16262e2767d759f5267f62b7563a2aea12a10abf
