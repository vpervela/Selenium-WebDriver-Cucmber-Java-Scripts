package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CareersPage;
import pages.LoginPage;
import support.DriverFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class MyCareerStepDefs {

    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage();
    CareersPage careerPage = new CareersPage();



    @Given("I go to {string} page oop")
    public void iGoToPageOop(String pageName) {
        switch (pageName){
            case  "login":
                loginPage.openURL();
                break;
            case "careers":
                careerPage.openURL();
                break;
            default:
                throw new Error("Unknown page: " + pageName);
        }
    }

    @When("I click on {string} button")
    public void iClickOnButton(String buttonName) {
        switch (buttonName){
            case "login":
                careerPage.clickLoginButton();
                break;
            case "submit":
                loginPage.clickSubmitButton();
                break;
            default:
                throw new Error("Unknown button: " + buttonName);
        }
    }



    @And("I type {string} into username field and {string} into password field")
    public void iTypeIntoUsernameFieldAndIntoPasswordField(String username, String password) {
        loginPage.fillLoginDetails(username, password);
    }



    @Then("I should be logged in as a {string}")
    public void iShouldBeLoggedInAsA(String loggedUser) {
        assertThat(careerPage.getLoggedUser()).isEqualToIgnoringCase(loggedUser);
    }






}
