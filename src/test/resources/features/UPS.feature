@UPS
Feature: UPS Shipping Form Validation

    @UPS1
    Scenario: Validate UPS Shipping Form
        Given I navigate to ups shipment info page
        And I close the simplifiedShippingExperience window
        When I fill out required fields for shipment information
       # And I wait for 10 sec
        And I submit shipment form
       # And I wait for 10 sec
        Then I verify that required fields present on Shipper and Receiver details
       # And I wait for 2 sec
