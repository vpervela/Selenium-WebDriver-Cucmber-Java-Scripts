@predefined
Feature: Smoke steps

  @predefined1
  Scenario: Predefined steps for Google
    Given I open url "https://google.com"
    Then I should see page title as "Google"
    And element with xpath "//*[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//*[@name='q']"
    And I click on element with xpath "(//input[@name='btnK'])[2]"
    And I wait for element with xpath "//*[@id='res']" to be present
    Then element with xpath "//*[@id='res']" should contain text "Cucumber"
  @predefined3
  Scenario: Wikipedia
    Given I open url "https://www.wikipedia.org/"
    Then I should see page title as "Wikipedia"
    Then element with xpath "//input[@id='searchInput']" should be present
    When I type "The Great Emu War" into element with xpath "//input[@id='searchInput']"
    Then I click on element using JavaScript with xpath "//i[@data-jsl10n='search-input-button']"
    Then element with xpath "//div[@id='bodyContent']" should contain text "Australia"

  @predefined4
  Scenario: Merriam-Webster Dictionary
    Given I open url "https://www.merriam-webster.com/"
    Then I wait for 2 sec
    Then I should see page title as "Merriam-Webster: America's Most Trusted Dictionary"
    Then I wait for 2 sec
    Then element with xpath "//input[@id='search-term'] " should be present
    Then I wait for 2 sec
    When I type "cantankerous" into element with xpath "//input[@id='search-term']"
    Then I wait for 2 sec
    Then I click on element using JavaScript with xpath "//button[@id='search-form-submit-btn']"
    Then I wait for 2 sec
    Then element with xpath "//div[@id='left-content']" should be present
    Then element with xpath "//div[@id='left-content']" should contain text "irritating"

  @predefined5
  Scenario: Cambridge Dictionary
    Given I open url "https://dictionary.cambridge.org/"
    Then I wait for 2 sec
    Then I should see page title as "Cambridge Dictionary | English Dictionary, Translations & Thesaurus"
    Then I wait for 2 sec
    Then element with xpath "//input[@name='q']" should be present
    Then I wait for 2 sec
    When I type "cantankerous" into element with xpath "//input[@name='q']"
    Then I wait for 2 sec
    Then I click on element using JavaScript with xpath "//button/i[@class='i i-search']"
    Then I wait for 2 sec
    Then element with xpath "//div[@data-id='cald4']" should be present
    Then element with xpath "//div[@data-id='cald4']" should contain text "arguing"






