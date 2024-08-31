package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static support.DriverFactory.getDriver;

public class QuoteQAStepDefs {


    @Given("I open the url {string}")
    public void iOpenTheUrl(String url) {
        getDriver().get(url);
    }

    @Then("I verify the page title is {string}")
    public void iVerifyThePageTitleIs(String expectedTitle) {
        String actualTitle = getDriver().getTitle();
        assertThat(actualTitle).isEqualTo(expectedTitle);
    }

    @When("I click on the Name field")
    public void iClickOnTheNameField() {
        getDriver().findElement(By.xpath("//input[@id='name']")).click();
    }

    @Then("I see a new window")
    public void iSeeANewWindow() {
        WebDriver driver = getDriver(); // Get the WebDriver instance

        // Store the parent window handle
        String parentWindowHandle = driver.getWindowHandle();

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Switch to the new window
        for (String handle : allWindowHandles) {
            if (!handle.equals(parentWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }

    @When("I enter {string} and {string} into the Name fields")
    public void iEnterAndIntoTheNameFields(String firstName, String lastName) {

        // Locate the first name and last name fields in the new window
        getDriver().findElement(By.xpath("//input[@id='firstName']")).sendKeys("Tom");
        getDriver().findElement(By.xpath("//input[@id='lastName']")).sendKeys("Cruise");

    }


    @Then("I click on the Save button")
    public void iClickOnTheSaveButton() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Save')]")).click();

    }

    @And("I switch to the parent window")
    public void iSwitchToTheParentWindow() {
        String parentWindowHandle = getDriver().getWindowHandle();
        getDriver().switchTo().window(parentWindowHandle);
    }

    @And("I enter {string} into the Username field")
    public void iEnterIntoTheUsernameField(String arg0) {
        getDriver().findElement(By.xpath("//input[@ng-model='formData.username']")).sendKeys("Tom");
    }

    @And("I enter {string} into the Email field")
    public void iEnterIntoTheEmailField(String arg0) {
        getDriver().findElement(By.xpath("//input[@ng-model='formData.email']")).sendKeys("tomc@gmail.com");
    }

    @When("I enter {string} into the Password field")
    public void iEnterIntoThePasswordField(String arg0) {
        getDriver().findElement(By.xpath("//input[@ng-model='formData.password']")).sendKeys("Tom123");
    }

    @And("I enter {string} into the Confirm Password field")
    public void iEnterIntoTheConfirmPasswordField(String arg0) {
        getDriver().findElement(By.xpath("//input[@ng-model='formData.confirmPassword']")).sendKeys("Tom123");
    }

    @Then("I check the Privacy Policy checkbox")
    public void iCheckThePrivacyPolicyCheckbox() {
        getDriver().findElement(By.xpath("//input[@ng-model='formData.agreedToPrivacyPolicy']")).click();
    }

    @When("I click on the {string} button at the bottom of the page")
    public void iClickOnTheButtonAtTheBottomOfThePage(String arg0) {
        getDriver().findElement(By.xpath("//button[@id='formSubmit']")).click();
    }

    @Then("I verify we see the Submitted Application Page")
    public void iVerifyWeSeeTheSubmittedApplicationPage() {
        assertThat(getDriver().findElement(By.xpath("//input[@id='firstName']")).getAttribute("value").equals("Tom"));
        assertThat(getDriver().findElement(By.xpath("//input[@id='lastName']")).getAttribute("value").equals("Cruise"));
        assertThat(getDriver().findElement(By.xpath("//input[@ng-model='formData.name']")).getAttribute("value").equals("Tom Cruise"));
        assertThat(getDriver().findElement(By.xpath("//input[@ng-model='formData.username']")).getAttribute("value").equals("Tom"));
        assertThat(getDriver().findElement(By.xpath("//input[@ng-model='formData.email']")).getAttribute("value").equals("tomc@gmail.com"));



    }
}
