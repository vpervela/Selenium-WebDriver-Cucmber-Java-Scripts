package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.UpsShipperResult;
import pages.UpsShippingForm;
import support.DriverFactory;

import static org.junit.Assert.assertTrue;


public class UpsStepDefs {

    WebDriver driver = DriverFactory.getDriver();

    UpsShippingForm upsShippingForm = new UpsShippingForm();
    UpsShipperResult upsShipperResult = new UpsShipperResult();



    @Given("I navigate to ups shipment info page")
    public void iNavigateToUpsShipmentInfoPage() {
        upsShippingForm.openURL();
    }

    @And("I close the simplifiedShippingExperience window")
    public void iCloseTheSimplifiedShippingExperienceWindow() {
        upsShippingForm.closeShippingModal();
        upsShippingForm.closeCookie();
    }

    @When("I fill out required fields for shipment information")
    public void iFillOutRequiredFieldsForShipmentInformation() throws InterruptedException {

        upsShippingForm.fillOutShippingForm();
        upsShippingForm.fillOutShipTo();
        upsShippingForm.fillOutPackaging();
    }

    @And("I submit shipment form")
    public void iSubmitShipmentForm() throws InterruptedException {
        upsShippingForm.submitShippingForm();
    }

    @Then("I verify that required fields present on Shipper and Receiver details")
    public void iVerifyThatRequiredFieldsPresentOnShipperAndReceiverDetails() {
        upsShipperResult.getShipperDetails();
        upsShipperResult.getReceiverDetails();
        //assert that shipper and receiver details are present on the page
        assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Shipper Details')]")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//div[@id = 'shippingSummaryOriginName']")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//div[@id = 'shippingSummaryOriginEmail']")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//div[@id = 'shippingSummaryOriginAddressLine1']")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//div[@id = 'shippingSummaryOriginCityStatePostalCode']")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//div[@id = 'shippingSummaryDestinationName']")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//div[@id = 'shippingSummaryDestinationAddressLine1']")).isDisplayed());
        assertTrue(driver.findElement(By.xpath("//div[@id = 'shippingSummaryDestinationCityStatePostalCode']")).isDisplayed());

    }
}
