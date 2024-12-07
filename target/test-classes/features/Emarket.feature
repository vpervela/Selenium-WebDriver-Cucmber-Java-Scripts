@emarket1
  Feature: Landing Page
Scenario: Landing Page
Given I navigate to eMarket Page
Then Verify Page Title is "E-Market – Automation Practice Website"
Then Verify Product Categories (Both)
Then Verify Cart Icon
Then Verify Filters

@emarket2
Scenario Outline: Landing Pagefdfdfd
Given I navigate to eMarket Page
When I click on <category> category
Then I verify we filter for <category> category
Examples:
| category |
| "Mac"    |
| "iPhone"    |
| "Watch"    |
| "Accessories"    |