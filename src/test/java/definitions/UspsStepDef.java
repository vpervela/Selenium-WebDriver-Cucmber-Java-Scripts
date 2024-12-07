package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;
import support.DriverFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class UspsStepDef {

    WebDriver driver = DriverFactory.getDriver();
    UspsAddressForm uspsAddressForm = new UspsAddressForm();
    UspsAddressResult uspsAddressResult = new UspsAddressResult();
    UspsPriorityMail uspsPriorityMail = new UspsPriorityMail();
    UspsSignIn uspsSignIn = new UspsSignIn();
    SearchResults searchResults = new SearchResults();


    @Given("I navigate to usps lookup a zip code by address page")
    public void iNavigateToUspsLookupAZipCodeByAddressPage() {
        uspsAddressForm.openURL();

    }

    @When("I fill out {string} company, {string} street, {string} city, {string} state")
    public void iFillOutCompanyStreetCity(String company, String streetAddress, String city, String state) {
        uspsAddressForm.fillOutAddressForm(company, streetAddress, city, state);
    }

    @And("I click Find button")
    public void iClickFindButton() {
        uspsAddressForm.clickFindButton();
    }

    @Then("I validate {string} zip code exists in the result")
    public void iValidateZipCodeExistsInTheResult(String zipCode) {
        uspsAddressResult.isZipCodeCorrect(zipCode);
    }

    @Given("I navigate to usps priority mail page")
    public void iNavigateToUspsPriorityMailPage() {
        uspsPriorityMail.openURL();
    }

    @When("I click Ship Now from priority mail page")
    public void iClickShipNowFromPriorityMailPage() {
        uspsPriorityMail.clickShipNow();
        uspsPriorityMail.switchToNewWindow();
    }

    @Then("I validate {string} message present")
    public void iValidateMessagePresent(String message) {
        assert  uspsSignIn.isMessagePresent(message);

    }


    @When("I hover over search and search for {string}")
    public void iHoverOverSearchAndSearchFor(String text) {
        uspsAddressForm.searchFor(text);
        
    }

    @And("I filter results with {string}")
    public void iFilterResultsWith(String filter) {
        searchResults.filterResults(filter);

        
    }

    @Then("I verify the displayed result count as {int}")
    public void iVerifyTheDisplayedResultCountAs(int count) {
//        assert searchResults.getResultCount() == count;
//        System.out.println("Count is: " + count);
        assertThat(searchResults.getResultCount()).isEqualTo(count);

    }
}
