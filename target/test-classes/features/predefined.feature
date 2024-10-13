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


  @predefined2
  Scenario: Predefined steps for Gibiru
    Given I open url "https://gibiru.com/"
    Then I should see page title contains "Gibiru"
    And element with xpath "//input[@name='q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name='q']"
    And I click on element with xpath "//button[@id='button-addon2']"
    And I wait for element with xpath "//div[@class='gsc-results gsc-webResult']" to be present
    Then element with xpath "//div[@class='gsc-results gsc-webResult']" should contain text "BDD"
    
    
  @predefined3
  Scenario: Verify search functionality for DuckDuckGo page
    Given I open url "https://duckduckgo.com/"
    Then I should see page title as "DuckDuckGo — Privacy, simplified."
    And element with xpath "//input[@id='searchbox_input']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id='searchbox_input']"
    And I click on element using JavaScript with xpath "//button[@aria-label='Search']"
    And I wait for 3 sec
    And I wait for element with xpath "//ol[@class='react-results--main']" to be present
    Then element with xpath "//ol[@class='react-results--main']" should contain text "BDD"



  @predefined4
  Scenario: Verify Search functionality for StartPage
    Given I open url "https://www.startpage.com"
    Then I should see page title contains "Startpage"
    And element with xpath "//input[@id = 'q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id = 'q']"
    And I click on element using JavaScript with xpath "//form[@id='search']//button[@aria-label='search button']"
    And I wait for 3 sec
    And I wait for element with xpath "//div[@class = 'w-gl']" to be present
    Then element with xpath "//div[@class = 'w-gl']" should contain text "BDD"


  @predefined5
  Scenario: Verify search functionality on SwissCows page
    Given I open url "https://swisscows.com"
    Then I should see page title contains "Swisscows"
    And element with xpath "//input[@name = 'query']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name = 'query']" and press Enter
    Then I wait for element with xpath "//div[@class='web-results content']" to be present
    Then element with xpath "//div[@class='web-results content']" should contain text "BDD"


  @predefined6
  Scenario: Verify cookie policy window functionality on SearchEncrypt page
    Given I open url "https://www.searchencrypt.com/"
    Then I should see page title as "Search Encrypt | Home"
    Then element with xpath "//div[@aria-label='Cookie Consent Prompt']" should be displayed
    And element with xpath "//button[contains(text(),'Accept')]" should be present
    And element with xpath "//button[contains(text(),'Decline')]" should be present
    And element with xpath "//button[contains(text(),'Preferences')]" should be present
    When I click on element with xpath "//button[contains(text(),'Accept')]"
    Then element with xpath "//div[@aria-label='Cookie Consent Prompt']" should not be present

  Scenario: Verify search functionality of SearchEncrypt page
    Given I open url "https://www.searchencrypt.com/"
    Then I should see page title as "Search Encrypt | Home"
    And element with xpath "//input[@name = 'q']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@name = 'q']"
    And I click on element using JavaScript with xpath "//button[@class = 'search-bar__submit']"
    And I wait for 3 sec
    And I wait for element with xpath "//section[@class = 'serp__results container']" to be present
    Then element with xpath "//section[@class = 'serp__results container']" should contain text "BDD"


  @predefined7
  Scenario: Verify search functionality on BoardReader page
    Given I open url "https://boardreader.com"
    Then I should see page title contains "Boardreader"
    And element with xpath "//input[@id = 'title-query']" should be present
    When I type "Behavior Driven Development" into element with xpath "//input[@id = 'title-query']"
    And I click on element using JavaScript with xpath "//button[@id='title-submit']"
    And I wait for 3 sec
    And I wait for element with xpath "//ul[@class = 'mdl-list']" to be present
    Then element with xpath "//ul[@class = 'mdl-list']" should contain text "Behavior"


  @predefined8
    Scenario: Verify search functionality on Ecosia page
        Given I open url "https://www.ecosia.org"
        Then I should see page title contains "Ecosia"
        And element with xpath "//input[@name='q']" should be present
        When I type "Behavior Driven Development" into element with xpath "//input[@name='q']"
        And I click on element using JavaScript with xpath "//button[@aria-label='Search']"
        And I wait for 3 sec
        And I wait for element with xpath "//main[@id = 'main']" to be present
        Then element with xpath "//main[@id = 'main']" should contain text "BDD"

