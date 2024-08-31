Feature: Search and Learn More about the iPhone 15 Pro

  Background As a Gadget Enthusiast,
  I want to learn more about the iPhone 15 Pro,
  so that I can decide if it fits my style and needs.

Scenario: Search for iPhone 15 Pro
  Given I open url "https://www.bestbuy.com/"
#  And I wait for 3 sec
  Then I should see page title as "Best Buy | Official Online Store | Shop Now & Save"
  And I wait for element with xpath "//input[@id='gh-search-input']" to be present
  When I type "iPhone 15 Pro" into element with xpath "//input[@id='gh-search-input']"
  And I wait for 4 sec
  And I click on element using JavaScript with xpath "//button[@title='submit search']"
  Then element with xpath "//a[contains(text(),'Apple - iPhone 15 Pro 256GB - Natural Titanium (AT')]" should be present
  When I click on element using JavaScript with xpath "//a[contains(text(),'Apple - iPhone 15 Pro 256GB - Natural Titanium (AT')]"
  And I wait for 4 sec
  Then I should see page title as "Apple iPhone 15 Pro 256GB Natural Titanium (AT&T) MTQU3LL/A - Best Buy"


