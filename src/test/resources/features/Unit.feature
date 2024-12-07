@converter
  Feature: Unit Converter
Background:
Given I go to "converter" page

#@converter1
#Scenario: Validate Fahrenheit to Celsius
#When I click on "Temperature"
#And I set "Fahrenheit" to "Celsius"
#Then I enter into From field "54" and verify "12.2" result

#@converter2
#Scenario: Validate Pound to Kilogram
#When I click on "Weight"
#And I set "Pound" to "Kilogram"
#Then I enter into From field "170" and verify "77" result

    @converter1
    Scenario Outline: Validate Fahrenheit to Celsius
      When I click on <tab>
      And I set <unit1> to <unit2>
      Then I enter into From field <field> and verify <result> result
      Examples:
        | tab          | unit1        | unit2      | field | result  |
        | "Temperature" | "Fahrenheit" | "Celsius" | "54"  | "12.222222222" |
        | "Length" | "Kilometer" | "Mile" | "100"  | "62.136887563" |
        | "Weight" | "Kilogram" | "Pound" | "100"  | "220.46244202" |
