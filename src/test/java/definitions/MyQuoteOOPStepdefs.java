package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.QuoteForm;
import pages.QuotePOM;
import pages.QuoteResult;
import support.DriverFactory;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class MyQuoteOOPStepdefs {

    WebDriver driver = DriverFactory.getDriver();
    QuoteForm quoteForm = new QuoteForm();
    QuoteResult quoteResult = new QuoteResult();
    QuotePOM quotePOM = new QuotePOM();

    @Given("I navigate to {string} page oop")
    public void iNavigateToPageOop(String pageName) {
        //driver.get("https://skryabin.com/market/quote.html");
        switch (pageName) {
            case "quote":
                quoteForm.openURL();
                break;
            case "result":
                quoteResult.openURL();
                break;
            default:
                throw new Error("Unknown page: " + pageName);
        }
    }

    @When("I fill out the required fields on the form oop")
    public void iFillOutTheRequiredFieldsOnTheFormOop() {
        quoteForm.fillUsername("john doe");
        quoteForm.fillEmail("john.doe@example.com");
        quoteForm.fillPassword("Password123");
        quoteForm.fillName("John", "Doe");
        quoteForm.acceptPrivacyPolicy();
    }

    @And("I {string} third party agreement oop")
    public void iAcceptThirdPartyAgreementOop(String action) {
        if (action.equals("accept")) {
            quoteForm.acceptThirdPartyAgreement();
        } else if (action.equals("decline")) {
            quoteForm.declineThirdPartyAgreement();
        } else {
            throw new Error("Unknown action: " + action);
        }
    }

    @When("I type {string} into contact person name field and {string} into contact person phone field oop")
    public void iTypeIntoContactPersonNameFieldAndIntoContactPersonPhoneFieldOop(String contactName, String contactPhone) {
        quoteForm.fillContactPersonInfo(contactName, contactPhone);
    }

    @And("I submit the quote form oop")
    public void iSubmitTheQuoteFormOop() {
        quoteForm.clickSubmitButton();
    }

    @Then("I see required fields submitted successfully oop")
    public void iSeeRequiredFieldsSubmittedSuccessfullyOop() {
        String resultContainerText = quoteResult.getQuotePageResult();
        //validate quote submitted page  displayed 'Submitted Application'
        assertThat(resultContainerText).contains("Submitted Application");

        //validate username field
        String usernameText = quoteResult.getUserName();
        assertThat(usernameText).isNotNull().isEqualTo("john doe");

        //validate email field
        String emailText = quoteResult.getEmail();
        assertThat(emailText).isNotNull().isEqualTo("john.doe@example.com");

        //validate password field is not empty
        String passwordText = quoteResult.getPassword();
        assertThat(quoteResult.isPasswordNotEmpty()).isTrue();

        //validate firstname,lastname and name fields
        String nameText = quoteResult.getName();
        String firstNameText = quoteResult.getFirstName();
        String lastNameText = quoteResult.getLastName();

        assertThat(nameText).isNotNull().isEqualTo("John Doe");
        assertThat(firstNameText).isNotNull().isEqualTo("John");
        assertThat(lastNameText).isNotNull().isEqualTo("Doe");


        //validate agreement to privacy policy is selected;
        assertThat(quoteResult.isAgreedToPrivacyPolicySelected()).isTrue();


    }


    @Then("I verify third party agreement is {string} oop")
    public void iVerifyThirdPartyAgreementIsAcceptedOop(String action) {
        //assertThat(quoteResult.getThirdPartyAgreement()).isEqualTo(action);
        if (action.equals("accepted")) {
            assertThat(quoteResult.getThirdPartyAgreement()).isTrue();
        } else if (action.equals("declined")) {
            assertThat(quoteResult.getThirdPartyAgreement()).isFalse();

        } else {
            throw new Error("Unknown action: " + action);
        }
    }


    @And("I verify that contact person name is {string} and phone is {string} oop")
    public void iVerifyContactPersonNameIsAndPhoneIsOop(String contactName, String contactPhone) {
        //validate contact person name and phone
        assertThat(quoteResult.getContactPersonName()).isEqualTo(contactName);
        assertThat(quoteResult.getContactPersonPhone()).isEqualTo(contactPhone);
    }

    @Then("I verify that {string} present in related documents")
    public void iVerifyThatPresentInRelatedDocuments(String documentName) {
        //validate related documents
        assertThat(quoteForm.isRelatedDocumentPresent(documentName)).isTrue();
    }

    @Given("I navigate to quote page oop")
    public void iNavigateToQuotePageOop() {
        quotePOM.openQuoteForm();
    }

    @Then("I go to iframe oop")
    public void iGoToIframeOop() {
        quotePOM.goInsideIframe();
    }

    @And("I type contact person name {string} oop")
    public void iTypeContactPersonNameOop(String name) {
        quotePOM.typeContactPersonName(name);
    }

    @And("I type contact person phone {string} oop")
    public void iTypeContactPersonPhoneOop(String phone) {
        quotePOM.typeContactPersonPhone(phone);
    }

    @And("I go outside iframe oop")
    public void iGoOutsideIframeOop() {
        quotePOM.goOutOfIframe();
    }

    @And("I type name {string} oop")
    public void iTypeNameOop(String name) {
        quotePOM.typeName(name);
    }


}
